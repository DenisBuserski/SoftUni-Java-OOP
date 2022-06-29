package Interfaces_And_Abstraction_Lab.Say_Hello_Extended_04;

public class Bulgarian extends BasePerson implements Person {

    public Bulgarian(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Здравей";
    }
    
}
