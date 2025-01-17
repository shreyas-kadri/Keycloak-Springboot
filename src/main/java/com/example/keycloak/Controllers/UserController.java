package com.example.keycloak.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/api")
    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public String userApi()
    {
        return "This is user api";
    }
}
