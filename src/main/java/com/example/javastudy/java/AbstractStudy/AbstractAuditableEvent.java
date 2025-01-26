package com.example.javastudy.java.AbstractStudy;

import java.time.ZonedDateTime;

public abstract class AbstractAuditableEvent {
    private String title;
    private ZonedDateTime StartAt;
    private ZonedDateTime endAt;
    private boolean deletedYn;

    AbstractAuditableEvent(String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        this.title = title;
        StartAt = startAt;
        this.endAt = endAt;
    }

    public String getTitle() {
        return title;
    }

    public ZonedDateTime getStartAt() {
        return StartAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }


}
