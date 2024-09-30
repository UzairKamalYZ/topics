package be.techfix.memento;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static final String PERSON_A = "A";
    public static final String PERSON_B = "B";

    public static void main(String[] args) {
        Map<String,List<PersonMemento>> mementos = new HashMap<>();

        Person personA = new Person(PERSON_A,12,false,0);
        List<PersonMemento> personMementos = mementos.get(PERSON_A) == null ? new ArrayList<>() : mementos.get(PERSON_A);
        personMementos.add(personA.createMemento());
        mementos.put(PERSON_A,personMementos);
        System.out.println(personA);

        personA = new Person(PERSON_A,25,true,0);
        personMementos = mementos.get(PERSON_A) == null ? new ArrayList<>() : mementos.get(PERSON_A);
        personMementos.add(personA.createMemento());
        mementos.put(PERSON_A,personMementos);
        System.out.println(personA);

        Person personB = new Person(PERSON_B,25,true,1);
        personMementos = mementos.get(PERSON_B) == null ? new ArrayList<>() : mementos.get(PERSON_B);
        personMementos.add(personB.createMemento());
        mementos.put(PERSON_B,personMementos);
        System.out.println(personB);


        personB = new Person(PERSON_B,35,true,2);
        personMementos = mementos.get(PERSON_B) == null ? new ArrayList<>() : mementos.get(PERSON_B);
        personMementos.add(personB.createMemento());
        mementos.put(PERSON_B,personMementos);
        System.out.println(personB);


        System.out.println("Lets undo evolution of Person A and Person B");

        List<PersonMemento> personMementos1 = mementos.get(PERSON_A);
        PersonMemento personAMemento = personMementos1.get(personMementos1.size()-1);
        personA.setMemento(personAMemento);
        System.out.println(personA);

        List<PersonMemento> personMementos2 = mementos.get(PERSON_B);
        PersonMemento personBMemento = personMementos1.get(personMementos2.size()-1);
        personB.setMemento(personBMemento);
        System.out.println(personB);
    }
}
