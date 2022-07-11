package com.gilbert.accountbank.app.mapper;

import com.gilbert.accountbank.app.model.SmsDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SmsMapper {

    List<SmsDto> getSmsByUid();

    void save(SmsDto sms);
}
