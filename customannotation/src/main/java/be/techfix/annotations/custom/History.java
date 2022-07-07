package be.techfix.annotations.custom;

public class History {

    @Identifier(ageRestriction = 10, error = "Person is under ageRestriction protection")
    public String getHistoryRecordForPerson(Person person) {
        return "This is historic data of a person = " + person.getName();
    }

    @Identifier(ageRestriction = 5, error = "Person is under ageRestriction protection")
    public String get2ndHistoryRecordForPerson(Person person) {
        return "This is 2nd degree historic data of a person = " + person.getName();
    }
    @Identifier(ageRestriction = 2, error = "Person is under ageRestriction protection")
    public String get3rdHistoryRecordForPerson(Person person) {
        return "This is 3rd degree historic data of a person = " + person.getName();
    }
}
