package Auto;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса Car
        Car myCar = new Car();

        // Заполняем поля
        myCar.color = "Red";
        myCar.speed = 100;

        // Вызываем действие
        myCar.drive();
    }
}
