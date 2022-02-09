package com.fastcampus.practice.service;

import com.fastcampus.practice.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StringSortService {

    private final Sort<String> sort;

    public StringSortService(@Qualifier("javaSort") Sort<String> sort) {
        System.out.println("선택된 구현체는: " + sort.getClass().getSimpleName());
        this.sort = sort;
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }
}
