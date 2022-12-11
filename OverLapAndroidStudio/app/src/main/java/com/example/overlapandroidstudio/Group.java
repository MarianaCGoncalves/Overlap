package com.example.overlapandroidstudio;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

public class Group {
    private int groupId;
    private int creatorId;
    private String groupName;
    private String groupDescription;
    private Date groupAge; // data de criação do grupo.
    private Timestamp LastPost;
    private boolean activity; // 0 - ativo | 1 - inativo



    public Group(){}
    public Group(int creatorId, String groupName, String groupDescription, Date groupAge, Timestamp LastPost, boolean activity) {
        this.creatorId = creatorId;
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.groupAge = groupAge;
        this.LastPost= LastPost;
        this.activity= activity;
    }
    public int getGroupId() {
        return groupId;
    }
    public Date getGroupAge() {
        return groupAge;
    }
    public int getCreatorId() {
        return creatorId;
    }
    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public String getGroupDescription() {
        return groupDescription;
    }
    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }
    public Timestamp getLastPost() {
        return LastPost;
    }
    public void setLastPost(Timestamp lastPost) {
        LastPost = lastPost;
    }
    public boolean isActivity() {
        return activity;
    }
    public void setActivity(boolean activity) {
        this.activity = activity;
    }
}

