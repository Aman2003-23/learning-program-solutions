package com.cogniant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {
	public static void displayDate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		try {
			Date date = format.parse("31/12/2018");
			System.out.println("Parsed Date: " + date);
		} catch (ParseException e) {
			System.out.println("Date parsing failed: " + e.getMessage());
		}
	}

	public static void main(String[] args) {

		SpringApplication.run(SpringLearnApplication.class, args);
		System.out.println("running spring app..");
		displayDate();
	}

}
