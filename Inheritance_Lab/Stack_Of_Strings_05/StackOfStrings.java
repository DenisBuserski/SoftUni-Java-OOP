package Inheritance_Lab.Stack_Of_Strings_05;

import java.util.ArrayList;

public class StackOfStrings {
    private ArrayList<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String  element) { //add
        this.data.add(element);
    }

    public String pop() {
        return this.data.remove(data.size() - 1);
    }

    public String peek() {
        return this.data.get(0);
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
