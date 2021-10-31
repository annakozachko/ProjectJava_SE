package ua.intita.qa.homework12;

public class LackOfStudentsInTheGroupException extends Exception{
    private String group;
    private int AmountOfStudent;

    public int getAmountOfStudent() {
        return AmountOfStudent;
    }

    public void setAmountOfStudent(int amountOfStudent) {
        AmountOfStudent = amountOfStudent;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
    public LackOfStudentsInTheGroupException() {
    }

    public LackOfStudentsInTheGroupException(String message) {
        super(message);
    }

    public LackOfStudentsInTheGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfStudentsInTheGroupException(Throwable cause) {
        super(cause);
    }

    public LackOfStudentsInTheGroupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
