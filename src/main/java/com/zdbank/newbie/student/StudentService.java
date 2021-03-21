package com.zdbank.newbie.student;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {

        return List.of(
                new Student(
                        1L,
                        "Nebuchadnezzar",
                        "neo@gmail.com",
                        LocalDate.of(1999, Month.DECEMBER,31),
                        22
                )
        );
    }
};
