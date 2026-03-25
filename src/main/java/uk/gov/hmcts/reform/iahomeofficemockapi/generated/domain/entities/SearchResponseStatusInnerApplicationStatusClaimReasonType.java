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
 * Type of reason for claim on application. **Note:** may not be available for any cases
 */

@Schema(name = "SearchResponse_status_inner_applicationStatus_claimReasonType", description = "Type of reason for claim on application. **Note:** may not be available for any cases")
@JsonTypeName("SearchResponse_status_inner_applicationStatus_claimReasonType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-25T18:25:38.716846Z[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInnerApplicationStatusClaimReasonType {

  private @Nullable String code;

  private @Nullable String description;

  public SearchResponseStatusInnerApplicationStatusClaimReasonType code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the claim reason type
   * @return code
   */
  
  @Schema(name = "code", example = "HUMANRIGHTS", description = "Code for the claim reason type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public SearchResponseStatusInnerApplicationStatusClaimReasonType description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the claim reason type
   * @return description
   */
  
  @Schema(name = "description", example = "Human Rights", description = "Description of the claim reason type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SearchResponseStatusInnerApplicationStatusClaimReasonType searchResponseStatusInnerApplicationStatusClaimReasonType = (SearchResponseStatusInnerApplicationStatusClaimReasonType) o;
    return Objects.equals(this.code, searchResponseStatusInnerApplicationStatusClaimReasonType.code) &&
        Objects.equals(this.description, searchResponseStatusInnerApplicationStatusClaimReasonType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInnerApplicationStatusClaimReasonType {\n");
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

