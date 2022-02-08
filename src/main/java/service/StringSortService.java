package service;

import logic.Sort;

import java.util.List;

public class StringSortService {

    private final Sort<String> sort;

    public StringSortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }
}
