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
 * Role of the individual in this application
 */

@Schema(name = "SearchResponse_applicationStatus_roleType", description = "Role of the individual in this application")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T18:03:21.228960Z[Europe/London]")
public class SearchResponseApplicationStatusRoleType   {

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SearchResponseApplicationStatusRoleType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the role type
   * @return code
  */
  
  @Schema(name = "code", example = "DEPENDANT", description = "Code for the role type", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseApplicationStatusRoleType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the role type
   * @return description
  */
  
  @Schema(name = "description", example = "Dependant", description = "Description of the role type", required = false)
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
    SearchResponseApplicationStatusRoleType searchResponseApplicationStatusRoleType = (SearchResponseApplicationStatusRoleType) o;
    return Objects.equals(this.code, searchResponseApplicationStatusRoleType.code) &&
        Objects.equals(this.description, searchResponseApplicationStatusRoleType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatusRoleType {\n");
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

