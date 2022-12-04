package pt.iade.Overlap.models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "mensagem")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "mes_id") private int messageId;
    @Column(name = "mes_text") private String messageText;
    @Column(name = "mes_use_id") private int messageUserId; 
    @Column(name = "mes_ug_id") private int messageUserGroupId;
    @Column(name = "mes_date") private LocalDateTime messageDate = LocalDateTime.now();

    public Message(){}
    public Message(int messageUserId, int messageUserGroupId, Timestamp messageDate, String messageText) {
        this.messageUserId = messageUserId;
        this.messageUserGroupId = messageUserGroupId;
        this.messageText = messageText;
    }

    public int getMessageId() {
        return messageId;
    }

    public int getMessageUserId() {
        return messageId;
    }

    public int getMessageUserGroupId() {
        return messageUserGroupId;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDateTime getMessageDate() {
        return messageDate;
    }

    

    
   
    
}
