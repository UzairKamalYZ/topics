package be.techfix.service;

import org.springframework.stereotype.Service;

@Service
public class PrintService {

    public String printMeSomethingFromService() {
        return "::: Something From Service ::::";
    }
}
