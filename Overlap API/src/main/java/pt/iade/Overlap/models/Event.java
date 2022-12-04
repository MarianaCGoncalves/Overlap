package pt.iade.Overlap.models;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventos")
public class  Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eve_id") private int id;
    @Column(name = "eve_name") protected String eventName;
    @Column(name = "eve_ug_id") private int eventUserGroupId;
    @Column(name = "eve_desc") private String eventDescription; //evento criado naquele timestamp
    @Column(name = "eve_date") private LocalDateTime eventDate;
    @Column(name = "eve_type") private String eventType;
    
    public Event() {}
    public Event(int eventUserGroupId, String eventDescription,
     LocalDateTime eventDate, String eventName) {
        this.eventUserGroupId = eventUserGroupId;
        this.eventDate = eventDate;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
    }
    
    public int getId() {
        return id;
    }
    public int getEventUserGroupId() {
        return eventUserGroupId;
    }
    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
    public String getEventDescription() {
        return eventDescription;
    }
    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }
    public LocalDateTime getEventDate() {
        return eventDate;
    }
    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }
    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

}
