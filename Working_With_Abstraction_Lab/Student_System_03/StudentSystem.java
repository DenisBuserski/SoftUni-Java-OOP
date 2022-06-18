package JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Working_With_Abstraction_Lab.Student_System_03;

//import Java_OOP.Java_OOP_Exercises.Working_With_Abstraction_Lab.Point_In_Rectangle_02.Input.Reader;

import static JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Working_With_Abstraction_Lab.Student_System_03.ConsolePrinter.printLine;

public class StudentSystem {

    private CommandHandler handler;
    private boolean isWorking;

    public StudentSystem() {
        this.handler = new CommandHandler();

    }

    public void start() {

        this.isWorking = true;
        while (isWorking) {
            String result = handler.handleCommand(Reader.readStringArray("\\s+"));

            if (result != null && !result.equals("Exit")) {
                printLine(result);
            }
            isWorking = !"Exit".equals(result);

        }

    }
}

