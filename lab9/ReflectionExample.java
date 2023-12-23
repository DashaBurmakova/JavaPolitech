package lab9;
import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) {
        try {
            // Получаем информацию о классе по его имени
            Class<?> myClass = Class.forName("lab9.SampleClass");

            // Создаем экземпляр класса, предполагая, что у класса есть конструктор без параметров
            Object instance = myClass.getDeclaredConstructor().newInstance();

            // Получаем метод по его имени
            Method method = myClass.getDeclaredMethod("myMethod");

            // Вызываем метод для созданного экземпляра
            method.invoke(instance);

        } catch (ClassNotFoundException e) {
            System.out.println("Класс не найден: " + e);
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Ошибка при вызове метода: " + e);
        }
    }
}