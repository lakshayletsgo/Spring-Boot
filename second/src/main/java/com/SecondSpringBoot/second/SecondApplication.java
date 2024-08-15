// ./mvnw clean --> It is used to remove target folder and the temporary files and directory
// ./mvnw compile --> It is used to convert data to bytecode and create the target folder
// ./mvnw test --> It will run after the compile i.e. If you run test then the compile will automatically run
// ./mvnw package -->It will run after the test command i.e If you run package then the test will automatically run
//This command creates a jar file in the target that will can be run to view the application

// ./mvnw verify --> It will run after the package command i.e If you run verify then the package will automatically run

//To start a application using maven we first run the ./mvnw compile
//After that we use the command ./mvnw clean test
//After that we run the command ./mvnw clean package     THis creates a jar file in target that we can run
//After that we cd target  		Here where we have the jar file that can be run
//Then we just run the command   java -jar <then the jar file name present in the target folder>

//Or we can just wright the ./mvnw spring-boot:run

package com.SecondSpringBoot.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);
	}

}
