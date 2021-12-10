package ua.intita.qa.homework16.firstTask;

import java.util.HashMap;
import java.util.Map;

public class SecondMethod {
    public static void main(String[] args) {
        String testStr = "Live wind and wind rain and temperature maps maps ";
        countAndPrintRepeatedWordOccurences(testStr);
    }
    public static void countAndPrintRepeatedWordOccurences(String strContent) {

        Map<String, Integer> mapOfRepeatedWord = new HashMap<String, Integer>();
        String[] words = strContent.split(" ");
        for(String word : words) {
            String tempUCword = word.toLowerCase();

            // Step 5: check whether Map contains particular word
            if(mapOfRepeatedWord.containsKey(tempUCword)){

                // Step 6: If contains, increase count value by 1
                mapOfRepeatedWord.put(tempUCword, mapOfRepeatedWord.get(tempUCword) + 1);
            }
            else {

                // Step 7: otherwise, make a new entry
                mapOfRepeatedWord.put(tempUCword, 1);
            }
        }


        // Step 8: print word along with its count
        for(Map.Entry<String, Integer> entry :
                mapOfRepeatedWord.entrySet()){
            System.out.println(entry.getKey()
                    + "\t\t" + entry.getValue());
        }
    }
}

