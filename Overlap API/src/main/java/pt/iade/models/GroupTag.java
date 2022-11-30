package pt.iade.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "grouptag")
public class GroupTag{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tg_id") private int tagGroupId;
    @Column(name = "tg_tag_id") private int tagId;
    @Column(name = "tg_gru_id") private int groupId;

    public GroupTag(int tagId, int userId) {
        this.tagId = tagId;
        this.groupId = userId;
    }

    public int getTagGroupId() {
        return tagGroupId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public int getGroupId() {
        return groupId;
    }

    
  
}
