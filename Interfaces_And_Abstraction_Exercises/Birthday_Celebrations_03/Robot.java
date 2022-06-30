package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Interfaces_And_Abstraction_Exercises.Birthday_Celebrations_03;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String id, String model) {
        this.id = id;
        this.model = model;
    }

    public String getId() {
        return this.id;
    }

    public String getModel() {
        return this.model;
    }
}
