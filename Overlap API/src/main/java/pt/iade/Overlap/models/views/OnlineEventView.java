package pt.iade.Overlap.models.views;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface OnlineEventView {
    String geteve_name();
    String geteve_desc();
    LocalDateTime geteve_date();
    Integer geteve_ug_id();
    LocalDate geteve_on_dt();



}
