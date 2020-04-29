package ua.test.project.project.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.test.project.project.domain.Category;
import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.services.CategoryService;
import ua.test.project.project.services.ManufacturerService;
import ua.test.project.project.services.ModelService;
import ua.test.project.project.services.PartsService;

import java.util.*;

@Controller
public class AdminController {

    private PartsService partsService;
    private ManufacturerService manufacturerService;
    private ModelService modelService;
    private CategoryService categoryService;

    public AdminController(PartsService partsService,
                           ManufacturerService manufacturerService,
                           ModelService modelService,
                           CategoryService categoryService) {
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


@GetMapping("/admin/admin/adminchik/create-validate")
@ResponseBody
public String get(@RequestParam Long id) {

    JSONArray jsonArray = new JSONArray();
    for (Object o: modelService.findByManufacturerId(id)) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", ((ua.test.project.project.domain.Model) o).getName());
        jsonObject.put("id", ((ua.test.project.project.domain.Model) o).getId());
        jsonArray.put(jsonObject);
    }
    return jsonArray.toString(2);
}

    @GetMapping("/admin/admin/adminchik/create")
    public  String getAddCreatePartsPage(Model model) {
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

    @GetMapping("/admin/admin/adminchik/add-manuf")
    public String getAddManufPage() {
        return "adminkaCreateManuf";
    }

    @PostMapping("/admin/admin/adminchik/add-manuf")
    public String addManuf(@ModelAttribute Manufacturer manufacturer) {
        manufacturerService.create(manufacturer);
        return "adminkaCreateManuf";
    }

    @GetMapping("/admin/admin/adminchik/add-model")
    public String getAddModelPage(Model model) {
        model.addAttribute("AllManufacturers", manufacturerService.findAll());
        return "adminkaCreateModel";
    }

    @PostMapping("/admin/admin/adminchik/add-model")
    public String addModel(@ModelAttribute ua.test.project.project.domain.Model model) {
        modelService.create(model);
        return "adminkaCreateModel";
    }

    @GetMapping("/admin/admin/adminchik/add-category")
    public String getAddCategoryPage(Model model) {
        model.addAttribute("AllManufacturers", manufacturerService.findAll());
        return "adminkaCreateCategory";
    }

    @PostMapping("/admin/admin/adminchik/add-category")
    public String addCategory(@ModelAttribute Category category) {
        categoryService.create(category);
        return "adminkaCreateCategory";
    }

}
