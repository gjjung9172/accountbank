package com.gilbert.accountbank.app.service.serviceImpl;

import com.gilbert.accountbank.app.mapper.UserMapper;
import com.gilbert.accountbank.app.model.UserDto;
import com.gilbert.accountbank.app.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> users = userMapper.getAllUsers();
        return users;
    }

    @Override
    public UserDto getUser(String username) {
        UserDto user = userMapper.getUser(username);
        return user;
    }

    @Override
    public void addUser(UserDto userDto) {
       userMapper.addUser(userDto);
    }

    @Override
    public void edit(String username, UserDto editUser) {

        UserDto user = userMapper.getUser(username);

        if (editUser.getAge() == 0) {
            editUser.setAge(user.getAge());
        }

        userMapper.editUser(username, editUser);
    }

}
