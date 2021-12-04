package ua.intita.qa.homework17.taskStudent;

import java.util.List;

public class Student {
    private String name;
    private String group;
    private int course;
    private int assessment;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getAssessment() {
        return assessment;
    }

    public void setAssessment(int assessment) {
        this.assessment = assessment;
    }

    public Student(String name, String group, int course, int assessment) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", assessment=" + assessment +
                '}';
    }
  public static void printStudents(List<Student> students, int course){
      for(Student st: students){
          System.out.println(st.getName() +  " " +  st.getGroup());
      }


        }
    }

