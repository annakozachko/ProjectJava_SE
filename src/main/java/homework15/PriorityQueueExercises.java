package homework15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueExercises {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        //Task 1
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        System.out.println(queue);

        //Task 2
        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Red");
        pq.add("Green");
        pq.add("Orange");
        pq.add("White");
        pq.add("Black");
        System.out.println("Elements of the Priority Queue: ");
        // iterate the Priority Queue
        for (String element : pq) {
            System.out.println(element);
        }
        //Task 3
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.add("Red");
        queue1.add("Green");
        queue1.add("Orange");
        System.out.println("Priority Queue1: " + queue1);
        PriorityQueue<String> queue2 = new PriorityQueue<String>();
        queue2.add("Pink");
        queue2.add("White");
        queue2.add("Black");
        System.out.println("Priority Queue2: " + queue2);
        // adding queue2 to queue1
        queue1.addAll(queue2);
        System.out.println("New Priority Queue1: " + queue1);

        //Task 4
        PriorityQueue<String> pq1 = new PriorityQueue<String>();
        pq1.add("Red");
        pq1.add("Green");
        pq1.add("Black");
        pq1.add("White");
        System.out.println("Original Priority Queue: " + pq1);
        pq1.offer("Blue");
        System.out.println("The New Priority Queue: " + pq1);
        //Task 5
        pq1.clear();
        System.out.println("The New Priority Queue: " + pq1);
        //Task 6
        PriorityQueue<String> pqa = new PriorityQueue<String>();
        pqa.add("Red");
        pqa.add("Green");
        pqa.add("Black");
        pqa.add("Pink");
        pqa.add("orange");
        System.out.println("Priority Queue: " + pqa);
        System.out.println("Size of the Priority Queue: " + pqa.size());

        //Task 7
        PriorityQueue<String> pq3 = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        pq3.add("Red");
        pq3.add("Green");
        pq3.add("Black");
        pq3.add("White");
        System.out.println("First Priority Queue: "+pq3);

        PriorityQueue<String> pq2 = new PriorityQueue<String>();
        pq2.add("Red");
        pq2.add("Pink");
        pq2.add("Black");
        pq2.add("Orange");
        System.out.println("Second Priority Queue: "+pq2);

        for (String element : pq3){
            System.out.println(pq2.contains(element) ? "Yes" : "No");
        }
        //Task 8
        System.out.println("Original Priority Queue: "+pq3);
        System.out.println("The first element of the Queue: "+pq3.peek());

        //Task 9
        System.out.println("Original tree set: "+pq2);
        System.out.println("Removes the first(lowest) element: "+pq2.remove(1));
        System.out.println("Tree set after removing first element: "+pq2);

        //Task 10
        PriorityQueue<String> p = new PriorityQueue<String>();
        // use add() method to add values in the Priority Queue
        p.add("Red");
        p.add("Green");
        p.add("Black");
        p.add("White");
        System.out.println("Original Priority Queue: "+p);
        List<String> array_list = new ArrayList<String>(p);
        System.out.println("Array containing all of the elements in the queue: "+array_list);

        //Task 11
        System.out.println("Original Priority Queue: "+p);
        String str1;
        str1 = p.toString();
        System.out.println("String representation of the Priority Queue: "+str1);

        //Task 12
        PriorityQueue<Integer> pl = new PriorityQueue<>(10, Collections.reverseOrder());

        // Add numbers in the Queue
        pl.add(10);
        pl.add(22);
        pl.add(36);
        pl.add(25);
        pl.add(16);
        pl.add(70);
        pl.add(82);
        pl.add(89);
        pl.add(14);
        System.out.println("\nOriginal Priority Queue: "+pl);

        System.out.print("\nMaximum Priority Queue: ");
        Integer val = null;
        while( (val = pl.poll()) != null) {
            System.out.print(val+"  ");
        }
        System.out.print("\n");
    }
}



