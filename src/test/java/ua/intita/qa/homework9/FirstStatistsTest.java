package ua.intita.qa.homework9;

import org.junit.Test;
import static org.junit.Assert.*;


public class FirstStatistsTest {
    private final Statists statists = new FirstStatists() {

    };

    @Test
    public void countNumberLetters() {
        final int amount = statists.countNumberLetters("Beautiful");
        assertEquals(9, amount);
    }
    @Test
    public  void countNumberVowels(){
        final int count = statists.countNumberVowels("Beautiful");

        assertEquals(5, count);
    }
    @Test
    public  void countNumberConsonants(){
        final int count = statists.countNumberConsonants("Beautiful");

        assertEquals(4, count);
    }
    @Test
    public  void countPoints(){
        final int count = statists.countPoints("Autumn. October. Wonderful time of year.");

        assertEquals(3, count);
    }
    @Test
    public  void countComas(){
        final int count = statists.countComas("Autumn, October has begun, a wonderful time of year.");

        assertEquals(2, count);

    }
}

