package com.fastcampus.practice.service;

import static org.junit.jupiter.api.Assertions.*;

import com.fastcampus.practice.logic.JavaSort;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.*;

//@ExtendWith(SpringExtension.class) ??
@SpringBootTest
class StringSortServiceTest {

   // 먼가 들어가야 하는데?
    private StringSortService sut;

    public StringSortServiceTest(@Autowired StringSortService sut) {
        this.sut = sut;
    }

    @DisplayName("")
    @Test
    void test(){
        List<String> input = List.of("Hi", "My");
        List<String> expected = sut.doSort(input);
        assertThat(expected).isEqualTo(List.of("Hi", "My"));
    }


}