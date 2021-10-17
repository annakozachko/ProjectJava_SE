package ua.intita.qa.homework10;
import java.util.Arrays;

public class orderWords {

    public static String[] Words(String text){

        return new String[0];
    };

    public String[] orderWords(String text) {
        String[] words = text.split("\\s+");
        for (String word : words){
            System.out.println(word);
        }
        Arrays.sort(words);
        return words;
    }

}
