package com.example.backend_app.Controller;


import com.example.backend_app.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/test")
    public String getMessage() {
        return homeService.getMessage();
    }
}
