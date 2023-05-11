package com.hitema.jee.mvc.controllers;

import com.hitema.jee.mvc.entities.City;
import com.hitema.jee.mvc.entities.Country;
import com.hitema.jee.mvc.services.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Controller
public class CityController {
    private static final Logger log = LoggerFactory.getLogger(CityController.class);

    private CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping("/cities")
    public ModelAndView getAll(){
        log.trace("Cities Get All called ...");
        var view = new ModelAndView();
        view.addObject("mmsg","autres attribut");
        view.addObject("cities",service.readAll());
        return view;
    }

    @GetMapping("/city/{id}")
    public ModelAndView getCityDetails(@PathVariable Long id){
        log.trace("Get city details for id : " + id);
        var view = new ModelAndView("city");
        view.addObject("mmsg","autres attribut");
        view.addObject("city", service.getDetails(id));
        return view;
    }

    @GetMapping("/city/{id}/cityModify")
    public ModelAndView getCityModify(@PathVariable Long id) {
        log.trace("Appel getCityModify City : " + id);
        var view = new ModelAndView("cityModify");
        view.addObject("mmsg","autres attribut");
        view.addObject("city", service.getDetails(id));
        return view;
    }

    @PostMapping("/city/{id}/cityModify")
    public ModelAndView cityModify(@PathVariable Long id,@ModelAttribute("cityForm") City city, ModelMap model) {
        log.trace("Appel cityModify : {} ", city);
        service.create(city);
        return new ModelAndView("cityModify","city",city);
    }
}
