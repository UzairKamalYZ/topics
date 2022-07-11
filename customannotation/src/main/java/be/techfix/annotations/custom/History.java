package be.techfix.annotations.custom;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
public class History {

    @Identifier(ageRestriction = 10, error = "Person is under ageRestriction protection")
    public String getHistoryRecordForPerson(@NotNull Person person) {
        return "This is historic data of a person = " + person.getName()+" with Age ="+person.getAge()+"\n";
    }

    @Identifier(ageRestriction = 5, error = "Person is under ageRestriction protection")
    public String get2ndHistoryRecordForPerson(@NotNull Person person) {
        return "This is 2nd degree historic data of a person = " + person.getName()+" with Age ="+person.getAge()+"\n";
    }
    @Identifier(ageRestriction = 2, error = "Person is under ageRestriction protection")
    public String get3rdHistoryRecordForPerson(@NotNull Person person) {
        return "This is 3rd degree historic data of a person = " + person.getName()+" with Age ="+person.getAge()+"\n";
    }
}
