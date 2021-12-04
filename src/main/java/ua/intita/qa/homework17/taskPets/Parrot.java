package ua.intita.qa.homework17.taskPets;

public class Parrot extends Pet{
    private String name;
    private int age;

    public Parrot(){

    }

    public Parrot(String name, int age, int id) {
        super(id);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
