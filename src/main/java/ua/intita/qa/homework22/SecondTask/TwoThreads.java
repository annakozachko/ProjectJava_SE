package ua.intita.qa.homework22.SecondTask;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoThreads implements Runnable{
    private  final  String name;
    public TwoThreads(String name){
        this.name = name;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println(name);

        }catch (InterruptedException e){
            Logger.getLogger(TwoThreads.class.getName()).log(Level.SEVERE, name);
        }
    }
}
