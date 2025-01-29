package com.example.javastudy.java.Filter

import com.sun.jdi.connect.Connector.StringArgument
import spock.lang.Specification

class ListFilterTestSpock extends Specification {
    def "filter"() {
        given:
        def filter = new ListFilter()
        def target = []
        for (int i = 1; i < 100; i++){
            target.add(i)
        }

        def from = 10
        def to = 20
        def expectedSize = to - from - 1

        when:
        def actual = filter.filterBy(target, from, to)

        then:
        expectedSize == actual.size()
    }

    def "exception"() {
        given:
        def filter = new ListFilter()
        def target = []
        for (int i = 1; i < 10; i++) {
            target.add(i)
        }

        def from = 10
        def to = 5
        def expectedSize = to - from -1

        when:
        def actual = filter.filterBy(target, from, to)

        then:
        thrown(RuntimeException.class)
    }
}
