package com.lms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public ModelAndView redirectToNextPage(@RequestParam String loginType) {
        String nextPage;
        if ("admin".equals(loginType)) {
            nextPage = "redirect:/admin/adminlogin";
        } else if ("student".equals(loginType)) {
            nextPage = "redirect:/student/studentlogin";
        } else {
            nextPage = "login";
        }
        return new ModelAndView(nextPage);
    }
}
