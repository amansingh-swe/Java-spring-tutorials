package org.amanpractice.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    private Professor professor;

//    Example of Constructor Injection
//    @Autowired
//    public AppRestController(Professor professor) {
//        this.professor = professor;
//    }

//    Example of setter injection
//    @Autowired
//    public void setCoach(Professor professor){
//        this.professor = professor;
//    }

//    Example of Qualifiers and how they are used
    @Autowired
    public AppRestController(@Qualifier("physicsProfessor") Professor professor) {
        this.professor = professor;
    }

    @GetMapping("/")
    public String getLecture(){
        return professor.giveLecture();
    }

}
