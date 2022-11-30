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
@Table(name = "eveonline")
public class OnlineEvent extends Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eve_on_id") private int id;
    @Column(name = "eve_on_ug_id") private int eveOnUgId;
    @Column(name = "eve_on_dt") private LocalDateTime dt;
    @Column(name = "eve_on_ts") private Timestamp ts;
    @Column(name = "eve_on_evt_id") private int eveOnEvtId;
    
    public OnlineEvent(int eventUserGroupId, LocalDateTime dt, String eventDescription, String eventName, int id) {
        this.dt=dt;
        this.id= id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
