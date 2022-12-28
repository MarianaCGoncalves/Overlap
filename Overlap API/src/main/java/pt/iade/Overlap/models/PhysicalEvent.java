package pt.iade.Overlap.models;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evefisico")
public class PhysicalEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eve_phy_id") private int evePhyid;
    @Column(name = "eve_phy_ug_id") private int evePhyUgId;
    @Column(name = "eve_phy_dt") private LocalDate evePhydt;
    @Column(name = "eve_phy_eve_id") private int evePhyEveId;
    
    public PhysicalEvent() {}
    public PhysicalEvent(int evePhyUgId, LocalDate evePhydt, int evePhyEveId ){
        this.evePhyUgId=evePhyEveId;
        this.evePhydt=evePhydt;
        this.evePhyEveId=evePhyEveId;
    }
    public int getId() {
        return evePhyid;
    }

}