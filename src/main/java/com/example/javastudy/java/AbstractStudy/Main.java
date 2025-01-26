package com.example.javastudy.java.AbstractStudy;

import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Meeting meeting = new Meeting();
        Set<String> participants = new HashSet<String>();
        participants.add("danny");
        meeting.validateAndUpdate(new UpdateMeeting("미팅룸1", "책읽기", participants,
                "책읽기 미팅", ZonedDateTime.now(), ZonedDateTime.now()));
    }
}
