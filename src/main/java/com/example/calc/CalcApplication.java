package com.example.calc;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class CalcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner() {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<InputData>> typeReference = new TypeReference<List<InputData>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/);
			try {
				List<User> users = mapper.readValue(inputStream,typeReference);
				System.out.println("JSON decoded");
			} catch (IOException e){
				System.out.println("Unable to decode JSON: " + e.getMessage());
			}
		};
	}*/

}
