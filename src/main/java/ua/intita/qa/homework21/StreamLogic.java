package ua.intita.qa.homework21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLogic {
    public static List<Car> getListOfCars(String fileName) throws IOException {
        List<Car> list;
        try (BufferedReader bis = new BufferedReader(new FileReader(fileName))) {
            list = bis.lines().map(s->s.split(","))
                    .map(strings -> {
                        Car car = new Car();
                        car.setCarId(strings[0]);
                        car.setName(strings[1]);
                        car.setModel(strings[2]);
                        car.setYear(strings[3]);
                        return car;
                    }).collect(Collectors.toList());
        }

          list.stream().map(Car::getName).forEach(System.out::println);
          list.stream().map(Car::getYear).forEach(System.out::println);

        return list;
    }
    public static List<Car> sortCarByName(List<Car> car1) {
        return car1.stream()
                .sorted(Comparator.comparing(Car::getName))
                .collect(Collectors.toList());

    }
    public static Car findWithMinYear(List<Car> cars) {
        return cars.stream().min(Comparator.comparing(Car::getYear)).orElse(null);
    }
//    public static boolean matchAnyMazda(List<Car> car) {
//        return car.stream().anyMatch(с -> car.getName().equals(Car.Mazda));
//    }


}
