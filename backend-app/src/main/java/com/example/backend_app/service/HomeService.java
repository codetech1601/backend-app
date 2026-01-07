package com.example.backend_app.service;


import com.example.backend_app.Entity.User;
import com.example.backend_app.reposiory.HomeRepo;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

private final HomeRepo homeRepo;

    public HomeService(HomeRepo homeRepo){
        this.homeRepo=homeRepo;
    }

    public String getMessage(){
        return "Home service is being called";
    }

    public void saveUser(User user){
        homeRepo.save(user);
    }

}
