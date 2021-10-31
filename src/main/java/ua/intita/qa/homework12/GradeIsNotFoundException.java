package ua.intita.qa.homework12;

public class GradeIsNotFoundException extends Exception{
    public int[] getEvaluation() {
        return evaluation;
    }

    private int[] evaluation;

    public GradeIsNotFoundException() {
    }

    public GradeIsNotFoundException(String message) {
        super(message);
    }

    public GradeIsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradeIsNotFoundException(Throwable cause) {
        super(cause);
    }

    public GradeIsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
