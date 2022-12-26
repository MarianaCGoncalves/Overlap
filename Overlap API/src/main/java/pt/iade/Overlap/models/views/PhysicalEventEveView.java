package pt.iade.Overlap.models.views;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.geo.Point;

public interface PhysicalEventEveView {
    String getGroupName();
    String getGroupDescription();
    LocalDate getGroupBirthday();

    String getLocationName();
    Point getLocationCoordinates();

    String getEventName();
    String getEventDescription();
    LocalDateTime getEventTimestamp();
    LocalDate getEventDate();

    String getUsername();
}
