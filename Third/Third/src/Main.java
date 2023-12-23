public class Main {

    public static void main(String[] args) {
        // Логические операторы && || !
        boolean a = true;
        boolean b = false;

        System.out.println("Логическое И: " + (a && b));  // false
        System.out.println("Логическое ИЛИ: " + (a || b));  // true
        System.out.println("Логическое НЕ: " + !a);  // false

        // Тернарная операция x < y ? x : y
        int x = 5;
        int y = 10;
        int result = (x < y) ? x : y;
        System.out.println("Тернарная операция: " + result);  // 5

        // Поразрядные логические операторы & | ^ ~
        int num1 = 7;  // 0111 в двоичной системе
        int num2 = 3;  // 0011 в двоичной системе

        System.out.println("Поразрядное И: " + (num1 & num2));  // 3
        System.out.println("Поразрядное ИЛИ: " + (num1 | num2));  // 7
        System.out.println("Поразрядное исключающее ИЛИ: " + (num1 ^ num2));  // 4
        System.out.println("Поразрядное НЕ для num1: " + (~num1));  // -8

        // Операции сдвига >> << >>>
        int value = 8;  // 1000 в двоичной системе
        System.out.println("Сдвиг вправо на одну позицию: " + (value >> 1));  // 4
        System.out.println("Сдвиг влево на одну позицию: " + (value << 1));  // 16
        System.out.println("Сдвиг вправо с заполнением нулями: " + (value >>> 1));  // 4
    }
}