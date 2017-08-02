package com.vets.controller;

import com.vets.model.Status;
import com.vets.model.User;
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
public class CustomerInventoryController {
    @Controller
    @RequestMapping("/car")
    public class RestController {

        @Autowired
        DataServices dataServices;

        /*static*/ final Logger logger = Logger.getLogger(com.vets.controller.RestController.class);

        @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
        public @ResponseBody
        Status addEmployee(@RequestBody User user) {
            try {
                dataServices.addEntity(user);
                return new Status(1, "Car added Successfully !");
            } catch (Exception e) {
                // e.printStackTrace();
                return new Status(0, e.toString());
            }

        }

        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public @ResponseBody
        User getEmployee(@PathVariable("id") long id) {
            User user = null;
            try {
                user = dataServices.getEntityById(id);

            } catch (Exception e) {
                e.printStackTrace();
            }
            return user;
        }

        @RequestMapping(value = "/list", method = RequestMethod.GET)
        public @ResponseBody
        List<User> getEmployee() {

            List<User> userList = null;
            try {
                userList = dataServices.getEntityList();

            } catch (Exception e) {
                e.printStackTrace();
            }

            return userList;
        }

        @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
        public @ResponseBody
        Status deleteEmployee(@PathVariable("id") long id) {

            try {
                dataServices.deleteEntity(id);
                return new Status(1, "Car deleted Successfully !");
            } catch (Exception e) {
                return new Status(0, e.toString());
            }

        }
    }

}
