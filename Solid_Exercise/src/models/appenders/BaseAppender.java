package models.appenders;

import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Solid.Logger_SOLID.enums.ReportLevel;
import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Solid.Logger_SOLID.interfaces.Appender;
import JAVA_DEVELOPMENT_SOFTUNI.Java_Development.Java_Advanced.Java_OOP.Java_OOP_Exercises.Solid.Logger_SOLID.interfaces.Layout;

public abstract class BaseAppender implements Appender {
    private Layout layout;
    private ReportLevel reportLevel;
    private int messageAppendedCount;

    public BaseAppender (Layout layout) {
        this.layout = layout;
        this.reportLevel = ReportLevel.INFO;
        this.messageAppendedCount = 0;
    }

    @Override
    public void appendMessage(String dateTime, ReportLevel reportLevel, String message) {
        if (reportLevel.ordinal() >= this.reportLevel.ordinal()) {
            String result = String.format(this.layout.getLayout(), dateTime, reportLevel.toString(), message);
            this.append(result);
            this.messageAppendedCount++;
        }
    }

    protected abstract void append(String text);

    @Override
    public void setReportLevel(ReportLevel reportLevel) {
        this.reportLevel = reportLevel;
    }


    @Override
    public String toString() {
        return String.format
                ("Appender type: %s, Layout type: %s, Report level: %s, Messages appended: %d",
                        this.getClass().getSimpleName(),
                        this.layout.getClass().getSimpleName(),
                        this.reportLevel.toString(),
                        this.messageAppendedCount);
    }
}
