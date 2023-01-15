package pt.iade.Overlap.models.views;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface GroupView {
    int getGroupId();
    String getGroupName();
    String getGroupDescription();
    LocalDate getGroupBirthDay();
    LocalDateTime getGroupLastPost();
    boolean getGroupActivity();
}
