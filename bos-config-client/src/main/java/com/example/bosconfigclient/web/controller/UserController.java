package com.example.bosconfigclient.web.controller;

import com.example.bosconfigclient.dto.UserDto;
import com.example.bosconfigclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public CompletableFuture add(@Valid @RequestBody UserDto userDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            for (ObjectError objectError :bindingResult.getAllErrors()){
                return CompletableFuture.supplyAsync(()->objectError.getDefaultMessage());
            }
        }
        return userService.userAdd(userDto);
    }


}
