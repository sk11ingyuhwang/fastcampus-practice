package com.fastcampus.practice.logic;

import java.util.List;

/**
 * 정렬 기능을 제공하는 인터페이스. 사용하는 타입은 정렬할 수 있게끔 {@link Comparable} 을 구현해야 한다.
 *
 * @param <T> 정렬할 데이터의 타입
 */
public interface Sort <T extends Comparable<T>> {

    /**
     * 정렬을 수행한다. 오름차순만 되니 주의.
     *
     * @param list 정렬할 리스트
     * @return 정렬된 새 리스트
     */
    List<T> sort(List<T> list);
}
