package Ptactical_tasks.Task3;

public class Dog implements Movable, Eat {

    @Override
    public void move() {
        System.out.println("Dog is running");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }
}
