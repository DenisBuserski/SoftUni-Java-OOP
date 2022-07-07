package interfaces;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Solid.Logger_SOLID.enums.ReportLevel;

public interface Appender {

    void appendMessage(String dateTime, ReportLevel reportLevel, String message);

    void setReportLevel(ReportLevel reportLevel);
}
