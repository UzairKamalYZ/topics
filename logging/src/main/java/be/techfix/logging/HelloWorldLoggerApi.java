package be.techfix.logging;

import lombok.extern.log4j.Log4j2;

import org.apache.logging.log4j.Marker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class HelloWorldLoggerApi {
    public static final Marker CONFIDENTIAL = org.apache.logging.log4j.MarkerManager.getMarker("SPECIFIC");
    @GetMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        log.info("----Hello----");
        log.info( CONFIDENTIAL,user+" saying hello ");
        return "OK";
    }
}
