package ua.intita.qa.homework9;

import org.apache.maven.archetype.Calculatar;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatarTest {
    private Calculatar calculatar = new Calculatar();

    @Test
    public void sum() {
        final int sum = calculatar.sum(30,20);

        assertEquals(50, sum);

    }

    @Test
    public void dif() {
        final int dif = calculatar.dif(10, 5);
        assertEquals(5, dif);

    }
}