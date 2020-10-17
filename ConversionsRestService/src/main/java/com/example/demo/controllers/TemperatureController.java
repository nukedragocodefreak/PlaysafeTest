package com.example.demo.controllers;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Temperature;

@RestController
public class TemperatureController {


	Logger logger = LoggerFactory.getLogger(TemperatureController.class);
	
	@RequestMapping(value="/conversions/ctok", method= RequestMethod.POST)
	public Temperature CelciusToKelvin(@RequestBody Temperature temp_c)
	{		
		try {
		double result_ctok = temp_c.getCelcius() + 273.15;
		temp_c.setKelvin(result_ctok);
		logger.trace("Start Logging");
		return temp_c;
		}
		catch(Exception e) {
			
			return null;
			}
		}			
	
	@RequestMapping(value="/conversions/ktoc", method= RequestMethod.POST)
	public Temperature KelvinToCelcius(@RequestBody Temperature temp_k)
	{
		try {
		double result_ktoc = temp_k.getKelvin() - 273.15;
		temp_k.setCelcius(result_ktoc);
		logger.trace("Start Logging");
		return temp_k;
	     }
		catch(Exception e) {
			
			return null;
			}
           }
	
		}
