package com.gilbert.accountbank.app.service.serviceImpl;

import com.gilbert.accountbank.app.mapper.SmsMapper;
import com.gilbert.accountbank.app.model.SmsDto;
import com.gilbert.accountbank.app.service.SmsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SmsServiceImpl implements SmsService {

    private final SmsMapper smsMapper;

    @Override
    public List<SmsDto> getSmsByUid() {
        List<SmsDto> smsList = smsMapper.getSmsByUid();
        return smsList;
    }

    @Override
    public void save(SmsDto sms) {
        smsMapper.save(sms);
    }
}
