package com.bahrini.user.controller;

import com.bahrini.user.ValueObject.RespanseTempleteVO;
import com.bahrini.user.model.User;
import com.bahrini.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user){
        log.info("insed saveUser of UserController");
        return  userService.saveUser(user);
    }
    @GetMapping("/{id}")
    public RespanseTempleteVO getUserWithDepartment(@PathVariable("id") Long userId){
        log.info("insed getUserWithDepartment of UserController");
        return  userService.getUserWithDepartment(userId);
    }
}
