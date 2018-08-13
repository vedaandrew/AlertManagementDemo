package com.lly.alertMgmt.constants;

public enum AlertDataStatusEnum {
    OPEN ("Open"),
    IN_PROGRESS ("In_progress"),
    ACCEPTED ("Accepted"),
    REJECTED ("Rejected"),
    COMPLETED ("Completed");

    public String status;

    AlertDataStatusEnum(String status) {
        this.status = status;
    }
}