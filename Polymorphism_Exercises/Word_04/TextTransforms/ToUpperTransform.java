package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Word_04.TextTransforms;

public class ToUpperTransform implements TextTransform {
    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            text.setCharAt(i, Character.toUpperCase(text.charAt(i)));
        }
    }
}