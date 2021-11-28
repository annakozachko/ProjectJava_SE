package ua.intita.qa.homework16.java_collection;

import java.util.*;

public class TreeMapExercises {
    public static void main(String args[]) {
        //Task 1
        ///////////////////////////////////////////////////////////////////////////
        TreeMap<Integer, String> tree_map = new TreeMap<Integer, String>();
        tree_map.put(1, "Red");
        tree_map.put(2, "Green");
        tree_map.put(3, "Black");
        tree_map.put(4, "White");
        tree_map.put(5, "Blue");

        for (Map.Entry<Integer, String> entry : tree_map.entrySet()) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
        //Task 2
        ///////////////////////////////////////////////////////////////////////////
        TreeMap<String, String> tree_map1 = new TreeMap<String, String>();
        tree_map1.put("C1", "Red");
        tree_map1.put("C2", "Green");
        tree_map1.put("C3", "Black");
        tree_map1.put("C4", "White");
        tree_map1.put("C5", "Blue");
        System.out.println("Tree Map 1: " + tree_map1);
        TreeMap<String, String> tree_map2 = new TreeMap<String, String>();
        tree_map2.put("A1", "Orange");
        tree_map2.put("A2", "Pink");
        System.out.println("Tree Map 2: " + tree_map2);
        tree_map1.putAll(tree_map2);
        System.out.println("After coping map2 to map1: " + tree_map1);
        //Task 3
        ///////////////////////////////////////////////////////////////////////////
        if (tree_map1.containsValue("Black")) {
            System.out.println("The Tree Map contains key Black");
        } else {
            System.out.println("The Tree Map does not contain key Black");
        }
        if (tree_map1.containsValue("C9")) {
            System.out.println("The Tree Map contains key C9");
        } else {
            System.out.println("The TreeMap does not contain key C9");
        }

        //Task 4
        ///////////////////////////////////////////////////////////////////////////
        if (tree_map2.containsValue("Pink")) {
            System.out.println("The Tree Map contains value Pink");
        } else {
            System.out.println("The Tree Map does not contain value Pink");
        }
        if (tree_map2.containsValue("Yellow")) {
            System.out.println("The Tree Map contains value Yellow");
        } else {
            System.out.println("The TreeMap does not contain value Yellow");
        }
        //Task 5///////////////////////////////////////////////////////////////////////////

        Set<String> keys = tree_map1.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        //Task 6///////////////////////////////////////////////////////////////////////////
        tree_map1.clear();
        System.out.println("The New map: " + tree_map1);

        //Task 7///////////////////////////////////////////////////////////////////////////
        //TreeMap<String, String> tree_maps = new TreeMap<String, String>(new sort_key());
        // Put elements to the map
//        tree_maps.put("C2", "Red");
//        tree_maps.put("C4", "Green");
//        tree_maps.put("C3", "Black");
//        tree_maps.put("C1", "White");
//        System.out.println(tree_maps);
//
//        class sort_key implements Comparator<String> {
//        @Override
//        public int compare(String str1, String str2) {
//        return str1.compareTo(str2);
//    }
//}
        //Task 8///////////////////////////////////////////////////////////////////
        TreeMap <String,String> map1 = new TreeMap <String,String> ();
        map1.put("C1", "Red");
        map1.put("C2", "Green");
        map1.put("C3", "Black");
        map1.put("C4", "White");
        System.out.println("Orginal TreeMap content: " + map1);
        System.out.println("Greatest key: " + map1.firstEntry());
        System.out.println("Least key: " + map1.lastEntry());

        //Task 9//////////////////////////////////////////////////////////////////
        System.out.println("Orginal TreeMap content: " + map1);
        System.out.println("Greatest key: " + map1.firstKey());
        System.out.println("Least key: " + map1.lastKey());

        //Task 10//////////////////////////////////////////////////////////////////
        System.out.println("Reverse order view of the keys: " + map1.descendingKeySet());

        //Task 11///////////////////////////////////////////////////////////////////
        TreeMap < Integer, String > tree_map3 = new TreeMap < Integer, String > ();
        // Put elements to the map
        tree_map3.put(10, "Red");
        tree_map3.put(20, "Green");
        tree_map3.put(40, "Black");
        tree_map3.put(50, "White");
        tree_map3.put(60, "Pink");

        System.out.println("Orginal TreeMap content: " + tree_map1);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Value is: " + tree_map3.floorEntry(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Value is: " + tree_map3.floorEntry(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Value is: " + tree_map3.floorEntry(70));

        //Task 12///////////////////////////////////////////////////////////////////
        System.out.println("Orginal TreeMap content: " + tree_map3);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key is: " + tree_map3.floorKey(10));
        System.out.println("Checking the entry for 30: ");
        System.out.println("Key is: " + tree_map3.floorKey(30));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key is: " + tree_map3.floorKey(70));

        //Task 13//////////////////////////////////////////////////////////////////
        System.out.println("Checking the entry for 40: ");
        System.out.println("Key(s): " + tree_map3.headMap(40));

        //Task 14//////////////////////////////////////////////////////////////////
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + tree_map3.headMap(20, true));

        //Task 15//////////////////////////////////////////////////////////////////
        System.out.println("Key(s): "+tree_map3.higherEntry(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): "+tree_map3.higherEntry(70));

        //Task 16//////////////////////////////////////////////////////////////////
        System.out.println("Orginal TreeMap content: " + tree_map3);
        System.out.println("Checking the entry for 10: ");
        System.out.println("Key(s): " + tree_map3.lowerKey(10));
        System.out.println("Checking the entry for 20: ");
        System.out.println("Key(s): " + tree_map3.lowerKey(20));
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + tree_map3.lowerKey(70));

        //Task 17//////////////////////////////////////////////////////////////////
        System.out.println("Checking the entry for 70: ");
        System.out.println("Key(s): " + tree_map3.lowerKey(70));

        //Task 18//////////////////////////////////////////////////////////////////
        System.out.println("Orginal TreeMap content: " + tree_map3);
        System.out.println("Orginal TreeMap content: " + tree_map3.navigableKeySet());

        //Task 19/////////////////////////////////////////////////////////////////
        System.out.println("Value before poll: " + tree_map3);
        System.out.println("Value returned: " + tree_map3.pollFirstEntry());
        System.out.println("Value after poll: " + tree_map3);

        //Task 20/////////////////////////////////////////////////////////////////
        System.out.println("Orginal TreeMap content: " + tree_map3);
        System.out.println("Greatest key: " + tree_map3.firstEntry());
        System.out.println("Least key: " + tree_map3.lastEntry());
        //Task 21/////////////////////////////////////////////////////////////////
        TreeMap < Integer, String > tree_map4 = new TreeMap < Integer, String > ();
        SortedMap< Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

        // Put elements to the map
        tree_map4.put(10, "Red");
        tree_map4.put(20, "Green");
        tree_map4.put(30, "Black");
        tree_map4.put(40, "White");
        tree_map4.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + tree_map4);
        sub_tree_map = tree_map4.subMap(20, 40);
        System.out.println("Sub map key-values: " + sub_tree_map);

        //Task 23/////////////////////////////////////////////////////////////////
        TreeMap < Integer, String > tree_map5 = new TreeMap < Integer, String > ();
        tree_map5.put(10, "Red");
        tree_map5.put(20, "Green");
        tree_map5.put(30, "Black");
        tree_map5.put(40, "White");
        tree_map5.put(50, "Pink");
        System.out.println("Orginal TreeMap content: " + tree_map5);
        System.out.println("Keys are greater than 20: " + tree_map5.tailMap(20, false));

        //Task 25/////////////////////////////////////////////////////////////////
        System.out.println("Orginal TreeMap content: " + tree_map5);
        System.out.println("Keys greater than or equal to 20: " + tree_map5.ceilingEntry(20));
        System.out.println("Keys greater than or equal to 40: " + tree_map5.ceilingEntry(40));
        System.out.println("Keys greater than or equal to 50: " + tree_map5.ceilingEntry(50));
        //Task 26/////////////////////////////////////////////////////////////////
        System.out.println("Orginal TreeMap content: " + tree_map5);
        System.out.println("Keys greater than or equal to 20: " + tree_map5.ceilingKey(20));
        System.out.println("Keys greater than or equal to 30: " + tree_map5.ceilingKey(30));
        System.out.println("Keys greater than or equal to 50: " + tree_map5.ceilingKey(50));





    }
}
