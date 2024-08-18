//Beans
//It is used to switch between components


//Instead of beans we can also use the component annotation to declare a bean
//We use the @Component where we need to make a bean and then use the class as a bean
//We dont need the config for this
//We can also use the annotation @Service instead of the component

//If we want to change the port number than we have to server.port = port number       in application.yml

//Another way is to rename the application.yml to application.yml and use server:
//																						port: 8212

//Another way is to give SERVER_PORT = 8218 in the environment variable
//To declare environment variable either we can use intellij by going to edit configuration and then add the SERVER_PORT =9212
//Another way to declare environment variable is by command line by just             SERVER_PORT = 9213 ./mvnw sprint-boot:run
//The last way is temporary way of giving port number
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
