package lab5;

public class CommandLineArguments {
    public static void main(String[] args) {
        // Проверяем, есть ли аргументы командной строки
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки.");
        } else {
            System.out.println("Аргументы командной строки:");

            // Выводим каждый аргумент на экран
            for (int i = 0; i < args.length; i++) {
                System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
