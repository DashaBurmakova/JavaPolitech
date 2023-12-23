package lab8;
import java.lang.reflect.*;

public class ClassInfoExample {
    public static void printClassInfo(Class<?> clazz) {
        // Выводим информацию о классе
        System.out.println("Информация о классе: " + clazz.getName());

        // Выводим информацию о полях класса
        System.out.println("\nПоля класса:");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Имя поля: " + field.getName());
            System.out.println("Тип поля: " + field.getType().getName());
            System.out.println();
        }

        // Выводим информацию о методах класса
        System.out.println("\nМетоды класса:");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Имя метода: " + method.getName());
            System.out.println("Возвращаемый тип: " + method.getReturnType().getName());

            // Выводим информацию о параметрах метода
            Parameter[] parameters = method.getParameters();
            System.out.print("Параметры метода: ");
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + ", ");
            }
            System.out.println("\n");
        }

        // Выводим информацию о конструкторах класса
        System.out.println("\nКонструкторы класса:");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Имя конструктора: " + constructor.getName());

            // Выводим информацию о параметрах конструктора
            Parameter[] parameters = constructor.getParameters();
            System.out.print("Параметры конструктора: ");
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + ", ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        // Пример использования метода с классом String
        printClassInfo(String.class);
    }
}
