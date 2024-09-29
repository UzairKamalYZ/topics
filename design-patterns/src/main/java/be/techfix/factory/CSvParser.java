package be.techfix.factory;

import lombok.extern.java.Log;

@Log
public class CSvParser<T, R> implements Parser<T, R> {
    @Override
    public T parse(R input) {
        log.info("csv parsing started");
        return null; // Replace with actual implementation
    }
}
