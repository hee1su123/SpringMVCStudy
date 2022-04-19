package com.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    // login 페이지 redirect
    @GetMapping("/login")
    public String redirectLoginPage() {
        return "redirect:/login-form.html";
    }

    // POST 요청이 들어 오면서 요청이 form 태그 타입이므로 @RequestParam 명시
    @PostMapping("/login")
    public String loginResult(Model model, @RequestParam String id, @RequestParam String password) {

        if (id.equals(password)) {
            model.addAttribute("loginId", id);
        }
        return "login-result";
    }
}
