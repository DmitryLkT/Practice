package Ptactical_tasks.Task4;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        Car.Engine motor =  bmw.new Engine(1050);

        System.out.println(motor.startStopEngine());
        System.out.println(motor.startStopEngine());
        System.out.println(motor.startStopEngine());
    }
}
