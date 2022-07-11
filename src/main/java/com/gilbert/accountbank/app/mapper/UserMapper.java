package com.gilbert.accountbank.app.mapper;

import com.gilbert.accountbank.app.model.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    // 사용자 전체 조회
    List<UserDto> getAllUsers();

    // 특정 사용자 조회
    UserDto getUser(String username);

    void addUser(UserDto userDto);

    void editUser(@Param("username") String username, @Param("user") UserDto editUser);
}
