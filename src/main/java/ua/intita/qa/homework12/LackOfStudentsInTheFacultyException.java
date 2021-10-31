package ua.intita.qa.homework12;

public class LackOfStudentsInTheFacultyException extends Exception {
    private String[] faculty;

    public String[] getStudents() {
        return students;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }

    private String[] students;

    public LackOfStudentsInTheFacultyException() {
    }

    public LackOfStudentsInTheFacultyException(String message) {
        super(message);
    }

    public LackOfStudentsInTheFacultyException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfStudentsInTheFacultyException(Throwable cause) {
        super(cause);
    }

    public LackOfStudentsInTheFacultyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
