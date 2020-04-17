package ua.test.project.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.services.PartsService;

import java.util.List;

@Controller
public class PartsController {

    private PartsService partsService;

    public PartsController(PartsService partsService) {
        this.partsService = partsService;
    }

    @RequestMapping("/qwe")
    public ModelAndView getParts() {
        List<Parts> partsList = partsService.findAll();
        ModelAndView mav = new ModelAndView("parts-list");
        mav.addObject("parts", partsList);
        return mav;
    }
}
