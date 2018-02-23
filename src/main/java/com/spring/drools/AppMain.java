package com.spring.drools;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.drools.model.Fare;
import com.spring.drools.model.TaxiRide;

public class AppMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TaxiFareCalculatorService taxiFareCalculatorService = context.getBean(TaxiFareCalculatorService.class);
		
		TaxiRide taxiRide = new TaxiRide();
		taxiRide.setIsNightSurcharge(true);
		taxiRide.setDistanceInMile(190L);
		
		Fare rideFare = new Fare();
		
		taxiFareCalculatorService.calculateFare(taxiRide, rideFare);
	}
}
