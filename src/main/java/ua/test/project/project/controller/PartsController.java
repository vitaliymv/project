package ua.test.project.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.domain.User;
import ua.test.project.project.services.CategoryService;
import ua.test.project.project.services.ModelService;
import ua.test.project.project.services.PartsService;
import ua.test.project.project.services.UserService;

import java.util.Optional;

@Controller
public class PartsController {

    private PartsService partsService;
    private CategoryService categoryService;
    private ModelService modelService;
    public PartsController(PartsService partsService,
                           CategoryService categoryService,
                           ModelService modelService) {
        this.partsService = partsService;
        this.categoryService = categoryService;
        this.modelService = modelService;
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
        model.addAttribute("Category", categoryService.findAll());
        return "partsByCategory";
    }

    @GetMapping("/parts/{partId}")
    public String getParts(@PathVariable Long partId, Model model) {
        Optional<Parts> partsOptional = partsService.findById(partId);
        model.addAttribute("category", categoryService.findAll());
        if (partsOptional.isPresent()) {
            model.addAttribute("part", partsOptional.get());
            return "about-parts";
        }
        return "not found";
    }

}
