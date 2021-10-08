package ua.intita.qa.homework9;

import java.lang.reflect.Array;
import java.util.Locale;

abstract class FirstHandler implements Handler{

     public int concat(){
         return 0;
     }

    @Override
    public String uppercase(String word) {
        return word.toUpperCase();
    }

    @Override
    public String lowercase(String word) {
        return word.toLowerCase();
    }

    @Override
    public int getLength(String word) {
        return word.length();
     }

    @Override
    public String concat(String str1, String str2) {
        return str1=str1.concat(str2);
    }

    @Override
    public boolean contains(String word, char symbol) {
        char[] arr=word.toCharArray();
        for(char a: arr) {
            if (a == symbol)
                return true;
        }
        return false;
    }
}

