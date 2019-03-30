package com.example.gocddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用于查询日期
 */
@RestController
public class DateController {

    /**
     * 用于获取当天的字符串
     * @return str
     */
    @GetMapping("/getTodayDateStr")
    public String getTodayDateStr() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(new Date());
    }
}
