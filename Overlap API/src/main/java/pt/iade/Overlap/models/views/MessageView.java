package pt.iade.Overlap.models.views;

import java.sql.Timestamp;

public interface MessageView {
    String getMessageText();
    int getMessageId();
    int getMessageUserGroupId();
    Timestamp getMessageTimestamp();
}

