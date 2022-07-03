package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Wild_Farm_03.Animals;


import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Wild_Farm_03.Foods.Food;
import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Wild_Farm_03.Foods.Meat;

public class Zebra extends Mammal {

    public Zebra(String animalName, String type, double weight, String livingRegion) {
        super(animalName, type, weight, livingRegion);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
        }
        super.eat(food);
    }


    @Override
    public void makeSound() {
        System.out.println("Zs");
    }
}
