package uk.gov.hmcts.reform.iahomeofficemockapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * Safe entry point for the IA Home Office Mock API.
 * - Scans only the generated controller implementations and any custom handlers.
 * - Avoids bean collisions by excluding interfaces and OpenApiGeneratorApplication.
 */
@SpringBootApplication
@ComponentScan(
    basePackages = {
        "uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api",
        "uk.gov.hmcts.reform.iahomeofficemockapi.handlers"
    },
    excludeFilters = {
        // Exclude all generated interfaces (do not create beans from interfaces)
        @ComponentScan.Filter(
            type = FilterType.ASSIGNABLE_TYPE,
            classes = {
                uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.TokenApi.class,
                uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.ApplicationsApi.class,
                uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.ApplicationStatusApi.class,
                uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.ApplicationInstructApi.class
            }
        )
    }
)
public class MockApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MockApiApplication.class, args);
    }

}