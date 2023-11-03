import java.util.Scanner;

class WordScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите произвольное число слов (разделенных пробелами):");
        while (scanner.hasNext()) {
            if (scanner.hasNext()) {
                String word = scanner.next();
                System.out.println("Слово: " + word);
            } else {
                break;
            }
        }

        scanner.close();
    }
}