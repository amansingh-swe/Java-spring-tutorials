package org.amanpractice.dependencyinjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// Example to set an implementation as primary
@Component //@Primary
public class MathProfessor implements Professor {

    @Override
    public String giveLecture(){
        return "Bodmas";
    }
}
