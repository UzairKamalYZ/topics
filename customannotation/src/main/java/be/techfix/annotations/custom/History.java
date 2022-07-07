package be.techfix.annotations.custom;

public class History {

    @Identifier(ageRestriction = 10, error = "Person is under ageRestriction protection")
    public String getHistoryRecordForPerson(Person person) {
        return "This is historic data of a person = " + person.getName();
    }
}
