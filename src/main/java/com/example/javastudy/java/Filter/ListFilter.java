package com.example.javastudy.java.Filter;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
     public List<Integer> filterBy(List<Integer> target, int from, int to){
         if(from >=to) {
             throw new RuntimeException(
                     String.format("from=%s 은 to=%s보다 작아야 합니다.",from ,to)
             );
         }
         return target.stream()
                 .filter(each -> from < each && each < to)
                 .collect(Collectors.toList());
     }
}
