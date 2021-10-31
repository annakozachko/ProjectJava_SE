package ua.intita.qa.homework12;

public class LackOfFacultiesInTheUniversityException extends Exception{
    private String[] faculty;
    private String University;

    public LackOfFacultiesInTheUniversityException(String[] faculty, String university) {
        this.faculty = faculty;
        University = university;
    }

    public LackOfFacultiesInTheUniversityException(String message, String[] faculty, String university) {
        super(message);
        this.faculty = faculty;
        University = university;
    }

    public LackOfFacultiesInTheUniversityException(String message, Throwable cause, String[] faculty, String university) {
        super(message, cause);
        this.faculty = faculty;
        University = university;
    }

    public LackOfFacultiesInTheUniversityException() {

    }

    public String[] getFaculty() {
        return faculty;
    }

    public void setFaculty(String[] faculty) {
        this.faculty = faculty;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {
        University = university;
    }
}
