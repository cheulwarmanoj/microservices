package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PriceService;

@RestController
public class PriceRestController {
	
	@Autowired
	PriceService priceService;
	
	@GetMapping("/getPrice/{companyName}")
	public Double getPrice(@PathVariable("companyName") String companyName)
	{
		Double price=priceService.getPrice(companyName);
		return price;
	}

}
