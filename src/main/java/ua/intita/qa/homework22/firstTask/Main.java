package ua.intita.qa.homework22.firstTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started ...");
        new FirstThread("Anna").start();
        (new Thread(new SecondThread())).start();
        ThirdThread thirdThread = new ThirdThread();
        thirdThread.run();
        System.out.println("Main thread finished ...");

    }
}
//SecondThread