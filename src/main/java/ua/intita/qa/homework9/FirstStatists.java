package ua.intita.qa.homework9;

public class FirstStatists implements Statists{

    @Override
    public int countNumberLetters(String word) {
        String S1 = "Beautiful";
        int length = S1.length();
        System.out.println("Length of a String is: " + length);
        return length;
    }
    @Override
    public int countNumberVowels(String word) {
        char[] word1 = word.toCharArray();
        int count = 0;
        for (char c : word1){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y'){
                count++;
            }
        }
        return count;
    }

    @Override
    public int countNumberConsonants(String word) {
        char[] word1 = word.toCharArray();
        int count = 0;
        for (char c : word1){
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'y'){
                count++;
            }
        }
        return count;
    }

    @Override
    public int countPoints(String text) {
        char[] word1 = text.toCharArray();
        int count = 0;
        for (char c : word1){
            if(c == '.'){
                count++;
            }
        }
        return count;
    }

    @Override
    public int countComas(String text) {
        char[] word1 = text.toCharArray();
        int count = 0;
        for (char c : word1){
            if(c == ','){
                count++;
            }
        }
        return count;
    }
}
