package com.example.demo;

import com.example.demo.model.Home;
import com.example.demo.model.Room;
import com.example.demo.model.SmartDevice;
import com.example.demo.model.devices.LightBulb;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication {

	public static Home home;


	public static void main(String[] args) {
		SmartDevice device = new LightBulb();
		List<SmartDevice> devices = new ArrayList();
		devices.add(device);
		Room room = new Room(devices);
		List<Room> rooms = new ArrayList<>();
		rooms.add(room);
		home = new Home(rooms);

		SpringApplication.run(DemoApplication.class, args);
	}
}
