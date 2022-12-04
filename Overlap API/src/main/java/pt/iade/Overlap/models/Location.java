package pt.iade.Overlap.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.geo.Point;


@Entity
@Table(name = "localizacao")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "locat_id") private int locat_id;
    @Column(name = "locat_name") private String locat_name;
    @Column(name = "locat_point") Point locat_point;

    public Location(){}
    public Location(int locat_id, String locat_name, Point locat_point) {
        this.locat_id=locat_id;
        this.locat_name= locat_name;
        this.locat_point=locat_point;
    }
    
    public int getId() {
        return locat_id;
    }
    public void setId(int locat_id) {
        this.locat_id = locat_id;
    }
    public String getName() {
        return locat_name;
    }
    public void setName(String locat_name) {
        this.locat_name = locat_name;
    }

    public Point getLocation() {
        return locat_point;
    }
    public void setLocation(Point locat_point) {
        this.locat_point = locat_point;
    }

    
}
