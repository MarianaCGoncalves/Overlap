package pt.iade.models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evefisico")
public class PhysicalEvent extends Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eve_phy_id") private int id;
    @Column(name = "eve_phy_ug_id") private int evePhyUgId;
    @Column(name = "eve_phy_dt") private LocalDateTime dt;
    @Column(name = "eve_phy_ts") private Timestamp ts;
    @Column(name = "eve_phy_evt_id") private int evePhyEvtId;
    
    public PhysicalEvent() {
        super();
        id = 0;
    }
    public PhysicalEvent(int eventUserGroupId,  LocalDateTime eventDate, String eventDescription, String eventName, int id){
        super(eventUserGroupId, eventName, eventDate, eventDescription);
        this.id=id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    } 

}