package ua.intita.qa.homework21;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            List<Car> cars = StreamLogic.getListOfCars("data/car.csv");
            //cars.forEach(System.out::println);
            StreamLogic.sortCarByName(cars);
            StreamLogic.findWithMinYear(cars);


        } catch (IOException e) {
            e.printStackTrace();
        }
 }
}