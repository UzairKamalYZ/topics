package be.techfix.junit5examples.extensions;

import java.util.logging.Logger;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestInstancePostProcessor;

public class LoggingPostProcessorExtensions implements TestInstancePostProcessor {
    @Override
    public void postProcessTestInstance(Object testInstance, ExtensionContext extensionContext) throws Exception {
        Logger logger = Logger.getLogger(testInstance.getClass().getName());
        testInstance.getClass().getMethod("setPostProcessorLogger", Logger.class).invoke(testInstance, logger);
    }
}
