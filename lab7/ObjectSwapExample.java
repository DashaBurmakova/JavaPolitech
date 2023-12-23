package lab7;

public class ObjectSwapExample {
    public static void main(String[] args) {
     // Создаем объекты

     MyClass obj1 = new MyClass(5);
     MyClass obj2 = new MyClass(10);

     // Выводим значения до обмена
     System.out.println("Значения до обмена:");
     System.out.println("obj1: " + obj1.getValue());
     System.out.println("obj2: " + obj2.getValue());

     // Вызываем метод для обмена значениями
     swapValues(obj1, obj2);

     // Выводим значения после обмена
     System.out.println("\nЗначения после обмена:");
     System.out.println("obj1: " + obj1.getValue());
     System.out.println("obj2: " + obj2.getValue());
 }

 // Метод для обмена значениями между объектами
 public static void swapValues(MyClass objA, MyClass objB) {
     int temp = objA.getValue();
     objA.setValue(objB.getValue());
     objB.setValue(temp);
 }

 // Пример класса, объекты которого будут обмениваться значениями
 static class MyClass {
     private int value;

     public MyClass(int value) {
         this.value = value;
     }

     public int getValue() {
         return value;
     }

     public void setValue(int value) {
         this.value = value;
     }
 }
}
