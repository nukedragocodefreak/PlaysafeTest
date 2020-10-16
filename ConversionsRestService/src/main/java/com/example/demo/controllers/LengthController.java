package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Length;

@RestController
public class LengthController {
	
	@Autowired
	private Length len_mtok;
	private Length len_ktom;
	
	@RequestMapping(value="/conversions/mtok", method= RequestMethod.POST)
	public Length MilecToKilometres(@RequestBody Length len_m)
	{	
		len_mtok.calculate_mtok(len_m);
		return len_mtok;
		
	}
	
	@RequestMapping(value="/conversions/ktom", method= RequestMethod.POST)
	public Length KilometrestoMiles(@RequestBody Length len_k)
	{
		len_ktom.calculate_ktom(len_k);
		return len_ktom;
	}
}
