package com.fastcampus.practice.controller;

import com.fastcampus.practice.service.StringSortService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class MainController {

    private final StringSortService stringSortService;


    @GetMapping("/")
    public List<String> main(@RequestParam List<String> list) {
        return stringSortService.doSort(list);
    }
}
