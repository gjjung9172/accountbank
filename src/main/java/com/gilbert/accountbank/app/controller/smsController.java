package com.gilbert.accountbank.app.controller;

import com.gilbert.accountbank.app.model.SmsDto;
import com.gilbert.accountbank.app.service.SmsService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class smsController {

    private final SmsService smsService;

    @GetMapping("/sms")
    public List<SmsDto> getSms() {
        List<SmsDto> smsList = smsService.getSmsByUid();
        return smsList;
    };

    @PostMapping("/send")
    public void saveSms(@Validated @RequestBody SmsDto sms) {
        smsService.save(sms);
    }
}
