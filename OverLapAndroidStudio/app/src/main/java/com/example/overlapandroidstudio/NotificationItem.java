package com.example.overlapandroidstudio;


public class NotificationItem {

    private String notificationdate;
    private String notificationtext;

    public NotificationItem(String notificationdate, String notificationtext)
    {
        this.notificationdate = notificationdate;
        this.notificationtext = notificationtext;
    }

    public String getNotificationDate() {
        return notificationdate;
    }

    public String getNotificationText() {
        return notificationtext;
    }
}
