package com.codegym.controller;

import com.codegym.model.Smartphone;
import com.codegym.service.SmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class ApiSmartphoneController {

    @Autowired
    private SmartphoneService smartphoneService;

    @GetMapping(value = "/api/smartPhones/")
    public ResponseEntity<Iterable<Smartphone>> listAllPhones() {
        Iterable<Smartphone> allPhones = smartphoneService.findAll();
        if (allPhones == null) {
            return new ResponseEntity<Iterable<Smartphone>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<Iterable<Smartphone>>(allPhones, HttpStatus.OK);
    }

    @DeleteMapping(value = "/api/smartPhones/{id}")
    public ResponseEntity<Smartphone> delete(@PathVariable int id) {
        Smartphone smartphone = smartphoneService.findById(id);
        if (smartphone == null) {
            return new ResponseEntity<Smartphone>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        smartphoneService.remove(id);
        return new ResponseEntity<Smartphone>(smartphone, HttpStatus.OK);
    }

    @PostMapping(value = "/api/smartPhones/create")
    public ResponseEntity<Smartphone> create(@RequestBody Smartphone smartphone) {
        smartphoneService.save(smartphone );
        return new ResponseEntity<Smartphone>(smartphone, HttpStatus.OK);
    }

    @GetMapping(value = "/api/smartPhones/{id}")
    public ResponseEntity<Smartphone> getPhoneById(@PathVariable int id) {
        Smartphone smartphone=smartphoneService.findById(id);
        return new ResponseEntity<Smartphone>(smartphone, HttpStatus.OK);
    }

    @PutMapping(value = "/api/smartPhones/")
    public ResponseEntity<Smartphone> getPhoneById(@RequestBody Smartphone smartphone) {
        smartphoneService.save(smartphone);
        return new ResponseEntity<Smartphone>(smartphone, HttpStatus.OK);
    }


}