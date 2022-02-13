package ua.intita.qa.homework22.SecondTask;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread started ...");
        TwoThreads first = new TwoThreads("First");
        TwoThreads second = new TwoThreads("Second");
        first.run();
        second.run();
        System.out.println("Main thread finished ...");
    }
}
