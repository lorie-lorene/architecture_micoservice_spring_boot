package com.m1_fonda.service_users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.m1_fonda.service_users.model.UserBank;
import com.m1_fonda.service_users.service.UserService;



@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    UserService service;

@PostMapping("/create")
    public List<UserBank> addUserController(@RequestBody UserBank user){
        service.addUser(user);
        return service.findUser();
    }

@GetMapping("/getUser/{id}")

public UserBank getUser(@PathVariable("id") int id) {
    return service.getUser(id);
}

@GetMapping("/deleteUser/{id}")

public List<UserBank> delete_getUser(@PathVariable("id") int id) {
    return service.deleteUser(id);


}

}
