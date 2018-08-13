package com.lly.alertMgmt.service;

import com.lly.alertMgmt.domain.AlertData;

import java.util.List;

public interface AlertDataService {

    void updateAlertData(AlertData alertData);

    AlertData getAlertDataById(Long id);

    List<AlertData> getAllAlertData();

    void saveAlertData(List<AlertData> alertData);

}
