package ua.test.project.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.Model;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.repository.ManufacturerRepository;
import ua.test.project.project.services.ManufacturerService;
import ua.test.project.project.services.ModelService;
import ua.test.project.project.services.PartsService;

import java.util.List;

@Controller
public class MainController {

    private ModelService modelService;
    private ManufacturerService manufacturerService;
    private PartsService partsService;

    public MainController(ModelService modelService, ManufacturerService manufacturerService, PartsService partsService) {
        this.modelService = modelService;
        this.manufacturerService = manufacturerService;
        this.partsService = partsService;
    }

//    @GetMapping(value = "/manuf-add")
//    public String addManufacturer(@RequestParam(name = "name", required = false) String name, org.springframework.ui.Model model) {
//        model.addAttribute("name", name);
//        Manufacturer m = new Manufacturer();
//        m.setName(name);
//        manufacturerService.create(m);
//        return "index";
//    }

    @RequestMapping("/list")
    public ModelAndView getModels() {
        List<Model> modelList = modelService.findAll();
        ModelAndView mav = new ModelAndView("manuf-list");
        mav.addObject("models", modelList);
        List<Manufacturer> manufacturerList = manufacturerService.findAll();
        mav.addObject("manufacturers", manufacturerList);
        return mav;
    }



}