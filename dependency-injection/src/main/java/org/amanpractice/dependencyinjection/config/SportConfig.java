package org.amanpractice.dependencyinjection.config;

import org.amanpractice.dependencyinjection.PhysicsProfessor;
import org.amanpractice.dependencyinjection.Professor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Professor physicsProfessor(){
        return new PhysicsProfessor();
    }

}
