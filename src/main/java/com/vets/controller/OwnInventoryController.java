package com.vets.controller;

import java.util.List;

import com.vets.dao.OwnInventoryDao;
import com.vets.model.OwnInventory;
import com.vets.model.User;
import com.vets.services.OwnInventoryServices;
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



@Controller
@RequestMapping("/own-inventory")
public class OwnInventoryController {

    @Autowired
    OwnInventoryServices ownInventoryServices;

    static final Logger logger = Logger.getLogger(OwnInventoryController.class);

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    Status addOwnInventory(@RequestBody OwnInventory ownInventory) {
        try {
            ownInventoryServices.addEntity(ownInventory);
            return new Status(1, "User added Successfully !");
        } catch (Exception e) {
            // e.printStackTrace();
            return new Status(0, e.toString());
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    OwnInventory getOwnInventory(@PathVariable("id") long id) {
        OwnInventory ownInventory = null;
        try {
                ownInventory = ownInventoryServices.getEntityById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
            return ownInventory;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public @ResponseBody
    List<OwnInventory> getOwnInventory() {
        List<OwnInventory> ownInventoryList = null;
        try {
            ownInventoryList = ownInventoryServices.getEntityList();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ownInventoryList;
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Status deleteOwnInventory(@PathVariable("id") long id) {

        try {
            ownInventoryServices.deleteEntity(id);
            return new Status(1, "User deleted Successfully !");
        } catch (Exception e) {
            return new Status(0, e.toString());
        }
    }
}

