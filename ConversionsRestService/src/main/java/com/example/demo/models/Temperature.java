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
	
	public double calculate_ktoc(Temperature kelvin_ktoc){
		
		//0K − 273.15 = -273,1°C
		double result_ktoc = kelvin_ktoc.kelvin - 273.15;
		return result_ktoc;
		
		}
	public double calculate_ctok(Temperature celcius_ctok){
		
		//0°C + 273.15 = 273,15K
		double result_ctok = celcius_ctok.celcius + 273.15;
		return result_ctok;
		}
	
	
}
