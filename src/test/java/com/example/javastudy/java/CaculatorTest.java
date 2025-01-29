package com.example.javastudy.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
class CaculatorTest {
    @ParameterizedTest
    @MethodSource("numberProvider")
    @DisplayName("양수의 값을 더할 수 있다.")
    void sum(int a, int b, int expected) {
        // given
        Caculator caculator = new Caculator();


    // when
    int actual = caculator.sum(a, b);


    // then
    assertEquals(expected, actual);
    }

    static Stream<Arguments> numberProvider() {
        return Stream.of(
                Arguments.arguments(1, 2, 3),
                Arguments.arguments(3, 4, 7)
        );
    }

    @ParameterizedTest
    @MethodSource("numberProviderforException")
    @DisplayName("음수의 값은 예외가 발생하여야 한다.")
    void sumExceptionTest(int a, int b) {

        // given
        Caculator caculator = new Caculator();

        // when
        // then
        assertThrows(RuntimeException.class, () -> caculator.sum(a, b));

    }

    static Stream<Arguments> numberProviderforException() {
        return Stream.of(
                Arguments.arguments(-1, 2),
                Arguments.arguments(3, -4)
        );
    }
}