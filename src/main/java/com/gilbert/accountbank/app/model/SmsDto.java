package com.gilbert.accountbank.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.util.Date;

@Getter @Setter
@AllArgsConstructor
@JsonIgnoreProperties("id")
public class SmsDto {

    @Nullable
    private int id;

    @NonNull
    private int uid;

    @NonNull
    private String description;

    @NonNull
    private String phone;

    @NonNull
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String date;

}
