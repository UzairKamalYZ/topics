package be.techfix.memento;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Person {

    private final String name;
    private int age;
    private boolean married;
    private int kids;

    public Person(String name, int age, boolean married, int kids) {
        this.name = name;
        this.age = age;
        this.married = married;
        this.kids = kids;
    }

    public PersonMemento createMemento() {
        return PersonMemento.builder().age(this.age).married(this.married).kids(this.kids).age(this.age).build();
    }

    public void setMemento(PersonMemento memento) {
        this.age = memento.getAge();
        this.married = memento.isMarried();
        this.kids = memento.getKids();
    }
}
