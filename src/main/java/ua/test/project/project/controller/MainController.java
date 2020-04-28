package ua.test.project.project.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.Model;
import ua.test.project.project.services.ManufacturerService;
import ua.test.project.project.services.ModelService;


import java.util.List;

@Controller
public class MainController {

    private ModelService modelService;
    private ManufacturerService manufacturerService;

    public MainController(ModelService modelService,
                          ManufacturerService manufacturerService) {
        this.modelService = modelService;
        this.manufacturerService = manufacturerService;
    }

    @GetMapping("/")
    public ModelAndView getModels() {
        List<Model> modelList = modelService.findAll();
        ModelAndView mav = new ModelAndView("manuf-list");
        mav.addObject("models", modelList);
        List<Manufacturer> manufacturerList = manufacturerService.findAll();
        mav.addObject("manufacturers", manufacturerList);
        return mav;
    }

    @GetMapping("/about-us")
    public String getAboutUs() {
        return "about-us";
    }

    @GetMapping("/contacts")
    public String getContacts() {
        return "contacts";
    }


}