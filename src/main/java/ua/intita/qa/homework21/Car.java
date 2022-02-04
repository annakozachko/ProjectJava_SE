package ua.intita.qa.homework21;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.*;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import static java.util.stream.Collectors.toList;


@Data
@AllArgsConstructor
@ToString
public class Car {
    private String carId;
    private String name;
    private String model;
    private String year;

    public Car(String s, int i, String s1, String s2) {
        carId = UUID.randomUUID().toString();
    }

    InputStream is;
    {
        try {
            is = new FileInputStream(new File("car.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    BufferedReader br = new BufferedReader(new InputStreamReader(is));

    public static Function<String, Car> mapToCar = (line) -> {
        String[] p = line.split(", ");
        return new Car(p[0], Integer.parseInt(p[1]), p[2], p[3]);
    };

    List<Car> cars = br.lines()
            .map(mapToCar)
            .collect(toList());
}