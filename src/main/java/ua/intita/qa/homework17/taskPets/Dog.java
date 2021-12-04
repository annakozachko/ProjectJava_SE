package ua.intita.qa.homework17.taskPets;

public class Dog extends Pet{
    private String name;
    private String bread;
    private int age;

    public Dog(){

    }

    public Dog(String name, String bread, int age, int id) {
        super(id);
        this.name = name;
        this.bread = bread;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
