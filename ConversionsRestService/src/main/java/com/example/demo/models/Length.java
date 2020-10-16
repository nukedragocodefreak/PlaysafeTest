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
	
	
	
public double calculate_ktom(Length kilometres_ktom){
		
		double result_ktom = kilometres_ktom.kilometres * 0.621371;
		return result_ktom;
		
		}
	public double calculate_mtok(Length miles_mtok){
		
		double result_mtok = miles_mtok.miles * 1.60934;
		return result_mtok;
		}
	
}
