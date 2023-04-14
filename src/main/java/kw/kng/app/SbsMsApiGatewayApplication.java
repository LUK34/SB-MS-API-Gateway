package kw.kng.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbsMsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbsMsApiGatewayApplication.class, args);
	}

}
