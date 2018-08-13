package com.lly.alertMgmt.controller;

import com.lly.alertMgmt.constants.AlertDataConstants;
import com.lly.alertMgmt.constants.AlertDataStatusEnum;
import com.lly.alertMgmt.domain.AlertData;
import com.lly.alertMgmt.service.AlertDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlertDataManagementController {

    @Autowired
    private AlertDataService alertDataService;

    @RequestMapping(value = "/getAllAlertData", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getAllAlertData(){
        return alertDataService.getAllAlertData().toString();
    }

    @RequestMapping(value = "/getAlertDataById" , method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public AlertData getAlertDataById(@RequestParam("id") long id){
        return alertDataService.getAlertDataById(id);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/updateAlertStatusById", method = {RequestMethod.GET, RequestMethod.POST})
    public void updateAlertStatusById(@RequestParam("id") long id, @RequestParam("status") AlertDataStatusEnum alertDataStatusEnum){
        AlertData alertData = alertDataService.getAlertDataById(id);
        alertData.setStatus(alertDataStatusEnum.status);
        alertDataService.updateAlertData(alertData);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value = "/saveAlertData", method = RequestMethod.POST)
    public void saveAlertData () {
        List<AlertData> alertDataList = new ArrayList<>();
        alertDataList.add(new AlertData(AlertDataConstants.ALERT_DESC_1, AlertDataStatusEnum.OPEN));
        alertDataList.add(new AlertData( AlertDataConstants.ALERT_DESC_2, AlertDataStatusEnum.OPEN));
        alertDataList.add(new AlertData( AlertDataConstants.ALERT_DESC_3, AlertDataStatusEnum.OPEN));
        alertDataList.add(new AlertData(AlertDataConstants.ALERT_DESC_4, AlertDataStatusEnum.OPEN));
        alertDataService.saveAlertData(alertDataList);
    }
}
