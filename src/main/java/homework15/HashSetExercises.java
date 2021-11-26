package homework15;

import java.util.*;

public class HashSetExercises {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        //**********************************************************************
        //Task 1
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("The Hash Set: " + h_set);

        //**********************************************************************
        //Task 2
        Iterator<String> p = h_set.iterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }
        //**********************************************************************
        //Task 3
        System.out.println("Original Hash Set: " + h_set);
        System.out.println("Size of the Hash Set: " + h_set.size());
        //**********************************************************************
        //Task 4

        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements " + h_set);

        //**********************************************************************
        //Task5
        System.out.println("Checking the above array list is empty or not! " + h_set.isEmpty());
        System.out.println("Remove all the elements from a Hash Set: ");
        h_set.removeAll(h_set);
        System.out.println("Hash Set after removing all the elements " + h_set);
        //**********************************************************************
        //Task6
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        HashSet<String> new_h_set = new HashSet<String>();
        new_h_set = (HashSet) h_set.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);
        //**********************************************************************
        //Task7
        String[] new_array = new String[h_set.size()];
        h_set.toArray(new_array);
        System.out.println("Array elements: ");
        for (String element : new_array) {
            System.out.println(element);
        }
        //**********************************************************************
        //Task8
        Set<String> tree_set = new TreeSet<String>(h_set);
        System.out.println("TreeSet elements: ");
        for (String element : tree_set) {
            System.out.println(element);
        }
        //**********************************************************************
        //Task9
        List<String> list = new ArrayList<String>(h_set);
        System.out.println("ArrayList contains: " + list);
        //**********************************************************************
        //Task10
        HashSet<String> h_set2 = new HashSet<String>();
        h_set2.add("Red");
        h_set2.add("Pink");
        h_set2.add("Black");
        h_set2.add("Orange");
        h_set2.add("Purpure");
        h_set2.add("Grey");
        HashSet<String> result_set = new HashSet<String>();
        for (String element : h_set) {
            System.out.println(h_set2.contains(element) ? "Yes" : "No");
        }
        //**********************************************************************
        //Task11
        System.out.println("Second HashSet content: " + h_set2);
        h_set.retainAll(h_set2);
        System.out.println("HashSet content:");
        System.out.println(h_set);
        //**********************************************************************
        //Task12
        h_set.clear();
        System.out.println("HashSet content: " + h_set);

    }
}




