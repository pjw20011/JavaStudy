package com.example.javastudy.java.Filter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListFilterTest {
    private static ListFilter filter;
    private static List<Integer> target;

    @BeforeAll
    static void setUp() {
        filter = new ListFilter();
        target = new ArrayList<>();
        createMockData();
    }

    private static void createMockData() {
        for (int i=0; i<100; i++){
            target.add(i+1);
        }
    }

    @Test
    void fiter() {
        // given
        int from = 10;
        int to = 20;
        int expected = to - from - 1;

        // when
        List<Integer> actual = filter.filterBy(target, from, to);

        // then
        assertEquals(expected, actual.size());
    }

    @Test
    void filter_failed() {
        // given
        int from = 20;
        int to = 10;

        // when
        // then
        assertThrows(RuntimeException.class, () -> {
           filter.filterBy(target, from, to);
        });
    }

}