package ua.intita.qa.homework22.firstTask;

public class FirstThread extends Thread{
    FirstThread(String name){
        super(name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(500);
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
                e.printStackTrace();
            }
        System.out.println(Thread.currentThread().getName());
    }
}
