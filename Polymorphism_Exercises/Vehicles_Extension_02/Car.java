package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Vehicles_Extension_02;

public class Car extends Vehicle {

    private static final double AIR_CONDITIONER_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuel, double consumption, double tankCapacity) {

        super(fuel, consumption + AIR_CONDITIONER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }
}
