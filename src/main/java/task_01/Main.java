package task_01;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "red", 2005);
        Car car2 = new Car("Mazda", "black", 2007);
        Car car3 = new Car("Nissan", "blue", 2004);

        printInfo(car1);
        printInfo(car2);
        printInfo(car3);
    }

    public static void printInfo(Car car) {
        System.out.println("Модель - " + car.getModel() + ", цвет - " + car.getColor() + ", год - " + car.getYear());
    }
}
