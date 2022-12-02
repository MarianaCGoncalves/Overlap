package pt.iade.Overlap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "usertag")
public class UserTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tu_id") private int tagUserId;
    @Column(name = "tu_tag_id") private int tagId;
    @Column(name = "tu_use_id") private int userId;

    public UserTag(int tagId, int userId) {
        this.tagId = tagId;
        this.userId = userId;
    }

    public int getTagUserId() {
        return tagUserId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getUserId() {
        return userId;
    }

   
  
}
