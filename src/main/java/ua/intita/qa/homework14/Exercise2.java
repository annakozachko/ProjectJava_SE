package ua.intita.qa.homework14;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.ArrayList;

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> listic = new LinkedList<String>();
        listic.add("First");
        listic.add("Second");
        listic.add("Third");
        listic.add("Fourth");

        //Task 1///////////////////////////////////////////////////////////
        System.out.println("The linked list: " + listic);
        listic.addLast("Fifth");
        System.out.println("Aded last item " + listic);

        //Task 2////////////////////////////////////////////////////////////
        System.out.print("Начальное содержание listic: ");
        Iterator itr = listic.iterator();

        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();

        //Task 3/////////////////////////////////////////////////////////////
        Iterator p1 = listic.listIterator(2);
        while (p1.hasNext()) {
            System.out.println(p1.next());
        }
        //Task 4/////////////////////////////////////////////////////////////
        Iterator it = listic.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //Task 5/////////////////////////////////////////////////////////////
        System.out.println("Let add the number ten  after the number second: " + listic);
        listic.add(2, "ten");
        System.out.println("The linked list:" + listic);

        //Task 6////////////////////////////////////////////////////////////
        listic.addFirst("Null");
        listic.addLast("six");
        System.out.println(" New list has: " + listic);

        //Task 7////////////////////////////////////////////////////////////
        listic.offerFirst("Nice");
        System.out.println(listic);

        //Task 8/////////////////////////////////////////////////////////////
        listic.offerLast("Good");
        System.out.println(listic);

        //Task 9/////////////////////////////////////////////////////////////
        LinkedList <String> new_listik = new LinkedList<>();
        new_listik.add("one");
        new_listik.add("two");
        listic.addAll(2, new_listik);
        System.out.println(listic);

        //Task 10///////////////////////////////////////////////////////////
        Object first_element = listic.getFirst();
        System.out.println("First Element is: "+first_element);
        Object last_element = listic.getLast();
        System.out.println("Last Element is: "+last_element);

        //Task 11////////////////////////////////////////////////////////////
        System.out.println("Original linked list:" + listic);
        for(int i=0; i < listic.size(); i++)
        {
            System.out.println("Element at index "+i+": "+listic.get(i));
        }

        //Task 12////////////////////////////////////////////////////////////
        listic.remove(6);
        System.out.println(listic);

        //Task 13////////////////////////////////////////////////////////////
        listic.removeFirst();
        listic.removeLast();
        System.out.println(listic);

        //Task 14////////////////////////////////////////////////////////////
        listic.removeAll(listic);
        System.out.println(listic);

        //Task 15////////////////////////////////////////////////////////////
        LinkedList<String> lis = new LinkedList<String>();
        lis.add("First");
        lis.add("Second");
        lis.add("Third");
        lis.add("Fourth");
        Collections.swap(lis, 1, 3);
        System.out.println(lis);

        //Task 16////////////////////////////////////////////////////////////
        System.out.println("Linked list before shuffling:" + lis);
        Collections.shuffle(lis);
        System.out.println("Linked list after shuffling:" + lis);

        //Task 17////////////////////////////////////////////////////////////
        LinkedList <String> A1 = new LinkedList<>();
        A1.add("A");
        A1.add("B");
        A1.add("C");
        LinkedList <String> B1 = new LinkedList<>();
        B1.add("D");
        B1.add("E");
        B1.add("F");
        LinkedList<String> C1 = new LinkedList<>();
        C1.addAll(A1);
        C1.addAll(B1);
        System.out.println(C1);

        //Task 18////////////////////////////////////////////////////////////
        LinkedList <String> newc1 = new LinkedList <String> ();
        newc1 = (LinkedList)C1.clone();
        System.out.println("Cloned linked list: " + newc1);

        //Task 19////////////////////////////////////////////////////////////
        newc1.pop();
        System.out.println(newc1);

        //Task 20////////////////////////////////////////////////////////////
        String a = C1.peekFirst();
        System.out.println("First element in the list: " + a);
        System.out.println("Original linked list: " + C1);

        //Task 21////////////////////////////////////////////////////////////
        String b = C1.peekLast();
        System.out.println("Last element in the list: " + b);
        System.out.println("Original linked list: " + C1);

        //Task 22////////////////////////////////////////////////////////////
        if (C1.contains("B")) {
            System.out.println("Letter B is  present in the linked list.");
        }else {
            System.out.println("Letter B is not present in the linked list.");
        }

        //Task 23////////////////////////////////////////////////////////////
//        List<String> list = new ArrayList<String>(newc1);
//        for (String str : list){
//            System.out.println(str);
//        }
        //Task 24////////////////////////////////////////////////////////////
        LinkedList<String> c1= new LinkedList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        LinkedList<String> c2= new LinkedList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Orange");

        //comparison output in linked list
        LinkedList<String> c3 = new LinkedList<String>();
        for (String e : c1)
            c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
        //Task 25////////////////////////////////////////////////////////////
        System.out.println("Original linked list: " + c1);
        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Linked list after remove all elements "+c1);
        System.out.println("Check the above linked list is empty or not! "+c1.isEmpty());

        //Task 26////////////////////////////////////////////////////////////
        LinkedList<String> t = new LinkedList<String>();
        t.add("Red");
        t.add("Green");
        t.add("Black");
        t.add("White");
        t.add("Pink");
        System.out.println("Original linked list: " + t);
        // Replacing 2nd element with new value
        t.set(1, "Orange");
        System.out.println("The value of second element changed.");
        System.out.println("New linked list: " + t);



    }
}

