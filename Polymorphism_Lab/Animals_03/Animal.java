package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Animals_03;

public class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String explainSelf() {
        return String.format("I am %s and my favorite food is %s", this.name, this.favouriteFood);
    }
}