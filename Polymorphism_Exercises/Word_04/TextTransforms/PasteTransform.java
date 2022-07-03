package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Polymorphism_Exercises.Word_04.TextTransforms;

public class PasteTransform implements TextTransform {
    private CutTransform cutTransform;

    public PasteTransform(CutTransform cutTransform) {
        this.cutTransform = cutTransform;
    }

    @Override
    public void invokeOn(StringBuilder text, int startIndex, int endIndex) {
        text.replace(startIndex, endIndex, this.cutTransform.getLastCut().toString());

    }
}
