package Ptactical_tasks.Task7;

public class Car extends Transport {
     int maxPassengers;

    public Car(int fuel, int speed, int  maxPassengers) {
        super(fuel, speed);
        this.maxPassengers = maxPassengers;
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

    public int getMaxPassengers() {
        return maxPassengers;
    }
}
