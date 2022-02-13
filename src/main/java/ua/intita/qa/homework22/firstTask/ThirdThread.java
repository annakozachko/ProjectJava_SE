package ua.intita.qa.homework22.firstTask;

public class ThirdThread implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
            long sum = 0;
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
                System.out.println(sum);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
