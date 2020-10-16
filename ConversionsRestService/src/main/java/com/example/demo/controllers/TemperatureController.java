package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Temperature;

@RestController
public class TemperatureController {

	@Autowired
	private Temperature temp_ktoc;
	private Temperature temp_ctok;
	
	@RequestMapping(value="/conversions/ctok", method= RequestMethod.GET)
	public Temperature CelciusToKelvin()
	{	
		
		return temp_ctok;
		
	}
	
	@RequestMapping(value="/conversions/ktoc", method= RequestMethod.GET)
	public Temperature KelvinToCelcius()
	{
		
		return temp_ktoc;
	}
	
}
