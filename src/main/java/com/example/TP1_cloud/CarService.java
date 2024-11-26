package com.example.TP1_cloud;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    public CarService() {
        // Add some sample data
        cars.add(new Car( "11AA22", "Toyota", 15, false));
        cars.add(new Car( "11AA22", "Honda", 15, true));
        cars.add(new Car( "11AA22", "Ford", 15, true));
    }

    public static List<Car> getAllCars() {
        return cars;
    }

    public Optional<Car> getCarByPlateNumber(String plateNumber) {
        return Optional.ofNullable(cars.stream()
                .filter(car -> car.getPlateNumber().equalsIgnoreCase(plateNumber))
                .findFirst()
                .orElse(null));
    }

    public Optional<Car> getRentCarByPlate( String plateNumber) {
        return Optional.ofNullable(cars.stream()
                .filter(car -> car.getPlateNumber().equalsIgnoreCase(plateNumber) && car.isRent())
                .findFirst()
                .orElse(null));
    }

}
