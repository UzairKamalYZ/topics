package be.techfix.service;

import be.techfix.client.RequiredInterface;
import org.springframework.stereotype.Component;

@Component
public class RequiredInterfaceImpl implements RequiredInterface {
    private final PrintService printService;

    public RequiredInterfaceImpl(PrintService printService) {
        this.printService = printService;
    }

    @Override
    public String printMeSomething() {
        return printService.printMeSomethingFromService();
    }
}
