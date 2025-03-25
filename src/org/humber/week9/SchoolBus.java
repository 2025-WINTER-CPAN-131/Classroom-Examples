package org.humber.week9;

public class SchoolBus extends Bus {

    public SchoolBus() {
        System.out.println("SchoolBus is created");
    }

    @Override
    public void accelerate() {
        System.out.println("School Bus is accelerating");
    }

    public void stop() {
        System.out.println("SchoolBus is stopping");
    }

    public static void main(String[] args) {
        Bus schoolBus = new SchoolBus();
        printVehicle(schoolBus);

        SchoolBus schoolBus1 = (SchoolBus) schoolBus;
        schoolBus1.stop();
    }

    private static void printVehicle(Vehicle vehicle) {
        vehicle.accelerate();
        vehicle.brake();
    }

}
