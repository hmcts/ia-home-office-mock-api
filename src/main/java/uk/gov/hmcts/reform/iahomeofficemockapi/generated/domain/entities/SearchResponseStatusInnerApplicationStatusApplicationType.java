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
 * Type of application
 */

@Schema(name = "SearchResponse_status_inner_applicationStatus_applicationType", description = "Type of application")
@JsonTypeName("SearchResponse_status_inner_applicationStatus_applicationType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-25T19:03:55.795081Z[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInnerApplicationStatusApplicationType {

  private @Nullable String code;

  private @Nullable String description;

  public SearchResponseStatusInnerApplicationStatusApplicationType code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the application type
   * @return code
   */
  
  @Schema(name = "code", example = "ASYLUM", description = "Code for the application type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public SearchResponseStatusInnerApplicationStatusApplicationType description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the application type
   * @return description
   */
  
  @Schema(name = "description", example = "Asylum and Protection", description = "Description of the application type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SearchResponseStatusInnerApplicationStatusApplicationType searchResponseStatusInnerApplicationStatusApplicationType = (SearchResponseStatusInnerApplicationStatusApplicationType) o;
    return Objects.equals(this.code, searchResponseStatusInnerApplicationStatusApplicationType.code) &&
        Objects.equals(this.description, searchResponseStatusInnerApplicationStatusApplicationType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInnerApplicationStatusApplicationType {\n");
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

