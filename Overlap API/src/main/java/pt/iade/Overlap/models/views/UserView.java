package pt.iade.Overlap.models.views;

import java.sql.Timestamp;

public interface UserView {
    int getId();
    String getName();
    Timestamp getAccountCreated();
    String getMail();
}
