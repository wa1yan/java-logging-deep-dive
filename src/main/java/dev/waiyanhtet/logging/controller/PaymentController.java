package dev.waiyanhtet.logging.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class PaymentController {

    Logger log = LoggerFactory.getLogger(PaymentController.class);

    @GetMapping(value = "/log-test")
    public ResponseEntity<String> getPayment() {

        log.error("log.error");
        log.warn("log.warn");
        log.info("log.info");
        log.debug("log.debug");
        log.trace("log.trace");

        return ResponseEntity.ok("Hello World!");
    }
}
