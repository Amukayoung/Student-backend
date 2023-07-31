package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service

public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "andrew",
                        "amukayoung@gmail.com",
                        28,
                        LocalDate.of(1996,11,29)
                ),
                new Student(
                        2L,
                        "okumu",
                        "zila@gmail.com",
                        29,
                        LocalDate.of(1995,11,15)
                )
        );
    }
}
