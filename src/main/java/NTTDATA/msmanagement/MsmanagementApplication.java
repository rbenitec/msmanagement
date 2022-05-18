package NTTDATA.msmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsmanagementApplication.class, args);
	}

}
