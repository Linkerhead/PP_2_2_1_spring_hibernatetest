package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;


    @Transactional
    @Override
    public void add(Car car) {
        carDao.add(car);

    }

    @Transactional
    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Transactional
    @Override
    public List<User> findByCar(Car car) {
        TypedQuery<User> query = carDao.findByCar();
        query.setParameter("carName", car.getModel());
        query.setParameter("carSeries", car.getSeries());
        return query.getResultList();
    }


}

