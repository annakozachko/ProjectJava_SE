package ua.intita.qa.homework9;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstHandlerTest {
    private final Handler handler = new FirstHandler(){

    };

    @Test
    public void uppercase(){
        final String uppercase= handler.uppercase("children");

        assertEquals("CHILDREN", uppercase);
    }
    @Test
    public void lowercase(){
        final String lowercase= handler.lowercase("CHILDREN");

        assertEquals("children", lowercase);
    }
    @Test
    public void getLength(){
        final int getLength= handler.getLength("Girl");

        assertEquals(4, getLength);
    }
    @Test
    public void concat(){
          final String concat= handler.concat("The weather is nice today!", "Very warm!");

          assertEquals("The weather is nice today!Very warm!", concat);
    }
    @Test
    public void contains(){
        final boolean contains= handler.contains("little", 'i');

        assertTrue(contains);
    }
}