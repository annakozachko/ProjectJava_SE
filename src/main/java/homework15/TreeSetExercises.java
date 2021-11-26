package homework15;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercises {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        //Task 1
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("Tree set: " + tree_set);
        //************************************************************
        //Task 2
         for (String element : tree_set) {
            System.out.println(element);
        }
        //************************************************************
        //Task 3
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Red");
        tree_set1.add("Green");
        tree_set1.add("Orange");
        System.out.println("Tree set1: "+tree_set1);
        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("Pink");
        tree_set2.add("White");
        tree_set2.add("Black");
        System.out.println("Tree set2: "+tree_set2);
        // adding treetwo to treeone
        tree_set1.addAll(tree_set2);
        System.out.println("Tree set1: "+tree_set1);
        // ***************************************************************
        //Task 4  Write a Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println("Original tree set:" + tree_set);
        Iterator it = tree_set.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Task 5  Write a Java program to get the first and last elements in a tree set.
        Object first_element = tree_set.first();
        System.out.println("First Element is: "+first_element);
        Object last_element = tree_set.last();
        System.out.println("Last Element is: "+last_element);

        //Task 6 Write a Java program to clone a tree set list to another tree set.
        System.out.println("Original tree set:" + tree_set);
        TreeSet<String> new_t_set = (TreeSet<String>)tree_set.clone();
        System.out.println("Cloned tree list: " + tree_set);

        //Task 7
        System.out.println("Size of the tree set: " + tree_set.size());

        //Task 8
        System.out.println("Second Tree set: "+tree_set1);
        System.out.println("Second Tree set: "+tree_set2);
        //comparison output in tree set
        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : tree_set1){
            System.out.println(tree_set2.contains(element) ? "Yes" : "No");
        }
        //Task 9
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>treeheadset = new TreeSet<Integer>();

        // Add numbers in the tree
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);

        // Find numbers less than 7
        treeheadset = (TreeSet)tree_num.headSet(7);

        // create an iterator
        Iterator iterator;
        iterator = treeheadset.iterator();

        //Displaying the tree set data
        System.out.println("Tree set data: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        //Task 10
        System.out.println("Greater than or equal to 8 : "+tree_num.ceiling(8));
        System.out.println("Greater than or equal to 2 : "+tree_num.ceiling(2));
        //Task 11
        System.out.println("Greater than or equal to 8 : "+tree_num.floor(8));
        System.out.println("Greater than or equal to 2 : "+tree_num.floor(2));
        //Task 12
        System.out.println("Greater than or equal to 8 : "+tree_num.higher(8));
        System.out.println("Greater than or equal to 2 : "+tree_num.higher(2));
        //Task 13
        System.out.println("Greater than or equal to 8 : "+tree_num.lower(8));
        System.out.println("Greater than or equal to 2 : "+tree_num.lower(2));
        //Task 14
        TreeSet <Integer>tree_num1 = new TreeSet<Integer>();

        tree_num1.add(10);
        tree_num1.add(22);
        tree_num1.add(36);
        tree_num1.add(25);
        tree_num1.add(16);
        tree_num1.add(70);
        tree_num1.add(82);
        tree_num1.add(89);
        tree_num1.add(14);
        System.out.println("Original tree set: "+tree_num1);
        System.out.println("Removes the first(lowest) element: "+tree_num1.pollFirst());
        System.out.println("Tree set after removing first element: "+tree_num1);
        //Task 15
        System.out.println("Removes the last element: "+tree_num1.pollLast());
        System.out.println("Tree set after removing last element: "+tree_num1);
        //Task 16
        System.out.println("Original tree set: "+tree_num);
        System.out.println("Removes 16 from the list: "+tree_num1.remove(16));
        System.out.println("Tree set after removing last element: "+tree_num1);
    }
}
