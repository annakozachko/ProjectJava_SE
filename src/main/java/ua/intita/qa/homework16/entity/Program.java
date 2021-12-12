package ua.intita.qa.homework16.entity;

import javax.annotation.processing.FilerException;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class Program {
    public static void main(String[] args) {
        Map<String, Car> cars = new HashMap<String, Car>();

        try (FileInputStream fis = new FileInputStream("data/car.csv")) {

            int i = -1;
            String st = "";
            while ((i = fis.read()) != -1) {
                st = st + (char) i;
            }
            String str[] = st.split("\n");

            for (int j = 0; j < str.length; j++) {
                String strSub[] = str[j].split(",");
                Car auto = new Car();
                auto.setCarId(strSub[0]);
                auto.setName(strSub[1]);
                auto.setModel(strSub[2]);
                auto.setYear(strSub[3]);
                cars.put(strSub[0], auto);

                //out.println(auto.getCarId()+ "; "+ auto.getName() + "; " + auto.getModel() + "; " + auto.getYear());
                auto = null;
                strSub = null;
            }

            for (Map.Entry<String, Car> item : cars.entrySet()) {
                System.out.printf("Key: %s  Name: %s Model: %s  \n", item.getKey(), item.getValue().getName(),item.getValue().getModel());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


