package be.techfix.annotations.custom;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class PersonAspect {

    @Before(value = "@annotation(be.techfix.annotations.custom.Identifier) && execution(public * *(..)) && args(person)", argNames = "joinPoint,person")
    public void verifyAge(JoinPoint joinPoint, Person person) {
        System.out.println("------------------BEFORE--------------------");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Identifier annotation = method.getAnnotation(Identifier.class);
        if (person.getAge() < annotation.ageRestriction()) {
            throw new IllegalCallerException("Not Allowed");
        }
    }
}
