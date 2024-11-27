package Ptactical_tasks.Task3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.move();
        cat.eat();
        cat.beEaten();

        System.out.println("------------");

        Dog dog = new Dog();
        dog.move();
        dog.eat();

        System.out.println("------------");

        Mouse mouse = new Mouse();
        mouse.move();
        mouse.beEaten();
    }
}
