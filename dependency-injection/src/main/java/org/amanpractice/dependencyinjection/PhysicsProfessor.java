package org.amanpractice.dependencyinjection;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//Example of lazy annotation
//@Component // @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //@Lazy
//Example of bean config
//no @Component annotation here

public class PhysicsProfessor implements Professor {

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy");
    }

    @Override
    public String giveLecture(){
        return "E=mc2";
    }
}
