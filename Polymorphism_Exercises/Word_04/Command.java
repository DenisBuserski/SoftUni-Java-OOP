package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Word_04;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Word_04.TextTransforms.TextTransform;

public class Command {
    private String text;
    private TextTransform textTransform;

    public Command(String text, TextTransform textTransform){
        this.text = text;
        this.textTransform = textTransform;
    }
    public String getText() {
        return this.text;
    }

    public TextTransform getTextTransform() {
        return this.textTransform;
    }

}
