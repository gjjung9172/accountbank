package com.gilbert.accountbank.app.service;

import com.gilbert.accountbank.app.model.SmsDto;

import java.util.List;

public interface SmsService {
    List<SmsDto> getSmsByUid();

    void save(SmsDto sms);
}
