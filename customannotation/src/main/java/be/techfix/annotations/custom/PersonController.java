package be.techfix.annotations.custom;

import static java.util.List.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    History history;
    @GetMapping("/history")
    public ResponseEntity<List<String>> getPersonHistory() {
        List<Person> people = of(new Person("Child", 5, "M"), new Person("Man", 20, "M"));
        List<String> totalHistoryList = new ArrayList<>();
        for (Person p : people) {
            String totalHistory = "";
            try{

                totalHistory = totalHistory.concat("  1st level History=  ").concat(history.getHistoryRecordForPerson(p));
                totalHistory = totalHistory.concat("  2nd level History=  ").concat(history.get2ndHistoryRecordForPerson(p));
                totalHistory = totalHistory.concat("  3rd level History=  ").concat(history.get3rdHistoryRecordForPerson(p));
            }catch (Exception exception){
                exception.printStackTrace();
            }
            totalHistoryList.add(totalHistory);
        }
        return ResponseEntity.ok(totalHistoryList);
    }
}
