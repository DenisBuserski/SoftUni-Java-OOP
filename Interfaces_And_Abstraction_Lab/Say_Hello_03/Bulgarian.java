package Interfaces_And_Abstraction_Lab.Say_Hello_03;

public class Bulgarian implements Person {
    private String name;

    public Bulgarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
    
}
