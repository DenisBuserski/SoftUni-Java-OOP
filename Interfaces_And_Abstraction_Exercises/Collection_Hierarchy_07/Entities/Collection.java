package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Interfaces_And_Abstraction_Exercises.Collection_Hierarchy_07.Entities;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private  int maxSize;
    private List<String> items;

    protected Collection() {
        this.items = new ArrayList<>();
        this.maxSize = 100;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<String> getItems() {
        return items;
    }
}
