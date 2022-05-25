package com.example.jirarenderingbackend;

import com.example.jirarenderingbackend.utils.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})

public class JiraRenderingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(JiraRenderingBackendApplication.class, args);
	}

}
