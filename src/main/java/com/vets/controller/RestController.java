package com.vets.controller;

import java.io.IOException;
import java.util.List;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.vets.model.User;
import org.apache.log4j.Logger;
import com.vets.model.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vets.services.DataServices;
import sun.misc.BASE64Decoder;

import javax.ws.rs.HeaderParam;

@Controller
@RequestMapping("/user")
public class RestController {
    @Autowired
    DataServices dataServices;

    static final Logger logger = Logger.getLogger(RestController.class);

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addEmployee(@RequestBody User user) {
        try {
            dataServices.addEntity(user);
            return new Status(1, "User added Successfully !");
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
            return new Status(1, "User deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }

    @RequestMapping(value = "auth", method = RequestMethod.GET)
    public @ResponseBody
    Boolean login(@HeaderParam("Authorization") String authString) {
        String[] authParts = authString.split(" ");
        String authInfo = authParts[1];

        // Decode the data back to original string
        byte[] bytes = null;
        try {
            bytes = new BASE64Decoder().decodeBuffer(authInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String decodedAuth = new String(bytes);
        System.out.println(decodedAuth); //Username:Password

        String[] auth = decodedAuth.split(":");
        try {
            return dataServices.isAuthenticated(auth[0], auth[1]);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
