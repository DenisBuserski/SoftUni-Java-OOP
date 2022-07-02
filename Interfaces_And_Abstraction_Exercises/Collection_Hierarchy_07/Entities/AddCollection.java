package Interfaces_And_Abstraction_Exercises.Collection_Hierarchy_07.Entities;

import Interfaces_And_Abstraction_Exercises.Collection_Hierarchy_07.Interfaces.Addable;

public class AddCollection extends Collection implements Addable {
    private int index = 0;

    public AddCollection() {
        super();
    }

    @Override
    public int add(String str) {
        super.getItems().add(str);
        return index++;
    }

}
