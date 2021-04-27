package com.zdbank.newbie.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, JANUARY, 5)
            );
            Student alex = new Student(
                    "alex",
                    "alex@gmail.com",
                    LocalDate.of(2009, JANUARY, 7)
            );
            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}