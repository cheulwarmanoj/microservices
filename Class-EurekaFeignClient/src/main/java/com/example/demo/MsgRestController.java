package com.example.demo;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@Autowired
	IGreetClient greenClient;
	
	public String displayMsg(@PathVariable("name") String name)
	{
		greenClient.
	}

}
