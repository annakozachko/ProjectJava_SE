package ua.intita.qa.homework16.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.UUID;

@Data
@AllArgsConstructor
@ToString
public class Car {
    private String carId;
   private String name;
   private String model;
    private String year;

    public Car() {
        carId = UUID.randomUUID().toString();
   }
}