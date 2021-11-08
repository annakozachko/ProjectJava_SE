package ua.intita.qa.homework13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String Name = scanner.nextLine();
        try {
            user.setName(Name);
            System.out.println("Name is "+ user.getName());
        }
        catch (NameException e){
            System.out.println(e.getMessage());
        }/////////////////////////////////////////////////////////////////////////////

        System.out.println("Enter surname: ");
        String surname = scanner.nextLine();
        try {
            user.setSurname(surname);
            System.out.println("Surname is "+ user.getSurname());
        }
        catch (SurnameException e){
            System.out.println(e.getMessage());
        }/////////////////////////////////////////////////////////////////////////

        System.out.println("Enter age: ");
        int age = scanner.nextInt();
        try {
            user.setAge(age);
            System.out.println("Age is "+ user.getAge());
        }
        catch (AgeException e){
            System.out.println(e.getMessage());
        }
        ////////////////////////////////////////////////////////////////////

        System.out.println("Enter email: ");
        String email = scanner.nextLine();
        try {
            user.setEmail(email);
            System.out.println("Email is "+ user.getEmail());
        }
        catch (EmailException e){
            System.out.println(e.getMessage());
        }/////////////////////////////////////////////////////////////////////

        System.out.println("Enter password: ");
        String Password = scanner.nextLine();
        try {
            user.setPassword(Password);
            System.out.println("Password is "+ user.getPassword());
        }
        catch (PasswordException e){
            System.out.println(e.getMessage());
        }
    }
}
