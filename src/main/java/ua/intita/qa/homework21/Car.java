package ua.intita.qa.homework21;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Comparator;

@Data
@AllArgsConstructor
@ToString
public class Car {
    private String carId;
    private String name;
    private String model;
    private String year;

    public Car() {

    }

}