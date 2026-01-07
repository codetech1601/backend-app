package com.example.backend_app.controller;


import com.example.backend_app.Entity.User;
import com.example.backend_app.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/test")
    public String getMessage() {
        return homeService.getMessage();
    }

    @GetMapping("/set")
    public String setMessage(){
        return "setMessage is called";
    }

    @PostMapping("/save")
    public String saveUser(@RequestBody User user){
   homeService.saveUser(user);
        return "User:- "+user.getName()+" saved successfully";
        //return user.getName();
    }

}
