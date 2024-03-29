package be.techfix.annotations.custom;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Identifier {
    String error();

    long ageRestriction();
}
