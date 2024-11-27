package Ptactical_tasks.Task3;

public class Mouse implements Movable, Edible {

    @Override
    public void move() {
        System.out.println("Mouse is running");
    }

    @Override
    public void beEaten() {
        System.out.println("Mouse was eating");
    }
}
