package com.dias.logapp.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DummyEndpoint {

    @GetMapping
    public String testLog() {
        log.debug("Debug");
        log.info("Info");
        log.warn("Warn");
        log.error("Error");

        return "Logged";
    }
}
