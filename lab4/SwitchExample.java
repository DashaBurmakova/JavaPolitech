package lab4;

public class SwitchExample {

    public static void main(String[] args) {
        int option = 2;

        switch (option) {
            case 1:
                System.out.println("Выбран вариант 1");
                break;
            case 2:
                System.out.println("Выбран вариант 2");
                break;
            case 3:
                System.out.println("Выбран вариант 3");
                break;
            default:
                System.out.println("Неверный вариант");
        }

        
        String choice = "two";

        switch (choice) {
            case "one":
                System.out.println("Выбран вариант one");
                break;
            case "two":
                System.out.println("Выбран вариант two");
                break;
            case "three":
                System.out.println("Выбран вариант three");
                break;
            default:
                System.out.println("Неверный вариант");
        }

        // Пример с использованием enum
        DayOfWeek day = DayOfWeek.MONDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Понедельник");
                break;
            case TUESDAY:
                System.out.println("Вторник");
                break;
            // ... остальные дни недели
            default:
                System.out.println("Неизвестный день");
        }
    }

    // Пример enum
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
