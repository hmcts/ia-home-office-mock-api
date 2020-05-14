package uk.gov.hmcts.reform.iahomeofficemockapi;

import org.springframework.boot.SpringApplication;

//@SpringBootApplication
//@EnableCircuitBreaker
@SuppressWarnings("HideUtilityClassConstructor") // Spring needs a constructor, its not a utility class
public class Application {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
