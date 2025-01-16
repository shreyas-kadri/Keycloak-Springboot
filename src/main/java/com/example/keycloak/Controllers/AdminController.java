package com.example.keycloak.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/api")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminApi()
    {
        return "This is an admin only api";
    }
}
