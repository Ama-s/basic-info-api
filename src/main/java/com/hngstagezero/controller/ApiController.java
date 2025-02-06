package com.hngstagezero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class ApiController {
    @GetMapping("/getInfo")
    public Map<String, String> getInfo() {
        Map<String, String> response = new HashMap<>();
        response.put("email", "arkudeborah123@gmail.com");
        response.put("current_datetime", Instant.now().atOffset(ZoneOffset.UTC)
                .format(DateTimeFormatter.ISO_INSTANT));
        response.put("github_url", "https://github.com/Ama-s/basic-info-api");

        return response;
    }
}
