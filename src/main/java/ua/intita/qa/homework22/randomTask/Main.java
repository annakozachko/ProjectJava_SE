package ua.intita.qa.homework22.randomTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started ...");
        RandomThread maxThread = new RandomThread("MaxNumber");

        RandomThread minThread = new RandomThread("MinNumber");
        maxThread.run();
        minThread.run();
        System.out.println("Main thread finished ...");
    }
}


