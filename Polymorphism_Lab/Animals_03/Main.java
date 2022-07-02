package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Lab.Animals_03;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Oscar", "Whiskas");
        Animal dog = new Dog("Rocky", "Meat");
        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());
    }

}
