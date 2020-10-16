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
	
	
	@RequestMapping(value="/conversions/ctok", method= RequestMethod.POST)
	public Temperature CelciusToKelvin(@RequestBody Temperature temp_c)
	{		
		double result_ctok = temp_c.getCelcius() + 273.15;
		temp_c.setKelvin(result_ctok);
		return temp_c;
		
	}
	
	@RequestMapping(value="/conversions/ktoc", method= RequestMethod.POST)
	public Temperature KelvinToCelcius(@RequestBody Temperature temp_k)
	{
		double result_ktoc = temp_k.getKelvin() - 273.15;
		temp_k.setCelcius(result_ktoc);;
		return temp_k;
	}
	
}
