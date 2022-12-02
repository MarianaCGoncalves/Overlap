package pt.iade.Overlap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "usergroupevent")

public class UserGroupEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uge_id") private int userGroupEventId;
    @Column(name = "uge_ug_id") private int userGroupEventgroupId;
    @Column(name = "uge_eve_id") private int userGroupEventuserId;
    
    
    public UserGroupEvent(int userGroupEventgroupId, int userGroupEventuserId) {
        this.userGroupEventgroupId = userGroupEventgroupId;
        this.userGroupEventuserId = userGroupEventuserId;
    }


    public int getUserGroupEventId() {
        return userGroupEventId;
    }


    public int getUserGroupEventgroupId() {
        return userGroupEventgroupId;
    }


    public int getUserGroupEventuserId() {
        return userGroupEventuserId;
    }
    
}
