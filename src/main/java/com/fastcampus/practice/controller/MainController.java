package com.fastcampus.practice.controller;

import com.fastcampus.practice.service.StringSortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final StringSortService stringSortService;

    public MainController(StringSortService stringSortService) {
        this.stringSortService = stringSortService;
    }

    @GetMapping("/")
    public String main(@RequestParam List<String> list) {
        return stringSortService.doSort(list).toString();
    }
}
