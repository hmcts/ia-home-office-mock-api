package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.invoker;

import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import tools.jackson.databind.JacksonModule;

@SpringBootApplication(
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
@ComponentScan(
    basePackages = {"uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.invoker", "uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api" , "org.openapitools.configuration"},
    nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class
)
public class OpenApiGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenApiGeneratorApplication.class, args);
    }

    @Bean(name = "uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.invoker.OpenApiGeneratorApplication.jsonNullableModule")
    public JacksonModule jsonNullableModule() {
        return new JsonNullableModule();
    }

}
