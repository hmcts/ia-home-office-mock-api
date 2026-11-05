package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Gets or Sets HomeOfficeConsumer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-04T14:08:47.269859Z[Europe/London]", comments = "Generator version: 7.20.0")
public enum HomeOfficeConsumer {

  HMCTS("HMCTS");

  private final String value;

    @JsonCreator
    HomeOfficeConsumer(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static HomeOfficeConsumer fromValue(String value) {
    for (HomeOfficeConsumer b : HomeOfficeConsumer.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

