package ua.test.project.project.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import ua.test.project.project.domain.Manufacturer;
import ua.test.project.project.domain.User;
import ua.test.project.project.services.UserService;

import java.util.List;

@Controller
public class UserController  {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @GetMapping("/qwe")
//    public String getUserId(Model model) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        Object o = userService.loadUserByUsername(auth.getName());
//        model.addAttribute("lol" ,((User) o).getId());
//        return "test";
//    }


}
