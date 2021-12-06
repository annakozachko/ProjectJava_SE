package ua.intita.qa.homework17.taskStudent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    private static Object List;
    private static Object ArrayList;

    public static java.util.List<Student> main(String[] args) {

        //ArrayList<Student> students = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        Student students1 = new Student("Anna", "History", 3, 5);
        Student students2 = new Student("Olga", "History", 3, 4);
        Student students3 = new Student("Inna", "Economic", 3, 2);
        Student students4 = new Student("Ivan", "History", 3, 4);
        Student students5 = new Student("Misha", "History", 3, 2);

        students.add(students1);
        students.add(students2);
        students.add(students3);
        students.add(students4);
        students.add(students5);

        Student.printStudents(students, students1.getCourse());

        public List<Student> transferOfTheStudentToTheNextCourse(ArrayList<Student> students) {
            Iterator<Student> itr = students.iterator();

            while (itr.hasNext()) {
                Student student = itr.next();
                if (student.getAssessment() < 3) {
                    itr.remove();
                } else {
                    int newCourse = student.getCourse();
                    newCourse++;
                    student.setCourse(newCourse);
                }
            }
            return students;
        }





        }
    }



