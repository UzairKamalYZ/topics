package be.techfix.junit5examples;

import java.util.logging.Level;
import java.util.logging.Logger;

import be.techfix.junit5examples.extensions.CustomCallBackExtension;
import be.techfix.junit5examples.extensions.ExceptionHandlingExtension;
import be.techfix.junit5examples.extensions.LoggingParameterExtension;
import be.techfix.junit5examples.extensions.LoggingPostProcessorExtensions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(LoggingPostProcessorExtensions.class)
@ExtendWith(LoggingParameterExtension.class)
@ExtendWith(ExceptionHandlingExtension.class)
public class LoggingExtensionsTest {
    Logger postprocessorLogger;
    final Logger parameterizedLogger;

    public LoggingExtensionsTest(Logger parameterizedLogger) {
        this.parameterizedLogger = parameterizedLogger;
    }

    public void setPostProcessorLogger(Logger postprocessoreLogger) {
        this.postprocessorLogger = postprocessoreLogger; // this will be set by LoggingPostProcessorExtensions.
    }

    @Test
    public void shouldLogSomething() {
        postprocessorLogger.info("...This something log coming from PostProcessor Logger......");
    }

    @Test
    public void shouldLogSomethingWithParameterizeLogger() {
        parameterizedLogger.info("...This something log coming from Parameterized Logger...");
    }

    @Test
    void exception_handled_by_extension_donot_need_further_handling_in_tests() throws Throwable {
        Tester tester = new Tester();
        //manually handling the exception.
        try {
            tester.testMethod(1, null);
        } catch (NullPointerException nullPointerException) {
            postprocessorLogger.log(Level.SEVERE, nullPointerException.getMessage());
        }
        // Exception auto-magically by the extension
        tester.testMethod(1, 2);

    }

    @Test
    @ExtendWith(CustomCallBackExtension.class)
    void should_log_timings_before_and_after_execution() {
        postprocessorLogger.info("...This something log coming from PostProcessor Logger......");
    }

    class Tester {
        public void testMethod(Integer param1, Integer param2) throws Throwable {
            int result = param1 * param2;
            throw new IllegalArgumentException();
        }
    }

}
