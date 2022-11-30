package pt.iade.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "ugestatus")

public class UserStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ugest_id") private int userstatusId;
    @Column(name = "ugest_uge_id") private int userGroupEventId;
    @Column(name = "ugest_st_id") private int statusId;
    public UserStatus(int userGroupEventId, int statusId) {
        this.userGroupEventId = userGroupEventId;
        this.statusId = statusId;
    }
    public int getUserstatusId() {
        return userstatusId;
    }
    public int getUserGroupEventId() {
        return userGroupEventId;
    }
    public int getStatusId() {
        return statusId;
    }
    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

}
