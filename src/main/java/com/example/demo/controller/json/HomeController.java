package com.example.demo.controller.json;

import com.example.demo.DemoApplication;
import com.example.demo.model.Home;
import com.example.demo.model.SmartDevice;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/home")
public class HomeController {

    @GetMapping("")
    public Home getHome(){
        return DemoApplication.home;

    }

    @PostMapping("")
    public Home action(){
        DemoApplication.home.getRooms().forEach(r ->{
            r.getSmartDevices().forEach(SmartDevice::doAction);
        });

        return getHome();
    }

}
