package ua.intita.qa.homework16.dao;

//import ua.intita.qa.homework16.entity.Car;
//
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Map;
//
//public class CarDao implements CommonDao<Car> {
//    private final Map<String, Car> cars = new HashMap<String, Car>();
//
//    @Override
//    public Car save(Car car) {
//        Car result = cars.get(car.getCarId());
//
//        if (result != null) {
//            result.setName(car.getName());
//            result.setModel(car.getModel());
//            result.setYear(car.getYear());
//            car = result;
//        }
//        cars.put(car.getCarId(), car);
//        return car;
//    }
//
//    @Override
//    public Car findById(String id) {
//        return cars.get(id);
//    }
//
//    @Override
//    public Collection<Car> findAll() {
//        return cars.values();
//    }
//
//    @Override
//    public void delete(String id) {
//        cars.remove(id);
//    }
//
//}
