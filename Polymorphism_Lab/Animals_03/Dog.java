package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Animals_03;

public class Dog extends Animal {
    public Dog(String name, String favoriteFood) {
        super(name,favoriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("%s%nDJAAF",super.explainSelf());
    }
}
