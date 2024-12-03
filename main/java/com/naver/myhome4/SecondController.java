package com.naver.myhome4;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/)
@RequestMapping("/second-service")
public class SecondController {
	private static final Logger logger = LoggerFactory.getLogger(SecondController.class);

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to SecondService";
	}

	@GetMapping("/message")
	public String message(@RequestHeader("second-request") String header) {
		logger.info(header);
		return "Hello World in Second Service";
	}
}