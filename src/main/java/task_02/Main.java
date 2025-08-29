package task_02;

public class Main {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Попугай", "синий", 4);
        Animal animal2 = new Animal("Кошка", "чёрная", 3);
        Animal animal3 = new Animal("Собака", "серая", 5);

        printInfo(animal1);
        printInfo(animal2);
        printInfo(animal3);

    }

    public static void printInfo(Animal animal) {
        System.out.println("Животное - " + animal.getName() + ", цвет - " + animal.getColor() + ", возраст - " + animal.getAge());
    }
}
