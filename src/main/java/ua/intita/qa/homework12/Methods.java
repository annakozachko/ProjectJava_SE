package ua.intita.qa.homework12;

public class Methods {


    private static int[] numbers;
    float sum = 0;
    int grade = 0;
    int[] grades = {10, 5, 8, 9};
    private static String[] subjects = {"HistoryOfUkraine", "BasicsOfArcheology", "BasicsOfEthnology", "Math", "Algebra", "Geometry"};


    public static void printAllSubjects(String[] subjects) {
        System.out.print(" ");
        for (String num : subjects) {
            System.out.print(num + "   ");
        }
        System.out.println();
    }

//    public static void midGrade() {
//        int grade = 0;
//        int[] grades = {10, 5, 8, 9};
//        for (String num : subjects) {
//            grade = num + grade;
//        }
//        //return ((double) grade / numbers.length);


    }


    

