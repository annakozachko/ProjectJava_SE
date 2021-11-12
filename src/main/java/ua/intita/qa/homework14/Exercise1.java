package ua.intita.qa.homework14;

import java.util.*;
import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        //Task 1
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);

        //Task2
        Iterator itr = list_Strings.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Task 3
        int index = list_Strings.indexOf("Orange");
        System.out.println(index);

        //Task4
        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(2);
        System.out.println("Third element: "+element);

        //Task 5
        list_Strings.set(4,"Pink");
        System.out.println(list_Strings);

        //Task 6
        list_Strings.remove(3);
        System.out.println(list_Strings);

        //Task 7
        list_Strings.contains("Orange");
        System.out.println( list_Strings.contains("Orange"));

        //Task 8
        Collections.sort(list_Strings);
        System.out.println(list_Strings);

        //Task 9
        Set<String> set = new LinkedHashSet<String>(list_Strings);
        Collections.synchronizedList(list_Strings);
        System.out.println("New set has " + list_Strings);

        //Task 10 перемешивает элементы в списке масивов
        Collections.shuffle(list_Strings);
        System.out.println(list_Strings);

        //Task 11 реверсирует элементы в списке масивов
        Collections.reverse(list_Strings);
        System.out.println(list_Strings);

        //Task 12  извлечение части списка массивов.
        List<String> sub_List = list_Strings.subList(0, 3);
        System.out.println("List of first three elements: " + sub_List);

        //Task 13 сравнение двух списков массивов.
        List<String> secondList=new ArrayList<String>();
        secondList.add("Red");
        secondList.add("Green");
        secondList.add("Guava");
        System.out.println(secondList);
        boolean boolval = list_Strings.equals(secondList);
        System.out.println(boolval);

        //Task 14
        System.out.println("First array has" + list_Strings);
        Collections.swap(list_Strings, list_Strings.indexOf("Red"), list_Strings.indexOf("Pink"));
        System.out.println("Second" + list_Strings);

        //Task 15
        ArrayList<String> a = new ArrayList<String>();
        a.addAll(list_Strings);
        a.addAll(secondList);
        System.out.println("New array: " + a);

        //Task 16
        System.out.println("Original array list: " + list_Strings);
        ArrayList<String> copy = (ArrayList<String>) ((ArrayList<String>) list_Strings).clone();
        System.out.println("Cloned array list: " + copy);

        //Task 17
        list_Strings.removeAll(list_Strings);
        System.out.println("Array list after remove all elements "+ list_Strings);

        //Task 18
        List<String> colors = new ArrayList<String>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        if (list_Strings.isEmpty())
        {
            System.out.println("The ArrayList is empty");
        }
        else
        {
            System.out.println("The ArrayList is not empty");
        }

        //Task 19
        System.out.println("Let trim to size the above array: ");
        ((ArrayList<String>) secondList).trimToSize();

        System.out.println(secondList);

        //Task 20
        System.out.println(secondList);
        ((ArrayList<String>) secondList).ensureCapacity(6);
        secondList.add("Blue");
        secondList.add("White");
        System.out.println("New array has new colors" + secondList);

        //Task 21
        secondList.set(2, "Yellow");
        System.out.println(secondList);

        //Task 22
        System.out.println("Print using index of an element: ");
        int elements = secondList.size();
        for (int index2 = 0; index2 < elements; index2++)
            System.out.println(secondList.get(index2));
    }}