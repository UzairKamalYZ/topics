package be.techfix.annotations.custom;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class CustomAnnotationTester {

    public static void main(String[] args) {

        try {
            List<Person> people = List.of(new Person("Child", 5, "M"), new Person("Man", 20, "M"));

            Class<History> historyClass = History.class;
            History instance = historyClass.getDeclaredConstructor().newInstance();

            for (Person person : people) {
                for (Method method : historyClass.getDeclaredMethods()) {
                    Identifier annotation = method.getAnnotation(Identifier.class);
                    if (annotation != null) {
                        if (person.getAge() > annotation.ageRestriction()) {
                            Object invoke = method.invoke(instance, person);
                            System.out.println(invoke);
                        } else {
                            System.out.println(annotation.error()+" person= "+person.getName());
                        }
                    }
                }
            }


        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
