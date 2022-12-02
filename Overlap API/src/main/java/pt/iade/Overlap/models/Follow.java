package pt.iade.Overlap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "follows")

public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fol_id") private int followId;
    @Column(name = "fol_use_id_a") private int follower;
    @Column(name = "fol_use_id_b") private int followed;
    
    public Follow(int follower, int followed) {
        this.follower = follower;
        this.followed = followed;
    }
    public int getFollowId() {
        return followId;
    }
    public int getFollower() {
        return follower;
    }
    public int getFollowed() {
        return followed;
    }
    
    
    
}
