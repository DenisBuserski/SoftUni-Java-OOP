package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Solid.solidLab.p02_OpenClosedPrinciple.p01_FileStream;

public class Progress {
    private final File file;

    public Progress(File file)
    {
        this.file = file;
    }

    public int getCurrentPercent()
    {
        return this.file.getSent() * 100 / this.file.getLength();
    }
}
