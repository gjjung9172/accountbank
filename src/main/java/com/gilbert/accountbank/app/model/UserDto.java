package com.gilbert.accountbank.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    private int id;
    private String username;
    private int age;
    private String bank;
    private String phone;
    private String address;
}
