package org.openapitools.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Appeals interface")
                                .description("This is a specification for appeal/challenge to be consumed by HMCTS (in the first instance). ")
                                .termsOfService("http://swagger.io/terms/")
                                .license(
                                        new License()
                                                .name("Apache 2.0")
                                                .url("http://www.apache.org/licenses/LICENSE-2.0.html")
                                )
                                .version("2.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("oauth2", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}
