package dev.flako.firstawslambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class FirstawslambdaApplication {

	private final static double KILOMETERS_PER_MILE = 1.6;

	public static void main(String[] args) {
		SpringApplication.run(FirstawslambdaApplication.class, args);
	}

	@Bean
	public Function<String, String> kmconverterfrommiles(){
		return (m) ->{
			try{
				double millas = Double.parseDouble(m);
				return "there is "+ (millas * KILOMETERS_PER_MILE) + "Km in "+ millas + " Miles";
			}catch (RuntimeException e){
				return "Invalid input, change '"+ m + "' and try again ;)";
			}
		};
	}

}
