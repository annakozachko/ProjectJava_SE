package ua.intita.qa.homework22.firstTask;

public class SecondThread implements Runnable{

    public void run(){

        try{
            Thread.sleep(900);

                int n0 = 1;
                int n1 = 1;
                int n2;
                System.out.print("Числа Фибоначии:" + n0 + " " + n1+ " ");
                for(int i = 3; i <= 11; i++){
                    n2 = n0 + n1;
                    System.out.print(n2 + " ");
                    n0 = n1;
                    n1 = n2;
                }

        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }

    }
    }


