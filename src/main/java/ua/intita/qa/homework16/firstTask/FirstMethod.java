package ua.intita.qa.homework16.firstTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class FirstMethod {
    public static void main(String[] args) {
        String num = "There will be a New Year soon";
        String str[] = num.split(" ");
        List<String> al = new ArrayList<String>();
        al = Arrays.asList(str);
        for(String s: al){
            System.out.println(s);
        }
    }
}

