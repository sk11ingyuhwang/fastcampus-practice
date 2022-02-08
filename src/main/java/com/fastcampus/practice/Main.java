package com.fastcampus.practice;

import com.fastcampus.practice.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.fastcampus.practice.service.StringSortService;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StringSortService service = context.getBean(StringSortService.class);

        List<String> list = service.doSort(Arrays.asList(args));

        System.out.println("Hello world! - result: " + list);
    }

}
