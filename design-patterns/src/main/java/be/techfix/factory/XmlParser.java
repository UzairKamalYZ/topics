package be.techfix.factory;

import lombok.extern.java.Log;

@Log
public class XmlParser<T, R> implements Parser<T, R> {
        @Override
        public T parse(R input) {
            log.info("xml parsing started");
            return null; // Replace with actual implementation
        }
    }
