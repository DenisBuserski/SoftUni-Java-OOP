package Interfaces_And_Abstraction_Lab.Border_Control_05;

public class Citizen implements Identifiable {
    private String name;
    private int age;
    private String id;

    public Citizen(String name, int age, String id) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getId() {
        return this.id;
    }
    
}
