package ua.test.project.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.services.CategoryService;
import ua.test.project.project.services.ManufacturerService;
import ua.test.project.project.services.ModelService;
import ua.test.project.project.services.PartsService;

@Controller
public class AdminController {

    private PartsService partsService;
    private ManufacturerService manufacturerService;
    private ModelService modelService;
    private CategoryService categoryService;

    public AdminController(PartsService partsService, ManufacturerService manufacturerService, ModelService modelService, CategoryService categoryService) {
        this.partsService = partsService;
        this.manufacturerService = manufacturerService;
        this.modelService = modelService;
        this.categoryService = categoryService;
    }

    @GetMapping("/admin/admin/adminchik")
    public String adminPanel(Model model) {
        model.addAttribute("AllParts", partsService.findAll());
        model.addAttribute("AllManufacturers", manufacturerService.findAll());
        model.addAttribute("AllModels", modelService.findAll());
        model.addAttribute("AllCategory", categoryService.findAll());
        return "adminka";
    }

    @GetMapping("/admin/admin/adminchik/editing/{partId}")
    public String editProduct(Model model, @PathVariable Long partId, @ModelAttribute Parts parts) {
        model.addAttribute("AllManufacturers", manufacturerService.findAll());
        model.addAttribute("AllModels", modelService.findAll());
        model.addAttribute("AllCategory", categoryService.findAll());
        return "adminkaEdit";
    }

    @PostMapping("/admin/admin/adminchik/create")
    public String createProduct(Model model, @ModelAttribute Parts parts) {
        model.addAttribute("AllManufacturers", manufacturerService.findAll());
        model.addAttribute("AllModels", modelService.findAll());
        model.addAttribute("AllCategory", categoryService.findAll());
        partsService.create(parts);
        return "adminkaCreate";
    }

    @GetMapping("/admin/admin/adminchik/create")
    public  String getCreatePage(Model model) {
        model.addAttribute("AllManufacturers", manufacturerService.findAll());
        model.addAttribute("AllModels", modelService.findAll());
        model.addAttribute("AllCategory", categoryService.findAll());
        return "adminkaCreate";
    }
    @GetMapping("/admin/admin/adminchik/deleting")
    public String deleteProduct(@RequestParam Long id){
        partsService.deleteById(id);
        return "redirect:";
    }

}
