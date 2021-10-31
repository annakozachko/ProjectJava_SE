package ua.intita.qa.homework12;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] subjects = {"HistoryOfUkraine", "BasicsOfArcheology", "BasicsOfEthnology", "Math", "Algebra", "Geometry"};
        int[] evaluation1 = {8, 5, 5, 9, 5, 9};
        int[] evaluation2 = {9, 9, 5, 5, 8, 8};
        int[] evaluation3 = {7, 8, 7, 8, 5, 4};
        int[] evaluation4 = {9, 4, 7, 5, 8, 9};
        int[][] eval = {evaluation1, evaluation2, evaluation3, evaluation4};

        Student[] students = new Student[4];
        students[0] = new Student(22, "HIS", "Historical", "Bondar", "Oleg", evaluation1, subjects);
        students[1] = new Student(12, "MATH", "Mathematical", "Gysyl", "Anna", evaluation2, subjects);
        students[2] = new Student(12, "MATH", "Mathematical", "Petrova", "Alla", evaluation3, subjects);
        students[3] = new Student(22, "HIS", "Historical", "Gonchar", "Irina", evaluation4, subjects);


        float average = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5;j++) {
                average = average + eval[i][j];
            }
            average /= 6;
            //System.out.println("Average evaluation: " + average + students[i].getName());
            System.out.println(students[i].getSurname() + " " + students[i].getName() + " " + "has an average score" +" " + average);
        }
        String[] nameOfGroup = {"HIS", "MATH"};
        String[] nameOfFaculty = {"Historical", "Mathematical"};

        String perFac = "Historical";
        String perGroup = "His";
        String perSub = "HistoryOfUkraine";

        float avg = 0;
        int kol = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (
                        ((students[i].getnameOfFaculty().equals(perFac)))
                                && (students[i].getNameOfGroup().equals(perGroup))
                                && (students[i].getSubject().equals(perSub))
                ) {
                    avg = avg + eval[i][j];
                    kol++;
                }

            }
        }
        avg = avg/kol;


                System.out.println("An average score" + " " + students[0].getSubject() + " " + students[0].getNameOfGroup() + " " + students[0].getnameOfFaculty() + "" + " " + "is" + " " + avg);

        System.out.println();
        Methods.printAllSubjects(subjects);

        //Methods.midGrade();


        Checking c = new Checking();
        try {
            c.GetEvaluation(evaluation1);
        }catch (GradeIsNotFoundException e){
            System.out.println("There is no such assessment");
            e.printStackTrace();
        }

        try {
        c.CheckSubjects (amountOfStudent);
        }catch (LackOfItemsException e){
            System.out.println("Lack of subjects for the student");
        }
        try {
              c.studentsInAGroup(5);
            //c.studentsInAGroup(0);

        }catch(LackOfStudentsInTheGroupException e) {
            System.out.println("There are no students in this group" + e.getAmountOfStudent());
            e.printStackTrace();
        }


        try {
            c.studentsInAFaculty(0);
        }catch (LackOfStudentsInTheFacultyException e) {
            System.out.println("There are no students in this group "+ e.getStudents());
            e.printStackTrace();
        }


        try {
            c.facultiesInTheUniversity("HIS");
        } catch (LackOfFacultiesInTheUniversityException e) {
            System.out.println("There are no faculty in the University"+ e.getFaculty());
            e.printStackTrace();
        }
    }

}













