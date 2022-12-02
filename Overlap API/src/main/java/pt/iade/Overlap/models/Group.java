package pt.iade.Overlap.models;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "grupos")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gru_id") private int groupId;
    @Column(name = "gru_use_id") private int creatorId;
    @Column(name = "gru_name") private String groupName;
    @Column(name = "gru_desc") private String groupDescription;
    @Column(name = "gru_create_age") private Instant groupAge; // idade do grupo: timestamp da criação do grupo menos o timestamp now
    @Column(name = "gru_last_post_age") private Timestamp LastPost;
    @Column(name = "gru_at") private boolean activity; // 0 - ativo | 1 - inativo
    private ArrayList<User> members;

    
    
    public Group(int creatorId, String groupName, String groupDescription, Instant groupAge, ArrayList<User> members) {
        this.creatorId = creatorId;
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.groupAge = groupAge;
        this.members = members;
    }
    public int getGroupId() {
        return groupId;
    }
    public Instant getGroupAge() {
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
