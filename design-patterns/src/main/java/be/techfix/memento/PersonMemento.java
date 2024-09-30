package be.techfix.memento;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PersonMemento {
    private int age;
    private boolean married;
    private int kids;
}
