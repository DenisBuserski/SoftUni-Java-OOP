package Interfaces_And_Abstraction_Lab.Say_Hello_Extended_04;

public class European extends BasePerson implements Person {

    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
    
}
