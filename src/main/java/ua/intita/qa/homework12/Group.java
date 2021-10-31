package ua.intita.qa.homework12;

public class Group extends Faculty {
    private int number;
    private String nameOfGroup;

    public Group(String nameOfFaculty, int number, String nameOfGroup){
        super(nameOfFaculty);
        this.number = number;
        this.nameOfGroup = nameOfGroup;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;

    }
}
