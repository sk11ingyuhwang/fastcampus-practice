package com.fastcampus.practice.controller;

import com.fastcampus.practice.service.StringSortService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MainController {

    private final StringSortService stringSortService;


    @GetMapping("/")
    public List<String> main(@RequestParam List<String> list) {
        return stringSortService.doSort(list);
    }

    @GetMapping("/test1")
    public String test1(){
        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        log.warn("걸린 시간: {}ms", end-start);
        return "걸린 시간 테스트";
    }
}

