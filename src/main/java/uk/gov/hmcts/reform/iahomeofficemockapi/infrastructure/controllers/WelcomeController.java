package uk.gov.hmcts.reform.iahomeofficemockapi.infrastructure.controllers;

import static org.springframework.http.ResponseEntity.ok;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/Welcome")
    public ResponseEntity<String> welcome() {
        return ok("Welcome to Home Office API");
    }
}
