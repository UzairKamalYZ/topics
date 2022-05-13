package be.techfix.client;

import org.springframework.stereotype.Component;

@Component
public class ClientRunner {
    final RequiredInterface requiredInterface;

    public ClientRunner(RequiredInterface requiredInterface) {
        this.requiredInterface = requiredInterface;
    }

    public void print() {
        System.out.println("----Client code---");
        // Lets say user  this module want to invode isPrinter Running.
        // but the isPrinter running method is in class which we cannot include otherwise we would introduce
        //circular dependency
        // let try to resolve by creating interface in client
        // and give implementation in service
        System.out.println("value : " + requiredInterface.printMeSomething());
    }
}
