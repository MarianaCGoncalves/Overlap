package pt.iade.Overlap.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "comment")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comm_id") private int commentId;
    @Column(name = "comm_mes_id") private int commentMessageId;
    @Column(name = "comm_ug_id") private int commentUserGroupId;
    @Column(name = "comm_mes_text") private String commentText;
    
    public Comment(int commentMessageId, int commentUserGroupId, String commentText) {
        this.commentMessageId = commentMessageId;
        this.commentUserGroupId = commentUserGroupId;
        this.commentText = commentText;
    }

    public int getCommentId() {
        return commentId;
    }

    public int getCommentMessageId() {
        return commentMessageId;
    }

        public int getCommentUserGroupId() {
        return commentUserGroupId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
  
}


