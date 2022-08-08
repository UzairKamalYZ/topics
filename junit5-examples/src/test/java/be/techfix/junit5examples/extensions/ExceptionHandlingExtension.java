package be.techfix.junit5examples.extensions;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class ExceptionHandlingExtension implements TestExecutionExceptionHandler {
    Logger logger = Logger.getLogger(this.getClass().getName());
    @Override
    public void handleTestExecutionException(ExtensionContext extensionContext, Throwable throwable) throws Throwable {

        if(throwable instanceof IllegalArgumentException){
            logger.log(Level.SEVERE,"IllegalArgumentException caught by Extension");
            return;
        }
        throw throwable;

    }
}
