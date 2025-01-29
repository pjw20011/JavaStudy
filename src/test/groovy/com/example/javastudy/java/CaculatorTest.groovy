package com.example.javastudy.java

import spock.lang.Specification

class CaculatorTest2 extends Specification {
    def "sum"() {
        given:
        def caculator = new Caculator()

        when:
        def actual = caculator.sum(a, b)

        then:
        actual == expected

        where:
        a | b  | expected
        12| 23 | 35
        23| 34 | 57
    }

    def "exception"() {
        given:
        def a = -1
        def b = 10
        def caculator = new Caculator()

        when:
        def actual = caculator.sum(a, b)

        then:
        thrown(RuntimeException.class)
    }
}
