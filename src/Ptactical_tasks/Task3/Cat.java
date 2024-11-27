package Ptactical_tasks.Task3;

public class Cat implements Movable, Edible, Eat {

    @Override
    public void move() {
        System.out.println("Cat is running");
    }

    @Override
    public void beEaten() {
        System.out.println("Cat was eating");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }
}
