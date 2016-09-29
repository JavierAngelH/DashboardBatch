package com.dashboard;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component("runSchedulerXML")
public class RunSchedulerReadXML {
 
  @Autowired
  private JobLauncher jobLauncher;
 
  @Autowired
  private Job readXMLJob;
 
  public void run() {
 
    try {
 
	String dateParam = new Date().toString();

	JobParameters param = new JobParametersBuilder().addString("date", dateParam).toJobParameters();
	
	System.out.println("Entra insertar " + dateParam);
 
	JobExecution execution = jobLauncher.run(readXMLJob, param);
	System.out.println("Exit del insertar : " + execution.getStatus() + new Date());
    } catch (Exception e) {
	e.printStackTrace();
    }
 
  }
}