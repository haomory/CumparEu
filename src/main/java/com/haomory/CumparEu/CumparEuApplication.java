package com.haomory.CumparEu;

import com.haomory.CumparEu.entity.User;
import com.haomory.CumparEu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController("/")
public class CumparEuApplication {
	public static void main(String[] args) {
		SpringApplication.run(CumparEuApplication.class, args);
	}
}