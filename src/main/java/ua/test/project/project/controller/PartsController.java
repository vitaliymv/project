package ua.test.project.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.test.project.project.domain.Category;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.services.CategoryService;
import ua.test.project.project.services.ModelService;
import ua.test.project.project.services.PartsService;

import java.util.List;

@Controller
public class PartsController {

    private PartsService partsService;
    private CategoryService categoryService;

    public PartsController(PartsService partsService, CategoryService categoryService) {
        this.partsService = partsService;
        this.categoryService = categoryService;
    }

    @RequestMapping("/qwe")
    public ModelAndView getParts() {
        List<Parts> partsList = partsService.findAll();
        ModelAndView mav = new ModelAndView("parts-list");
        mav.addObject("parts", partsList);
        List<Category> categoryList = categoryService.findAll();
        mav.addObject("categoryList", categoryList);
        return mav;
    }

    @GetMapping("/models/{modelId}")
    public String getPartsByModels(@PathVariable Long modelId, Model model) {
        model.addAttribute("partsByModel", partsService.findByModelId(modelId));
        model.addAttribute("category", categoryService.findAll());
        model.addAttribute("model", modelId);
        return "partsByModel";
    }

    @GetMapping("/models/{modelId}/{categoryId}")
    public String getPartsByModelsAndCategory(@PathVariable Long modelId, @PathVariable Long categoryId, Model model) {
        model.addAttribute("partsByModAndCat", partsService.findByCategoryIdAndModelId(categoryId, modelId));
        return "partsByCategory";
    }

    @GetMapping("/qwe/{categoryId}")
    public String getPartsByCategory(@PathVariable Long categoryId, Model model) {
        model.addAttribute("partsByCategory", partsService.findByCategoryId(categoryId));
        return "partsByCat";
    }
}
