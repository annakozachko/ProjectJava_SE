package ua.intita.qa.homework11;

import java.util.Date;

public class DemoDate {

        public static void main(String[] args) {
            Date date1 = new Date();
            System.out.println("Текущая дата: " + date1);
            System.out.println("Количество мс: " + date1.getTime());
            System.out.println(date1.toInstant());
            System.out.println(date1.clone());
            System.out.println();

            Date date2 = new Date(12121212);
            System.out.println("Установленная дата: " + date2);
            date2.setTime(34343434);
            System.out.println("Измененная дата: " + date2);
        }



}
