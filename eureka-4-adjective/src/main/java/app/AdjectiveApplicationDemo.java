package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdjectiveApplicationDemo {

	public static void main(String[] args) {
		SpringApplication.run(AdjectiveApplicationDemo.class, args);
	}
}
