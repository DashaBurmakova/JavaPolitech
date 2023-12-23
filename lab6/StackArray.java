package lab6;

public class StackArray {

    private static final int MAX_SIZE = 10;
    private int[] stackArray;
    private int top;

    public StackArray() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value;
            System.out.println("Добавлен элемент: " + value);
        } else {
            System.out.println("Стек полон. Невозможно добавить элемент.");
        }
    }

    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Извлечен элемент: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Стек пуст. Невозможно извлечь элемент.");
            return -1; // Значение, которое используется для обозначения ошибки (в данном случае стек пуст)
        }
    }

    public int peek() {
        if (top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Стек пуст. Невозможно получить вершину стека.");
            return -1; // Значение, которое используется для обозначения ошибки (в данном случае стек пуст)
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Вершина стека: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Стек пуст? " + stack.isEmpty());
    }
}
