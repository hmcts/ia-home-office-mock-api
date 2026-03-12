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
 * Person&#39;s nationality
 */

@Schema(name = "Person_nationality", description = "Person's nationality")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T18:32:14.905283Z[Europe/London]")
public class PersonNationality   {

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public PersonNationality code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Short code for the nationality
   * @return code
  */
  
  @Schema(name = "code", example = "CAN (denoting Canada)", description = "Short code for the nationality", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PersonNationality description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the nationality
   * @return description
  */
  
  @Schema(name = "description", example = "Canada", description = "Description of the nationality", required = false)
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
    PersonNationality personNationality = (PersonNationality) o;
    return Objects.equals(this.code, personNationality.code) &&
        Objects.equals(this.description, personNationality.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNationality {\n");
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

