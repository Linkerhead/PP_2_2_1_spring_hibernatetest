package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Queue;

public interface CarDao {
    void add(Car car);

    List<Car> listCars();



}
