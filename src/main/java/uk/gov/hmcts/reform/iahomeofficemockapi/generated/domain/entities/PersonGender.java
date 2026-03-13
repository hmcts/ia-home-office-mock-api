package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonGender
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-13T17:34:45.614564Z[Europe/London]")
public class PersonGender   {

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public PersonGender code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Letter code for the gender
   * @return code
  */
  
  @Schema(name = "code", example = "M (denoting male)", description = "Letter code for the gender", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PersonGender description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Gender description
   * @return description
  */
  
  @Schema(name = "description", example = "Male", description = "Gender description", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonGender personGender = (PersonGender) o;
    return Objects.equals(this.code, personGender.code) &&
        Objects.equals(this.description, personGender.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGender {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

