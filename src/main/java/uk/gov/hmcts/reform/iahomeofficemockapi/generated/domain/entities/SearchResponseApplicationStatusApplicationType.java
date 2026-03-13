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
 * Type of application
 */

@Schema(name = "SearchResponse_applicationStatus_applicationType", description = "Type of application")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-13T17:34:45.614564Z[Europe/London]")
public class SearchResponseApplicationStatusApplicationType   {

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SearchResponseApplicationStatusApplicationType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the application type
   * @return code
  */
  
  @Schema(name = "code", example = "ASYLUM", description = "Code for the application type", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseApplicationStatusApplicationType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the application type
   * @return description
  */
  
  @Schema(name = "description", example = "Asylum and Protection", description = "Description of the application type", required = false)
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
    SearchResponseApplicationStatusApplicationType searchResponseApplicationStatusApplicationType = (SearchResponseApplicationStatusApplicationType) o;
    return Objects.equals(this.code, searchResponseApplicationStatusApplicationType.code) &&
        Objects.equals(this.description, searchResponseApplicationStatusApplicationType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatusApplicationType {\n");
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

