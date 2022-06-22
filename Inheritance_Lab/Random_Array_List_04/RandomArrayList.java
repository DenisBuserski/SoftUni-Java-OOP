package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Inheritance_Lab.Random_Array_List_04;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList<Object> {

    public Object getRandomElement() {
        int index = new Random().nextInt(super.size());
        return super.get(index);
    }
}
