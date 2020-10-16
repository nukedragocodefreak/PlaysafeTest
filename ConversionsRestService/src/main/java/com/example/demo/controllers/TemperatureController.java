package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Temperature;

@RestController
public class TemperatureController {

	@Autowired
	private Temperature temp_ktoc;
	private Temperature temp_ctok;
	//private double temp_k, temp_c;
	
	@RequestMapping(value="/conversions/ctok", method= RequestMethod.POST)
	public Temperature CelciusToKelvin(@RequestBody Temperature temp_c)
	{	
		String a = String.valueOf(temp_c.getCelcius());
		
		temp_ctok.calculate_ctok(temp_c);
		
		return temp_ctok;
		
	}
	
	@RequestMapping(value="/conversions/ktoc", method= RequestMethod.POST)
	public Temperature KelvinToCelcius(@RequestBody Temperature temp_k)
	{
		temp_ktoc.calculate_ktoc(temp_k);
		return temp_ktoc;
	}
	
}
