package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Interfaces_And_Abstraction_Exercises.Collection_Hierarchy_07.Entities;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Interfaces_And_Abstraction_Exercises.Collection_Hierarchy_07.Interfaces.AddRemovable;
public class AddRemoveCollection extends Collection implements AddRemovable {

    public AddRemoveCollection(){
        super();
    }


    @Override
    public String remove() {
        return super.getItems().remove(super.getItems().size()-1);
    }

    @Override
    public int add(String str) {
        super.getItems().add(0,str);
        return 0;
    }
}
