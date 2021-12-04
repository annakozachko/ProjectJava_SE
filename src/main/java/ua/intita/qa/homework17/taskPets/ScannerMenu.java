package ua.intita.qa.homework17.taskPets;

import java.util.Scanner;

public class ScannerMenu {
    public static Cat c;
    public static Dog d;
    public static Parrot p;

    public static void inputCatData(){
//        if (c != null) {
            Scanner in = new Scanner(System.in);
            System.out.print("Input name: ");
            String name = in.nextLine();

            System.out.print("Input bread: ");
            String bread = in.nextLine();

            System.out.print("Input age: ");
            Integer age = in.nextInt();

            c.setName(name);
            c.setBread(bread);
            c.setAge(age);
        }


    //}
    public static void inputDogData(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input bread: ");
        String bread = in.nextLine();
        System.out.print("Input age: ");
        Integer age = in.nextInt();
        d.setName(name);
        d.setBread(bread);
        d.setAge(age);

    }
    public static void inputParrotData(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        Integer age = in.nextInt();
        p.setName(name);
        p.setAge(age);
    }
     public static void menuPrint(){
        System.out.println("1 - Cat;");
        System.out.println("2 - Dog;");
        System.out.println("3 - Parrot;");
    }
    public static void menuChoice(int numMenu) {
        switch (numMenu) {
            case 1 : inputCatData();
                break;
            case 2 : inputDogData();
                break;
            case 3 : inputParrotData();
                break;
        }
    }




}
