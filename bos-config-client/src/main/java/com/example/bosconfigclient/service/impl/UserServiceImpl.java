package com.example.bosconfigclient.service.impl;

import com.example.bosconfigclient.dto.Converter;
import com.example.bosconfigclient.dto.UserDto;
import com.example.bosconfigclient.model.User;
import com.example.bosconfigclient.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Service
public class UserServiceImpl extends Converter<UserDto, User> implements UserService {

    @Override
    protected User doForward(UserDto userDto) {

        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }

    @Override
    protected UserDto doBackward(User user) {
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }


    @Override
    public CompletableFuture userAdd(UserDto userDto) {
        User user = this.doForward(userDto);
        Map<String, Object> map = new HashMap<>();
        map.put("user", user);
        return CompletableFuture.supplyAsync(() -> map);
    }
}
