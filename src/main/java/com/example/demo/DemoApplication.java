package com.example.demo;

import com.example.demo.constant.FileType;
import com.example.demo.service.FileParserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class DemoApplication {
	private static FileParserService fileParserService;

    public DemoApplication(FileParserService fileParserService) {
        DemoApplication.fileParserService = fileParserService;
    }

    public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		fileParserService.parse(new File("classpath:sample1.csv"), FileType.CSV);
		fileParserService.parse(new File("classpath:sample1.json"), FileType.JSON);
	}

}
