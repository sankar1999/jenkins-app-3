package com.jenkins.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApp3Application {

	public static void main(String[] args) {
		System.out.println("--> My Applcation Being Started...");
		System.out.println("Hello world");
		SpringApplication.run(JenkinsApp3Application.class, args);
	}

}
