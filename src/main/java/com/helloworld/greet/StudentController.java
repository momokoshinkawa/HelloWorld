package com.helloworld.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/students")
    public List<Students> students() {

        Students student1 = new Students("John", 20, "American");
        Students student2 = new Students("Mary", 19, "French");
        Students student3 = new Students("Kenta", 22, "Japanese");

        return List.of(student1, student2, student3);
    }
}