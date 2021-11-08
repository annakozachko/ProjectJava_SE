package ua.intita.qa.homework13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String surname;
    private int age;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) throws NameException {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        if (result) {
            this.name = name;
        } else {
            System.out.println("Wrong name!");
        }

    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws SurnameException {
        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(surname);
        boolean result = matcher.matches();
        if (result) {
            this.surname = surname;
        } else {
            System.out.println("Wrong surname!");
        }
    }

    public int getAge() throws AgeException {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Enter the number more than 0 or less than 150");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws EmailException {
        Pattern pattern = Pattern.compile("w{3,}@\\w{3,}.\\w{2,4}");
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        if (result) {
            this.email = email;
        } else {
            System.out.println("Wrong email!");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws PasswordException {
        Pattern pattern = Pattern.compile("[A-Za-z0-9]{10,}");
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        if (result) {
            this.password = password;
        } else {
            System.out.println("Wrong password");
        }
    }
}
