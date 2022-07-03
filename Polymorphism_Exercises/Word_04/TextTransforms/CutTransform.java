package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Word_04.TextTransforms;

public class CutTransform implements TextTransform {
    private StringBuilder lastCut;

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        this.lastCut = new StringBuilder();
        lastCut.append(text, startIndex, endIndex);
        text.delete(startIndex, endIndex);
    }

    public StringBuilder getLastCut() {
        return this.lastCut;
    }
}
