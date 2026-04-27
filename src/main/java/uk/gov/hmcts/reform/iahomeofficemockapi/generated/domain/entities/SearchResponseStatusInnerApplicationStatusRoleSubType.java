package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Role sub-type of the individual in this application. **Note:** may not be available for legacy CID cases
 */

@Schema(name = "SearchResponse_status_inner_applicationStatus_roleSubType", description = "Role sub-type of the individual in this application. **Note:** may not be available for legacy CID cases")
@JsonTypeName("SearchResponse_status_inner_applicationStatus_roleSubType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-27T09:30:21.003363+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInnerApplicationStatusRoleSubType {

  private @Nullable String code;

  private @Nullable String description;

  public SearchResponseStatusInnerApplicationStatusRoleSubType code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the role sub-type
   * @return code
   */
  
  @Schema(name = "code", example = "SPOUSE. Could be MAIN if the role type is APPLICANT", description = "Code for the role sub-type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public SearchResponseStatusInnerApplicationStatusRoleSubType description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the role sub-type
   * @return description
   */
  
  @Schema(name = "description", example = "Spouse", description = "Description of the role sub-type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
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
    SearchResponseStatusInnerApplicationStatusRoleSubType searchResponseStatusInnerApplicationStatusRoleSubType = (SearchResponseStatusInnerApplicationStatusRoleSubType) o;
    return Objects.equals(this.code, searchResponseStatusInnerApplicationStatusRoleSubType.code) &&
        Objects.equals(this.description, searchResponseStatusInnerApplicationStatusRoleSubType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInnerApplicationStatusRoleSubType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

