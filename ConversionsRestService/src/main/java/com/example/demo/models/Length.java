package com.example.demo.models;

import org.springframework.stereotype.Service;

@Service
public class Length {

	private double kilometres;
	private double miles;
	
	public double getKilometres() {
		return kilometres;
	}
	public void setKilometres(double kilometres) {
		this.kilometres = kilometres;
	}
	public double getMiles() {
		return miles;
	}
	public void setMiles(double miles) {
		this.miles = miles;
	}
	
	
}
