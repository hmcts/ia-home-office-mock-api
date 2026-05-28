package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.annotation.Generated;

/**
 * Gets or Sets HomeOfficeConsumer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T11:19:43.880285+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public enum HomeOfficeConsumer {

  HMCTS("HMCTS");

  private final String value;

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

