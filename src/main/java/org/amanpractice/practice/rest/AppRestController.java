package org.amanpractice.practice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    @GetMapping("/")
    public String home() {
        return "Welcome to homepage";
    }

    @GetMapping("/about")
    public String about() {
        return "Welcome to about page";
    }

    @Value("${professor.name}")
    private String professorName;

    @Value("${course.name}")
    private String courseName;


    @GetMapping("/get-props")
    public String getProps() {
        return professorName + " teaches " + courseName;
    }
}
