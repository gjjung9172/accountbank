package com.gilbert.accountbank.app.controller;

import com.gilbert.accountbank.app.model.UserDto;
import com.gilbert.accountbank.app.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class userController {

    private final UserService userService;

    // GET : 모든 유저
    @GetMapping("/users")
    public List<UserDto> getAllUsers() {
        List<UserDto> users = userService.getAllUsers();
        return users;
    }

    // GET : 특정 유저
    @GetMapping("/user/{username}")
    public UserDto getUser(@PathVariable String username) {
        UserDto user = userService.getUser(username);
        return user;
    }

    // POST : 유저 등록
    @PostMapping("/user")
    public void addUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
    }

    //회원정보 수정
    @PatchMapping("/user/{username}")
    public void editUser(@PathVariable String username, @RequestBody UserDto userDto) {
        userService.edit(username, userDto);
    }


}

