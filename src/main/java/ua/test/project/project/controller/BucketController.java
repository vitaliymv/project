package ua.test.project.project.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ua.test.project.project.domain.Bucket;
import ua.test.project.project.domain.Parts;
import ua.test.project.project.domain.User;
import ua.test.project.project.services.BucketService;
import ua.test.project.project.services.UserService;

import java.util.Optional;

@Controller
public class BucketController {
    private UserService userService;
    private BucketService bucketService;
    public BucketController(UserService userService,
                            BucketService bucketService) {
        this.userService = userService;
        this.bucketService = bucketService;
    }

    @GetMapping("/user-bucket")
    public String getBucket(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("name", auth.getName());
        return "userBucket";
    }
    @GetMapping("/testingBucket")
    public String bucket(Model model){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Object o = userService.loadUserByUsername(auth.getName());
        model.addAttribute("lol" ,((User) o).getId());
        Optional<Bucket> bucketOptional = bucketService.findByUserId(((User) o).getId());
        if(!bucketOptional.isPresent()) {
            Bucket bucket = new Bucket();
            bucket.setUser(userService.findUserById(((User) o).getId()));
            bucket.setPrice((float) 0);
            bucketService.create(bucket);
            return "test";
        }
        return "test";
    }

    @PostMapping("/addToBucket")
    public String addToBucket(Model model) {
        Bucket bucket = new Bucket();
        return null;
    }
}
