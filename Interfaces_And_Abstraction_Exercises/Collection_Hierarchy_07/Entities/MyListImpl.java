package Interfaces_And_Abstraction_Exercises.Collection_Hierarchy_07.Entities;

import Interfaces_And_Abstraction_Exercises.Collection_Hierarchy_07.Interfaces.MyList;

public class MyListImpl  extends Collection implements MyList {
    
    @Override
    public int getUsed() {
        return super.getItems().size();
    }

    @Override
    public String remove() {
        return super.getItems().remove(0);
    }

    @Override
    public int add(String str) {
        super.getItems().add(0,str);
        return 0;
    }
    
}
