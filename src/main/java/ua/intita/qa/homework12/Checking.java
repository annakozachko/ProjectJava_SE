package ua.intita.qa.homework12;

public class Checking {
    private int amountOfStudent;
    private String amountOfFaculty;
    public  String[] Student;
    private String[] subjects;
    public  String[] nameOfGroup;

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects){
      this.subjects = subjects;
    }


    public String[] getFaculty() {
        return faculty;
    }

    public String[] faculty;

    public Checking() {
    }
    public int getAmountOfStudent() {
        return amountOfStudent;
   }

    public void setAmountOfStudent(int amountOfStudent) {
        this.amountOfStudent = amountOfStudent;
    }

    public String[] getStudent() {
        return Student;
    }

    public void setStudent(String[] student) {
        Student = student;
    }

    //public Checking(int amountOfStudent){
    //    this.amountOfStudent = amountOfStudent;
    //}
    public void GetEvaluation(int[] eval) throws GradeIsNotFoundException {
        for (int i=0; i<=eval.length; i++) {
             if (eval[i] <= 0 || eval[i] > 10) {
                throw new GradeIsNotFoundException();
            } else {
                System.out.println("There are enough evaluations in a student");

        }


        public void studentsInAGroup (int amountOfStudent) throws LackOfStudentsInTheGroupException {
            if (amountOfStudent <= 0) {
                String[] c = {"Ivan"};
                setStudent(c);
                throw new LackOfStudentsInTheGroupException();
            } else {
                System.out.println("There are enough students in this group");

            }
        }
        public void CheckSubjects(String[] subjects) throws LackOfItemsException {
            if (subjects.length <= 0) {
                String [] s = {"Math"};
                setSubjects(s);
                throw new LackOfItemsException();
            } else {
                System.out.println("There are enough subjects in a student");
            }

        }
        public void studentsInAFaculty ( int amountOfStudent) throws LackOfStudentsInTheFacultyException {
            if (nameOfGroup.length <= 0) {
                String [] s = {"HIS"};
                setNameOfGroup(s);
                throw new LackOfStudentsInTheFacultyException();
            } else {
                System.out.println("There are enough groups on the faculties");

            }
        }
        public void facultiesInTheUniversity (String faculty) throws LackOfFacultiesInTheUniversityException {
            if (faculty.length <= 0) {
                String [] s = {"Pedagog"};
                setFaculty(s);
                throw new LackOfFacultiesInTheUniversityException();
            } else {
                System.out.println("There are enough faculty in the University");

            }
        }



    }
}

    public String getAmountOfFaculty() {
        return amountOfFaculty;
    }

    public void setAmountOfFaculty(String amountOfFaculty) {
        this.amountOfFaculty = amountOfFaculty;
    }

    public String[] getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String[] nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public void setFaculty(String[] faculty) {
        this.faculty = faculty;
    }
}
