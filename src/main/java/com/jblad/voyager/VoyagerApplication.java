package com.jblad.voyager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.jblad.voyager.util.Processor;


@SpringBootApplication
public class VoyagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(VoyagerApplication.class, args);
		Processor scalaObj = new Processor(5);
		int val = scalaObj.getMyField();
		System.out.println("dw");
		System.out.println(val);
		scalaObj.addToMyField(7);
		System.out.println(scalaObj.getMyField());
	}

}
