package com.example.javastudy.java.AbstractStudy;

import java.time.ZonedDateTime;
import java.util.Set;

public class Todo {
    private String title;
    private ZonedDateTime StartAt;
    private ZonedDateTime endAt;
    private boolean deletedYn;

    private String description;

    public void update(String title, ZonedDateTime startAt, ZonedDateTime endAt,
                       String description) {
        if(deletedYn) {
            throw new RuntimeException("이미 삭제된 데이터");
        }
        this.title = title;
        this.description = description;
        this.StartAt = startAt;
        this.endAt = endAt;
    }
}
