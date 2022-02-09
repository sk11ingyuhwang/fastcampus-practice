package com.fastcampus.practice.controller;

import com.fastcampus.practice.service.StringSortService;
import java.util.Objects;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MainController {

    private Logger logger = LoggerFactory.getLogger(MainController.class);
    private final Log log = LogFactory.getLog(MainController.class);
    private final StringSortService stringSortService;

    @GetMapping("/")
    public String main(@RequestParam List<String> list) {
        log.info("이것은 로그입니다.");
        logger.info("나는 {}입니다.",list);
        return stringSortService.doSort(list).toString();
    }

    @PostMapping("/student")
    public String student(@RequestBody @Valid Student student){
        return student.name + ": " +student.age + "살";
    }

    public static class Student {
        @NotBlank
        private String name;
        @Digits(fraction = 0, integer = 200) private String age;
    }

//    @RequiredArgsConstructor
//    @EqualsAndHashCode
//    @ToString
//    @Getter
//    public static class StudentClass {
//        @NotBlank private String name;
//        @Digits(fraction=0, integer = 4) private final String age;
//    }
//
//    public void test(){
//        StudentClass studentClass = new StudentClass("uno",18);
//        studentClass.getAge();
//        studentClass.getName();
//        studentClass.toString();
//
//        Student student = new Student("uno",18);
//        student.age();
//        student.name();
//        student.toString();
//    }
}
