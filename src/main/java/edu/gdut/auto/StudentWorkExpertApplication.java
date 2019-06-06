package edu.gdut.auto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("edu.gdut.auto.mappers")
public class StudentWorkExpertApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentWorkExpertApplication.class, args);
    }

}
