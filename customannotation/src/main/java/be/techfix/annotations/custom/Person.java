package be.techfix.annotations.custom;

public class Person {

    private final String name;
    private final long age;
    private final String gender;

    public Person(String name, long age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
