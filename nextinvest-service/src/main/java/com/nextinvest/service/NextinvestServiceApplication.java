package com.nextinvest.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class NextinvestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NextinvestServiceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapperBean() {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		return mapper;
	}
}
