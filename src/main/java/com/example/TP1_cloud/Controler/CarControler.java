package com.example.TP1_cloud.Controler;

import com.example.TP1_cloud.Data.Car;
import com.example.TP1_cloud.Service.CarService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Optional;

@RestController
public class CarControler {

    private CarService carService = new CarService();

    Logger logger = LoggerFactory.getLogger(CarControler.class);

    @GetMapping("/cars")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Car> listOfCars(){
        return carService.getAllCars();
    }

    @GetMapping("/car/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Optional<Car> aCar(@PathVariable("plateNumber") String plateNumber) throws Exception{
        return carService.getCarByPlateNumber(plateNumber);
    }

    @PutMapping(value = "/voiture/{plateNumber}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Car> rentOrGetBack(
            @PathVariable("plateNumber") String plateNumber,
            @RequestParam(value="rent", required = true)boolean rent) throws Exception{
                return carService.RentCarByPlate(plateNumber);
    }

}
