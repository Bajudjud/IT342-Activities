package com.Bagarinao.oauth2.Controller;

import java.util.Map;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Make it a REST controller
@RequestMapping("/") // Base path for all endpoints
public class UserController {
    
    @GetMapping("/user-info")
    public Map<String, Object> getUser(@AuthenticationPrincipal OAuth2User principal) {
        return principal.getAttributes();
    }
    
    @GetMapping("/secured")
    public String secured() {
        return "Hello secure";
    }
}
