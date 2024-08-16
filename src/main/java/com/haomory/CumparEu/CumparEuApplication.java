package com.haomory.CumparEu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class CumparEuApplication {
	public static void main(String[] args) {
		SpringApplication.run(CumparEuApplication.class, args);
	}
}