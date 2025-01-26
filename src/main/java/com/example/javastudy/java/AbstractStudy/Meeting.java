package com.example.javastudy.java.AbstractStudy;

import java.time.ZonedDateTime;
import java.util.Set;

public class Meeting extends AbstractEvent {
    private String meetingRoom;
    private String agenda;
    private Set<String> participants;

    public void update(String title, ZonedDateTime startAt, ZonedDateTime endAt,
                       String meetingRoom, String agenda, Set<String> participants) {
        if(deletedYn) {
            throw new RuntimeException("이미 삭제된 데이터");
        }
        this.agenda = agenda;
        this.meetingRoom = meetingRoom;
        this.participants = participants;

    }

    @Override
    protected void update(AbstractAuditableEvent event){
        UpdateMeeting meeting = (UpdateMeeting) event;
        this.participants = meeting.getParticipants();
        this.agenda = meeting.getAgenda();
        this.meetingRoom = meeting.getMeetingRoom();

    }
}
