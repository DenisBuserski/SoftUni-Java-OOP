package Interfaces_And_Abstraction_Lab.Say_Hello_03;

public class Chinese implements Person {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
    
}
