package Ptactical_tasks.Task4;

public class Car {
    private String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public class Engine {
        private boolean isWorking = false;
        private int horsepower;

        public Engine(int horsepower) {
            this.horsepower = horsepower;
        }

        public String startStopEngine() {
            if(isWorking == true) {
                isWorking = false;
                return "engine was stopped";
            } else {
                isWorking = true;
                return "engine was started";
            }
        }
    }
}
