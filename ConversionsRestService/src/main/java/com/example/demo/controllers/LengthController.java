package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Length;

@RestController
public class LengthController {
	
	Logger logger = LoggerFactory.getLogger(LengthController.class);
	
	@RequestMapping(value="/conversions/mtok", method= RequestMethod.POST)
	public Length MilecToKilometres(@RequestBody Length len_m)
	{	
		try {
		double result_mtok = len_m.getMiles() * 1.60934;
		len_m.setKilometres(result_mtok);
		logger.trace("Start Logging");
		return len_m;
			}
	     catch(Exception e) {
		
	    	 return null;
		}		
	}
	
	@RequestMapping(value="/conversions/ktom", method= RequestMethod.POST)
	public Length KilometrestoMiles(@RequestBody Length len_k)
	{
		try {
		double result_ktom = len_k.getKilometres() * 0.621371;
		len_k.setMiles(result_ktom);
		logger.trace("Start Logging");
		return len_k;
	}
	catch(Exception e) {
		
		return null;
		}
	}
}
