package com.example.backend_app.Service;


import org.springframework.stereotype.Service;

@Service
public class HomeService {


    public String getMessage(){
        return "Home service is being called";
    }
}
