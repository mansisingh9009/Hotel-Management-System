package com.RoomMicroservice.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RoomMicroservice.Model.Room;
import com.RoomMicroservice.Model.RoomList;
import com.RoomMicroservice.Services.Roomservice;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private Roomservice service;

	@GetMapping("/hello")
	public String hello() {
		return "Hello Department!!";
	}

	@PostMapping("/add")
	public Room addRoom(@RequestBody Room room) {
		return this.service.addRoom(room);
	}

	@GetMapping("/findAll")
	public RoomList getRoom() {

		RoomList list = new RoomList();
		list.setAllRoom(this.service.getAllRoom());
		return list;
	}

	@GetMapping("/findById/{id}")
	public Optional<Room> getRoom(@PathVariable("id") String id) {

		return this.service.getRoom(Long.parseLong(id));
	}

	@PutMapping("/update")
	public Room updateRoom(@RequestBody Room room) {
		return this.service.updateRoom(room);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteRoom(@PathVariable("id") String id) {
		return this.service.deleteRoom(Long.parseLong(id));
	}
}
