package com.example.overlapandroidstudio;

import java.time.LocalDateTime;

public class Message {
    private int messageId;
    private String messageText;
    private int messageUserId;
    private int messageUserGroupId;
    private LocalDateTime messageDate;

    public Message(){}
    public Message(int messageUserId, int messageUserGroupId, String messageText) {
        this.messageUserId = messageUserId;
        this.messageUserGroupId = messageUserGroupId;
        this.messageText = messageText;
        this.messageDate = LocalDateTime.now();
    }

    public int getMessageId() {
        return messageId;
    }

    public int getMessageUserId() {
        return messageId;
    }

    public int getMessageUserGroupId() {
        return messageUserGroupId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDateTime getMessageDate() {
        return messageDate;
    }
}
