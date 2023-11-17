package com.helloworld.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Student> students() {

        Student student1 = new Student("John", 20, "American");
        Student student2 = new Student("Mary", 19, "French");
        Student student3 = new Student("Kenta", 22, "Japanese");

        return List.of(student1, student2, student3);
    }
}
