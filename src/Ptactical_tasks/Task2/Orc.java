package Ptactical_tasks.Task2;

public class Orc implements Playable {

    @Override
    public String move() {
        return "run";
    }

    @Override
    public String attack() {
        return "blow";
    }

    @Override
    public String defence() {
        return "block";
    }

}
