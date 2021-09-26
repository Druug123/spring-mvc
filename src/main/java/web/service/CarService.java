package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Ford", 2001));
        cars.add(new Car(2, "Renault", 2002));
        cars.add(new Car(3, "Lada", 2003));
        cars.add(new Car(4, "BMW", 2004));
        cars.add(new Car(5, "Mercedes", 2005));
    }

    public List<Car> showCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
