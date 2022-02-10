package com.fastcampus.practice.controller;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.fastcampus.practice.controller.MainController;
import java.util.List;
import org.junit.jupiter.api.Test;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest
class MainControllerTest {

    private MainController mainController;
    @Test
    void given_when_then(){
        // Given
        //함수가 입력을 받아
        //http://localhost:8080/ 호출하면 (?list=1,2,0)
        List<String> input = List.of("1","2","0");

        // When & Then
        //실행하면, 호출하면
        List<String> output = mainController.main(input);

        //Then
        //출력한다.
        //출력한다. 응답을 한다.
        //Unit Test 가 아니라 API 테스트 하는것을 의미한다.
        assertThat(output).isEqualTo(List.of("0","1","2"));
    }
}