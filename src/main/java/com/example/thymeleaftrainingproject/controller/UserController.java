package com.example.thymeleaftrainingproject.controller;



import com.example.thymeleaftrainingproject.enums.State;
import com.example.thymeleaftrainingproject.model.User;
import com.example.thymeleaftrainingproject.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")    // localhost://8080/user/register
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/register")
    public String registerUser(Model model) {
        model.addAttribute("users", userService.getUsers());
        return "/user/register-page";
    }

    @GetMapping("/create-page")
    public String getFormPage(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("states", State.values());
        return "/user/create-page";
    }

    @PostMapping("create")
    public String createUser(@ModelAttribute  User user) {
        userService.save(user);
        return "redirect:/user/register";
    }

}
