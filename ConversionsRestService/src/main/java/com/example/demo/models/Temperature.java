package com.example.demo.models;

import org.springframework.stereotype.Service;

@Service
public class Temperature {
	
	private double celcius;
	private double kelvin;
	
	public double getCelcius() {
		return celcius;
	}
	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}
	public double getKelvin() {
		return kelvin;
	}
	public void setKelvin(double kelvin) {
		this.kelvin = kelvin;
	}
	
	public void calculate_ktoc(double kelvin){
		
		//0K − 273.15 = -273,1°C
		
		}
	public void calculate_ctok(double celcius){
		
		//0°C + 273.15 = 273,15K
		
		}
	
	
}
