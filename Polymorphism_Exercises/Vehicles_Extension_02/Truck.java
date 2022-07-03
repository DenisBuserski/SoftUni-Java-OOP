package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Vehicles_Extension_02;

public class Truck extends Vehicle {

    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuel, double consumption, double tankCapacity) {

        super(fuel, consumption + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }

}
