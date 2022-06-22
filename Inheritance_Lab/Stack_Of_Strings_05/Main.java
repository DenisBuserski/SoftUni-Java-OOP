package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Inheritance_Lab.Stack_Of_Strings_05;

public class Main {
    public static void main(String[] args) {

        StackOfStrings sos = new StackOfStrings();
        sos.push("one");
        sos.push("tow");
        sos.push("three");

        System.out.println(sos.isEmpty());
        System.out.println(sos.peek());

        System.out.println(sos.pop());
        System.out.println(sos.pop());
        System.out.println(sos.pop());
    }
}
