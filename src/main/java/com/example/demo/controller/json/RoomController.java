package com.example.demo.controller.json;

import com.example.demo.DemoApplication;
import com.example.demo.model.Room;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/room")
public class RoomController {

    @GetMapping("{roomId}")
    public Room getRoom(@PathVariable int roomId){
        try{
            return DemoApplication.home.getRooms().get(roomId);
        }catch (Exception e){
            return null;
        }
    }



}
