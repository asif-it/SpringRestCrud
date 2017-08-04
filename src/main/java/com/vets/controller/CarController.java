package com.vets.controller;

import com.vets.model.Car;
import com.vets.model.Status;
import com.vets.model.User;
import com.vets.services.CarService;
import com.vets.services.DataServices;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vijayn on 8/2/2017.
 */
@Controller
@RequestMapping("/car")
public class CarController {
    @Autowired
    CarService carService;

    /*static*/ final Logger logger = Logger.getLogger(com.vets.controller.RestController.class);

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addCar(@RequestBody Car car) {
        try {
            carService.addCar(car);
            return new Status(1, "Car added Successfully !");
        } catch (Exception e) {
            // e.printStackTrace();
            return new Status(0, e.toString());
        }

    }



    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Car getCar(@PathVariable("id") long id) {
        Car car = null;
        try {
            car = carService.getCarById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return car;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    List<Car> getCars() {

        List<Car> carList = null;
        try {
            carList = carService.getCarList();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return carList;
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status deleteCar(@PathVariable("id") long id) {

        try {
            carService.deleteCar(id);
            return new Status(1, "Car deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }

    }
}
