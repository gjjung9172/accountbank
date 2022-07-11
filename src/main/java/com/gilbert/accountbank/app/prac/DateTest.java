package com.gilbert.accountbank.app.prac;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {

        Date today = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyyMMdd");

        System.out.println(format1.format(today));
        System.out.println(format1.format(today).getClass());
    }
}
