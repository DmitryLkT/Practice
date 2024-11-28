package Ptactical_tasks.Task7;

public class Plane extends Transport {
    public Plane(int fuel, int speed) {
        super(fuel, speed);
    }

    public int getFuelLevel() {
        return fuel;
    }

    public boolean canMove(int n) {
        if(fuel >= n) {
            fuel -= n;
            return true;
        } else {
            return false;
        }
    }

    public void fillFuel(int n) {
        fuel += n;
    }
}
