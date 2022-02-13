package ua.intita.qa.homework22.randomTask;

import ua.intita.qa.homework22.SecondTask.TwoThreads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RandomThread implements Runnable{
    private final String name;
     public RandomThread(String name){
        this.name = name;
     }
@Override
     public void run(){
         try {
             System.out.println(name);
             Thread.sleep(10);

             int[] array = new int[5000000];
             int maxNum = array[0];
             int minNum = array[0];

             for (int i = 0; i < array.length; i++) {
                 array[i] = (int) Math.round((Math.random() * 2000000000) - 1000000000);
                 //System.out.println(array[i]);
             }
             for (int j : array) {
                 if (j > maxNum)
                     maxNum = j;
             }
             for (int k : array) {
                 if (k > maxNum)
                     minNum = k;
             }
             System.out.println("MinNum number = " + minNum);
             System.out.println();

             System.out.println("MaxNum number = " + maxNum);
         }catch (InterruptedException e){
             Logger.getLogger(TwoThreads.class.getName()).log(Level.SEVERE, name);
         }

    }
}


