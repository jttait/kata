package com.mentoring.mentoringMeeting;

import java.util.List;

public interface Matcher {
    boolean isMatch(List<Card> cards);
    String result();
}
