package pt.iade.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evephylocat")

public class EventPhysicalLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eve_phylocat_id") private int eventPhysicalLocationId;
    @Column(name = "eve_phylocat_evephy_id") private int eventPhysicalLocationEventPhysicalId;
    @Column(name = "eve_phylocat_locat_id") private int eventPhysicalLocationLocId;

    public EventPhysicalLocation(int eventPhysicalLocationId, int eventPhysicalLocationEventPhysicalId, int eventPhysicalLocationLocId){
        this.eventPhysicalLocationEventPhysicalId = eventPhysicalLocationEventPhysicalId;
        this.eventPhysicalLocationLocId = eventPhysicalLocationLocId;
    }

    public int getEventPhysicalLocationId(){
        return eventPhysicalLocationId;
    }

    public int getEventPhysicalLocationEventPhysicalId(){
        return eventPhysicalLocationEventPhysicalId;
    }

    public int getEventPhysicalLocationLocId(){
        return eventPhysicalLocationLocId;
    }
}
