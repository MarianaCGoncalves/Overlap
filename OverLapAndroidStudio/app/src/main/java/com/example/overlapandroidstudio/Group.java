package com.example.overlapandroidstudio;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

public class Group {
     private int creatorId;
     private String groupName;
     private String groupDescription;
     private LocalDate groupAge; // idade do grupo: timestamp da criação do grupo menos o timestamp now
     private Timestamp LastPost;
     private boolean activity; // 0 - ativo | 1 - inativo
     private ArrayList<User> members;



    public Group(int creatorId, String groupName, String groupDescription, LocalDate groupAge, ArrayList<User> members) {

        this.creatorId = creatorId;
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.groupAge = groupAge;
        this.members = members;
    }

    public LocalDate getGroupAge() {
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
    public ArrayList<User> getMembers() {
        return members;
    }
    public void setMembers(ArrayList<User> members) {
        this.members = members;
    }


}

