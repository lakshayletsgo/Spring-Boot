//Configuration Properties
//This is a annotation where we have to use the command line to take input
//We put this annotation to the class where we have to give the input for eg here the class carConfig need input no of seats and other inputs
//We then provide the prefix that the system will find for the properties either in the application.properties file or in the environment variable
//We then just add the properties either in the application.properties file or in the env variables
package com.FourthSpringBoot.Fourth;

import com.FourthSpringBoot.Fourth.config.CarConfig;
//import com.FourthSpringBoot.Fourth.config.Ca;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import static org.yaml.snakeyaml.TypeDescription.log;

@SpringBootApplication
@Log
public class FourthApplication implements CommandLineRunner {
	private CarConfig carConfig;
	public FourthApplication(CarConfig carConfig) {
		this.carConfig= carConfig;
	}
	public static void main(String[] args) {
		SpringApplication.run(FourthApplication.class, args);
	}
	public void run(final String... args){
//		final PizzaConfig pizzaConfig = new PizzaConfig("7","black","SUV");
		log.info(String.format("I want to buy a car with %s number of seats in %s which is of %s type",carConfig.getNoOfSeats(),carConfig.getColor(),carConfig.getType()));
	}


}
