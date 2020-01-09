package com.study.dev.controller;

import com.study.dev.domain.User;
import com.study.dev.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    //private Map<Integer, User> user = new HashMap<>();

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/create")
    public User create(@RequestBody UserDTO userDTO){
        //int id = Integer.valueOf(user.size() + 1);
        User users = toUser(userDTO);
        //user.put(id,users);
        userRepository.save(users);
        return users;
    }

    @GetMapping("/{id}")
    public User getuser(@PathVariable Integer id){
        return userRepository.findById(id).orElseThrow();
    }
    private User toUser(UserDTO userDTO){
        return new User(userDTO.getName(),userDTO.getPasswd());
    }

}
