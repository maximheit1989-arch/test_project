package task_01;

public class Main {

    public static void main(String[] args) {

        // Создаём объекты
        Car car1 = new Car("Toyota", "red", 2005, 170);
        Car car2 = new Car("Mazda", "black", 2007, 180);
        Car car3 = new Car("Nissan", "blue", 2004, 170);

        // Вызываем методы
        printInfo(car1);
        printInfo(car2);
        printInfo(car3);

        System.out.println();

        // Вызываем методы
        printSpeed(car1);
        printSpeed(car2);
        printSpeed(car3);

    }


    // Создаём метод вывода информации
    public static void printInfo(Car car){
        System.out.println("Модель - " + car.getModel() + ", цвет - " + car.getColor() + ", год - " + car.getYear());
    }

    // Создаём метод вывода скорости
    public static void printSpeed(Car car){
        System.out.println("Максимальная скорость - " + car.getSpeed());
    }
}
