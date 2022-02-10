package com.fastcampus.practice.bean;

import com.fastcampus.practice.logic.JavaSort;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {

//    private Integer number;
//
//    public Beans(Integer number){
//        this.number = number;
//    }

    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    @Bean
    public JavaSort<String> javaSort(){
//        Beans beans1 = new Beans(10);
        //1,2,3, 만듬

        //유틸리티 클래스 동일한 상태에따라 다른 동작하는게 아니라 한결같은 동작

//        StringUtils.capitalize("asdasdasd");
//        StringUtils.

        return new JavaSort<>();

    }

//    @Bean
//    public String Capital(){
//        return StringUtils.capitalize("asdasdasd");
//    }
}
