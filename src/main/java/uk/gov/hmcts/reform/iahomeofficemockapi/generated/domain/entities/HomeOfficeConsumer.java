package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets HomeOfficeConsumer
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T10:12:45.452730Z[Europe/London]", comments = "Generator version: 7.20.0")
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

