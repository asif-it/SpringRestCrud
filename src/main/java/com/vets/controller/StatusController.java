package com.vets.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.vets.dao.CarDao;
import com.vets.model.Car;
import com.vets.model.User;
import com.vets.services.DataServicesImpl;
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
@RequestMapping("/health")
public class StatusController implements Serializable {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Status up() {
        return new Status(1, "Up");
    }
}
