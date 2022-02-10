package com.fastcampus.practice.service;

import static org.junit.jupiter.api.Assertions.*;

import com.fastcampus.practice.logic.JavaSort;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

//@ExtendWith(SpringExtension.class) ??
//SpringBootTest
//@WebMvcTest
@AutoConfigureMockMvc
@SpringBootTest
class StringSortServiceTest {

    private final MockMvc mvc;


    public StringSortServiceTest(@Autowired MockMvc mvc) {
        this.mvc = mvc;
    }

    @DisplayName("")
    @Test
    void test(){
        List<String> input = List.of("Hi", "My");
//        assertThat(expected).isEqualTo(List.of("Hi", "My"));
    }

    @Test
    void name() throws Exception {
        List<String> input = List.of("1","2","3");

//        ResultActions result = mvc.perform(
//            get("/")
//                .content("application/json")
//                .param("list",String.join(",",input))
//        );
//
//        result.andExpect(status().isOk())
//            .andExpect((ResultMatcher) content().contentType(MediaType.APPLICATION_JSON))
//            .andExpect(content().string("[\"0\",\"1\",\"2\",\"3\"]")
//                .andDo(print()));

        mvc.perform(
            get("/")
                .content("application/json")
                .param("list",String.join(",",input))
        ).andExpect(status().isOk())
            .andExpect(content().contentType("application/json"))
            .andExpect(content().string("[\"1\",\"2\",\"3\"]"))
                .andDo(print());
    }
}