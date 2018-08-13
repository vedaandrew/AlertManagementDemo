package com.lly.alertMgmt.domain;

import com.lly.alertMgmt.constants.AlertDataStatusEnum;

import javax.persistence.*;

@Entity
@Table (name = "AlertData")
public class AlertData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private String status;

    public AlertData() {

    }

    public AlertData(String description, AlertDataStatusEnum alertDataStatusEnum) {
        this.description = description;
        this.status = alertDataStatusEnum.status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AlertData{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
