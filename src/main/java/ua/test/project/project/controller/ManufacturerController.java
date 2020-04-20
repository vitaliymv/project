package ua.test.project.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.test.project.project.services.ModelService;

@Controller
public class ManufacturerController {

    private ModelService modelService;
    public ManufacturerController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping("/manufacturer/{manufacturerId}")
    public String getModelsByManufacturer(@PathVariable Long manufacturerId, Model model) {
        model.addAttribute("models", modelService.findByManufacturerId(manufacturerId));
        return "models-list";
    }





}
