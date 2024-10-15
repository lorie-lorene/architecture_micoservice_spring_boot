package com.m1_fonda.service_users.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m1_fonda.service_users.model.UserBank;
import com.m1_fonda.service_users.repository.UserRepository;

@Service
public class UserService {
     @Autowired
     UserRepository userRepository;

     public void addUser( UserBank user)
     {
        userRepository.save(user);
     }


    public List<UserBank> deleteUser(int id){
        userRepository.deleteById(id);
        return userRepository.findAll();
    }

    public List<UserBank> findUser(){
        return userRepository.findAll();
    }

    public UserBank getUser(int id){
     return userRepository.findById(id).orElse(null);

    }
 }