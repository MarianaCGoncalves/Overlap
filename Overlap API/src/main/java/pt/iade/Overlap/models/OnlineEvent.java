package pt.iade.Overlap.models;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eveonline")
public class OnlineEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eve_on_id") private int eveOnId;
    @Column(name = "eve_on_ug_id") private int eveOnUgId;
    @Column(name = "eve_on_dt") private LocalDate eveOndt;
    @Column(name = "eve_on_eve_id") private int eveOnEveId;
    
    public OnlineEvent(){}
    public OnlineEvent(int eveOnUgId, LocalDate eveOndt, int eveOnEveId) {
        this.eveOnUgId= eveOnUgId;
        this.eveOndt=eveOndt;
        this.eveOnEveId= eveOnEveId;
    }
    public int getId() {
        return eveOnId;
    }
    public LocalDate getEveOndt(){
        return eveOndt;
    }

}
