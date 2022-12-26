package pt.iade.Overlap.models.views;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OnlineEventEveView {
    String getGroupName();
    String getGroupDescription();
    LocalDate getGroupBirthday();

    String getEventName();
    String getEventDescription();
    LocalDateTime getEventTimestamp();
    LocalDate getEventDate();

    String getUserName();
}
