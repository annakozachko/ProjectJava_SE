import org.junit.Test;
import ua.intita.qa.homework16.dao.CarDao;
import ua.intita.qa.homework16.dao.CommonDao;
import ua.intita.qa.homework16.entity.Car;


import java.util.Collection;

public class CarDaoTest {
    private final CommonDao<Car> dao = new CarDao();

    @Test
    public void save() {
        Car car1 = new Car();
        car1.setName("BMV");
        car1.setModel("X5");
        car1.setYear(2020);

        Car car2 = new Car();
        car2.setName("Mitsubishi");
        car2.setModel("ASX");
        car2.setYear(2019);

        Car savedCar1 = dao.save(car1);
        Car savedCar2 = dao.save(car2);
        System.out.println(savedCar1);
        System.out.println(savedCar2);

        System.out.println("FIND ALL");
        Collection<Car> all = dao.findAll();
        for (Car car : all) {
            System.out.println(car);
        }

        System.out.println("FIND BY ID");
        Car byId = dao.findById(savedCar1.getCarId());
        System.out.println(byId);

        car1.setYear(2021);
        Car savedCar1new = dao.save(car1);
        System.out.println(savedCar1new);

        Car byId1 = dao.findById(savedCar1.getCarId());
        System.out.println(byId1);

        dao.delete(savedCar1.getCarId());

        Collection<Car> all1 = dao.findAll();
        for (Car car : all1) {
            System.out.println(car);
        }
    }
}
