package ua.intita.qa.homework10;

public class deleteWords {
    public String deleteWords(String text, int length) {

        return text;
    }

    private String text;
    private int length;
    String res = text.replaceAll("\\b\\w{5,5}\\b", "");


}
