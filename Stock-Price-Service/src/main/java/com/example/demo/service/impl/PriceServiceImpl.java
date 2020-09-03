package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.PriceService;

@Service
public class PriceServiceImpl implements PriceService{

	@Override
	public Double getPrice(String companyName) {
        Double price=90.00;
        return price;
	}

}
