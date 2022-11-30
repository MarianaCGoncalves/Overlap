package pt.iade.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "usergroup")

public class UserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ug_id") private int userGroupId;
    @Column(name = "ug_gru_id") private int groupId;
    @Column(name = "ug_use_id") private int userId;

    public UserGroup(int groupId, int userId) {
        this.groupId = groupId;
        this.userId = userId;
    }

    public int getUserGroupId() {
        return userGroupId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    





    
}
