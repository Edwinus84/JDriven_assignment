package com.jdriven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdrivenApplication implements CommandLineRunner {
	
	@Autowired
    private ProductService productService;
	
	/**
	 * Main method to run the springboot application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(JdrivenApplication.class, args);
	}
	

	/**
	 * Set up a starting set of data.
	 * Because it is in database memory at the startup the data will be propagated
	 */
    @Override
    public void run(String... args) throws Exception {
    	productService.createProduct("Keyboard", "A QWERTY keyboard with an usb cable", 19.95, "Keyboard, letters, USB, wired");
    	productService.createProduct("Mouse", "A computer mouse with an usb cable", 14.95, "Mouse, ball, USB, wired");
    	productService.createProduct("Wireless Keyboard", "A QWERTY keyboard with Bluetooth", 29.95, "Keyboard, letters, Bluetooth, wireless");
    	productService.createProduct("Bluetooth Mouse", "A computer mouse with an usb cable", 24.95, "Mouse, ball, Bluetooth, wireless");
    }

}
