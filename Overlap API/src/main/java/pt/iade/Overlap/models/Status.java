package pt.iade.Overlap.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "status")

public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "st_id") private int statusId;
    @Column(name = "st_name") private String status; 
    
    public Status(String status) {
        this.status = status;
    }
    public int getStatusId() {
        return statusId;
    }
    public String getStatusName() {
        return status;
    }
    public void setStatusName(String status) {
        this.status = status;
    }
}
