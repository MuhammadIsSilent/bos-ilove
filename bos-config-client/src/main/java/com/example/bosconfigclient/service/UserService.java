package com.example.bosconfigclient.service;

import com.example.bosconfigclient.dto.UserDto;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public interface UserService {

    CompletableFuture userAdd(UserDto userDto);

}
