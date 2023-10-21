class StringMethodsDemo {
    public static void main(String[] args) {
        // Создание строк
        String str1 = "Пример строки";
        String str2 = new String("Ещё одна строка");

        // Сравнение строк
        boolean areEqual = str1.equals(str2); // Сравнение содержимого
        boolean areSame = (str1 == str2); // Сравнение ссылок

        System.out.println("Строки равны по содержимому: " + areEqual);
        System.out.println("Строки одинаковые по ссылке: " + areSame);

        // Получение длины строки
        int length = str1.length();
        System.out.println("Длина строки str1: " + length);

        // Соединение строк
        String concatenated = str1 + " " + str2;
        System.out.println("Соединенные строки: " + concatenated);



        // Замена символов
        String replaced = str1.replace('о', 'а');
        System.out.println("Замененная строка: " + replaced);



        // Удаление начальных и конечных пробелов
        String withSpaces = "   Пробелы в начале и конце   ";
        String trimmed = withSpaces.trim();
        System.out.println("Строка без пробелов: " + trimmed);
    }
}


