package pt.iade.Overlap.models;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "use_id") private int userId;
    @Column(name = "use_name") private String userName;
    @Column(name = "use_acc_age") private static Instant accountAge; 
    @Column(name = "use_pass") private String password;
    @Column(name = "use_mail") private String mail;

    public User() {}

    public User(String userName, String password, String mail) {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }

    public int getId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public static Instant getNow() {
        return accountAge;
    }

    public String getPassword() {
        return password;
    }

    public String getMail() {
        return mail;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
