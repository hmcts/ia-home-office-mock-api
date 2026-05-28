package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.HomeOfficeConsumer;

/**
 * This class provides Spring Converter beans for the enum models in the OpenAPI specification.
 *
 * By default, Spring only converts primitive types to enums using Enum::valueOf, which can prevent
 * correct conversion if the OpenAPI specification is using an `enumPropertyNaming` other than
 * `original` or the specification has an integer enum.
 */
@Configuration(value = "org.openapitools.configuration.enumConverterConfiguration")
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.homeOfficeConsumerConverter")
    Converter<String, HomeOfficeConsumer> homeOfficeConsumerConverter() {
        return new Converter<String, HomeOfficeConsumer>() {
            @Override
            public HomeOfficeConsumer convert(String source) {
                return HomeOfficeConsumer.fromValue(source);
            }
        };
    }

}
