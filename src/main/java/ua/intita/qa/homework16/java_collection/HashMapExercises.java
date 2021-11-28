package ua.intita.qa.homework16.java_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercises {
    public static void main(String args[]) {
        //Task 1/////////////////////////////////////////////////////////////////////
        HashMap<Integer,String> hash_map= new HashMap<Integer,String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");
        for(Map.Entry x:hash_map.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        //Task 2////////////////////////////////////////////////////////////////////
        System.out.println("Size of the hash map: "+hash_map.size());

        //Task 3///////////////////////////////////////////////////////////////////
        HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
        HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        System.out.println("\nValues in first map: " + hash_map1);
        hash_map2.put(4, "White");
        hash_map2.put(5, "Blue");
        hash_map2.put(6, "Orange");
        System.out.println("\nValues in second map: " + hash_map2);
        hash_map2.putAll(hash_map1);
        System.out.println("\nNow values in second map: " + hash_map2);

        //Task 4///////////////////////////////////////////////////////////////////
        System.out.println("The Original linked map: " + hash_map);
        hash_map.clear();
        System.out.println("The New map: " + hash_map);

        //Task 5///////////////////////////////////////////////////////////////////
        HashMap <Integer,String> hash_map3 = new HashMap <Integer,String> ();
        hash_map3.put(1, "Red");
        hash_map3.put(2, "Green");
        hash_map3.put(3, "Black");
        hash_map3.put(4, "White");
        hash_map3.put(5, "Blue");

        boolean result = hash_map3.isEmpty();
        System.out.println("Is hash map empty: " + result);
        hash_map3.clear();
        result = hash_map.isEmpty();
        System.out.println("Is hash map empty: " + result);

        //Task 6///////////////////////////////////////////////////////////////////
        System.out.println("The Original map: " + hash_map2);
        HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>();
        new_hash_map = (HashMap)hash_map2.clone();
        System.out.println("Cloned map: " + new_hash_map);
        //Task 7///////////////////////////////////////////////////////////////////
        HashMap < String, Integer > hash_map5 = new HashMap < String, Integer > ();
        hash_map5.put("Red", 1);
        hash_map5.put("Green", 2);
        hash_map5.put("Black", 3);
        hash_map5.put("White", 4);
        hash_map5.put("Blue", 5);

        System.out.println("The Original map: " + hash_map5);
        System.out.println("1. Is key 'Green' exists?");
        if (hash_map5.containsKey("Green")) {
            System.out.println("yes! - " + hash_map5.get("Green"));
        } else {
            System.out.println("no!");
        }

        System.out.println("\n2. Is key 'orange' exists?");
        if (hash_map5.containsKey("orange")) {
            System.out.println("yes! - " + hash_map5.get("orange"));
        } else {
            System.out.println("no!");
        }
        //Task 8///////////////////////////////////////////////////////////////////
        System.out.println("The Original map: " + hash_map5);
        System.out.println("1. Is value \'Green\' exists?");
        if (hash_map5.containsValue("Green")) {
            //value exists
            System.out.println("Yes! ");
        } else {
            //value does not exists
            System.out.println("no!");
        }

        System.out.println("\n2. Is value \'orange\' exists?");
        if (hash_map5.containsValue("orange")) {
            System.out.println("yes! - " );
        } else {
            System.out.println("No!");
        }
        //Task 9///////////////////////////////////////////////////////////////////
        HashMap < Integer, String > hash_map6 = new HashMap < Integer, String > ();
        hash_map6.put(1, "Red");
        hash_map6.put(2, "Green");
        hash_map6.put(3, "Black");
        hash_map6.put(4, "White");
        hash_map6.put(5, "Blue");

        Set set = hash_map6.entrySet();

        System.out.println("Set values: " + set);
        //Task 10///////////////////////////////////////////////////////////////////
        String val=(String)hash_map6.get(3);
        // check the value
        System.out.println("Value for key 3 is: " + val);
        //Task 11///////////////////////////////////////////////////////////////////
        Set keyset = hash_map6.keySet();
        System.out.println("Key set values are: " + keyset);
        //Task 12///////////////////////////////////////////////////////////////////
        System.out.println("Collection view is: "+ hash_map6.values());

    }
}
