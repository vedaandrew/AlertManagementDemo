package com.lly.alertMgmt;

import com.lly.alertMgmt.constants.AlertDataStatusEnum;
import com.lly.alertMgmt.domain.AlertData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.ArrayList;
import java.util.List;

import static com.lly.alertMgmt.constants.AlertDataConstants.ALERT_DESC_1;
import static com.lly.alertMgmt.constants.AlertDataConstants.ALERT_DESC_2;

@SpringBootApplication
@EnableJpaRepositories
public class StartMyAlertManagementApp {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(StartMyAlertManagementApp.class, args);

		//to load data on startup
/*
		AlertDataRepository alertDataRepository = context.getBean(AlertDataRepository.class);
		List<AlertData> alertDataList = getAlertDataList();
		alertDataList.stream().forEach(data->alertDataRepository.save(data));
*/
	}

	private static List<AlertData> getAlertDataList() {
		List<AlertData> alertDataList =  new ArrayList<>();
		alertDataList.add(new AlertData(ALERT_DESC_1, AlertDataStatusEnum.OPEN));
		alertDataList.add(new AlertData(ALERT_DESC_2, AlertDataStatusEnum.OPEN));
		return alertDataList;
	}
}