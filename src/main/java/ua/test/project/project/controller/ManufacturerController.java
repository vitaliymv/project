package ua.test.project.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.test.project.project.domain.Model;
import ua.test.project.project.services.ManufacturerService;
import ua.test.project.project.services.ModelService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ManufacturerController {

    private ModelService modelService;
    public ManufacturerController(ModelService modelService) {
        this.modelService = modelService;
    }

    @RequestMapping("/{manufacturer.name}")
    public ModelAndView getModels(@PathVariable("manufacturer.name") String parameter) {
        List<Model> modelList = modelService.findAll();
        List<Model> models = modelService.findByModelName(parameter);


        ModelAndView mav = new ModelAndView("models-list");
        mav.addObject("manufacturer", parameter);
        mav.addObject("models", modelList);
        return mav;
    }
}
