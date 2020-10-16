package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Length;

@RestController
public class LengthController {
	
	@Autowired
	private Length len_mtok;
	private Length len_ktom;
	
	@RequestMapping(value="/conversions/mtok", method= RequestMethod.GET)
	public Length MilecToKilometres()
	{	
		return len_mtok;
		
	}
	
	@RequestMapping(value="/conversions/ktom", method= RequestMethod.GET)
	public Length KilometrestoMiles()
	{
		
		return len_ktom;
	}
}
