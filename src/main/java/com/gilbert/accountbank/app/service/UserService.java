package com.gilbert.accountbank.app.service;

import com.gilbert.accountbank.app.model.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<UserDto> getAllUsers();

    UserDto getUser(String username);

    void addUser(UserDto userDto);

    void edit(String username, UserDto userDto);
}
