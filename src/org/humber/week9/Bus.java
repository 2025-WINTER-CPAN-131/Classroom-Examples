package org.humber.week9;

public class Bus extends Vehicle {

    public Bus() {
        System.out.println("Bus is created");
    }

    @Override
    public void accelerate() {
        System.out.println("Bus is accelerating");
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.accelerate();
        bus.brake();
    }
}
