package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="GREET-SERVICE")
public interface IGreetClient {
	
	

}
