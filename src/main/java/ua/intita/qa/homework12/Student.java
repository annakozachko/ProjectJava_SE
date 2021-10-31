package ua.intita.qa.homework12;

import java.util.Arrays;

public class Student extends Group {

    private String Surname;
    private String Name;
    private int[] evaluation;
    private String[] Subject;

    public Student(int number, String nameOfGroup, String nameOfFaculty, String Surname, String Name, int[] evaluation, String[] Subject) {
        super(nameOfFaculty, number, nameOfGroup);
        this.Surname = Surname;
        this.Name = Name;
        this.evaluation = evaluation;
        this.Subject = Subject;
    }

    public  String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int[] getEvaluation() throws GradeIsNotFoundException {
        if(evaluation.length<=0 || evaluation.length>10){
        throw new GradeIsNotFoundException("There is no such assessment");
        }
        return evaluation;
    }

    public void setEvaluation(int[] evaluation) {
        this.evaluation = evaluation;
    }

    public String[] getSubject() {
        return Subject;
    }

    public void setSubject() throws LackOfItemsException {
        if(Subject.length<1){
            throw new LackOfItemsException("Lack of subjects for the student");

        }
        Subject = Subject;
    }


//        float average = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 5; j++) {
//                average = average + eval[i][j];
//            }
//            average /= 6;
//            //System.out.println("Average evaluation: " + average + students[i].getName());
//            System.out.println(students[i].getSurname() + " " + students[i].getName() + " " + "has an average score" + " " + average);
//        }


    }

