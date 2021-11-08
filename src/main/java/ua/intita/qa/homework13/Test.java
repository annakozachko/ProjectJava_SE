package ua.intita.qa.homework13;
import static org.junit.Assert.assertEquals;


public class Test {
    private User user;

    @org.junit.Test
    public void setRightNameTest() throws NameException {
        user.setName("Anna");
        assertEquals(user.getName(), "Anna");
    }


    @org.junit.Test(expected = NameException.class)
    public void setWrongNameTest() throws NameException {
        user.setName("anna");
    }
    @org.junit.Test
    public void setRightAgeTest() throws AgeException {
        user.setAge(30);
        assertEquals(user.getAge(), 30);

    }
    @org.junit.Test(expected = AgeException.class)
    public void setWrongAgeTest() throws AgeException {
        user.setAge(155);
        assertEquals(user.getAge(), 30);
    }

    @org.junit.Test
    public void setRightEmailTest() throws EmailException {
        user.setEmail("aaa@gmail.com");
        assertEquals(user.getEmail(), "aaa@gmail.com");

    }
    @org.junit.Test(expected = EmailException.class)
    public void setWrongEmailTest() throws EmailException {
        user.setEmail("aaagmail.com");
        assertEquals(user.getEmail(), "aaa@gmail.com");
    }
    @org.junit.Test
    public void setRightPasswordTest() throws PasswordException {
        user.setPassword("111vvv666");
        assertEquals(user.getEmail(), "111vvv666");

    }
    @org.junit.Test(expected = EmailException.class)
    public void setWrongPasswordTest() throws PasswordException {
        user.setPassword("---111vvv66===6");
        assertEquals(user.getEmail(), "111vvv666");
    }

}
