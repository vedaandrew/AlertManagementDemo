package com.lly.alertMgmt.service;

import com.lly.alertMgmt.domain.AlertData;
import com.lly.alertMgmt.repository.AlertDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertDataServiceImpl implements AlertDataService {

    @Autowired
    private AlertDataRepository repository;

    @Override
    public AlertData getAlertDataById(Long alertId) {
        return repository.findById(alertId).get();
    }

    @Override
    public List<AlertData> getAllAlertData() {
        return repository.findAll();
    }


    @Override
    public void updateAlertData(AlertData alertData) {
        repository.save(alertData);
    }

    @Override
    public void saveAlertData(List<AlertData> alertData) {
        alertData.forEach(a -> repository.save(a));
    }

}
