package com.sfs.controller;

import com.sfs.entity.User;
import com.sfs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegistrationPage() {
        return "register";
    }

    @PostMapping("/register")
    public String processRegistration(
        @RequestParam String fullName,
        @RequestParam String email,
        @RequestParam String username,
        @RequestParam String password,
        @RequestParam String confirmPassword,
        Model model
    ) {
        // Validate password match
        if (!password.equals(confirmPassword)) {
            model.addAttribute("error", "Passwords do not match");
            return "register";
        }

        try {
            User user = new User();
            user.setFullName(fullName);
            user.setEmail(email);
            user.setUsername(username);
            user.setPassword(password);

            userService.registerNewUser(user);
            return "redirect:/login?registersuccess";
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "register";
        }
    }

    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard";
    }
}