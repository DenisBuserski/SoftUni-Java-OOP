package models.layouts;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Solid.Logger_SOLID.interfaces.Layout;

public class SimpleLayout implements Layout {

    @Override
    public String getLayout() {
        return "%s - %s - %s";
    }
}
