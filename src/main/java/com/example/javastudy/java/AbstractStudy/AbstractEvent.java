package com.example.javastudy.java.AbstractStudy;

import java.time.ZonedDateTime;

public abstract class AbstractEvent {
    private String title;
    private ZonedDateTime StartAt;
    private ZonedDateTime endAt;
    protected boolean deletedYn;

    public void validateAndUpdate(AbstractAuditableEvent event) {
        if (deletedYn) {
            throw new RuntimeException("이미 삭제된 데이터");
        }
        update(event);
        defaultUpdate(event);
    }

    protected abstract void update(AbstractAuditableEvent event);


    private boolean getDeletedYn() {
        return deletedYn;
    }

    private void defaultUpdate(AbstractAuditableEvent event) {
        this.title = event.getTitle();
        this.StartAt = event.getStartAt();
        this.endAt = event.getEndAt();

    }
}
