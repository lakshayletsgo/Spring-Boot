//Beans
//It is used to switch between components
package com.thirdSpringBoot.Third;

import com.thirdSpringBoot.Third.services.ColourPrinter;
import com.thirdSpringBoot.Third.services.impl.ColourPrinterImpl;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
@Log
public class ThirdApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;
	public ThirdApplication (ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}
	public static void main(String[] args) {
		SpringApplication.run(ThirdApplication.class, args);
	}
	public void run(final String... args){
		log.info(colourPrinter.print());
	}
}
