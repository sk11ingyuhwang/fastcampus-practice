package com.fastcampus.practice.controller;

import com.fastcampus.practice.service.StringSortService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MainController {

    private final StringSortService stringSortService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public List<String> main(@RequestParam List<String> list) {
        return stringSortService.doSort(list);
    }

    @GetMapping("/test1")
    public String test1(){

        logger.trace("Trace Level 테스트");
        logger.debug("DEBUG Level 테스트");
        logger.info("INFO Level 테스트");
        logger.warn("Warn Level 테스트");
        logger.error("ERROR Level 테스트");

        long start = System.currentTimeMillis();
        long end = System.currentTimeMillis();
        log.warn("걸린 시간: {}ms", end-start);
        return "걸린 시간 테스트";
    }
}

