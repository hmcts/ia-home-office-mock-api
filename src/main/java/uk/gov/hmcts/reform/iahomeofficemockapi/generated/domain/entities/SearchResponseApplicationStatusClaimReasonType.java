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
 * Type of reason for claim on application. **Note:** may not be available for any cases
 */

@Schema(name = "SearchResponse_applicationStatus_claimReasonType", description = "Type of reason for claim on application. **Note:** may not be available for any cases")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-16T15:17:31.480240Z[Europe/London]")
public class SearchResponseApplicationStatusClaimReasonType   {

  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SearchResponseApplicationStatusClaimReasonType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the claim reason type
   * @return code
  */
  
  @Schema(name = "code", example = "HUMANRIGHTS", description = "Code for the claim reason type", required = false)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseApplicationStatusClaimReasonType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the claim reason type
   * @return description
  */
  
  @Schema(name = "description", example = "Human Rights", description = "Description of the claim reason type", required = false)
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
    SearchResponseApplicationStatusClaimReasonType searchResponseApplicationStatusClaimReasonType = (SearchResponseApplicationStatusClaimReasonType) o;
    return Objects.equals(this.code, searchResponseApplicationStatusClaimReasonType.code) &&
        Objects.equals(this.description, searchResponseApplicationStatusClaimReasonType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatusClaimReasonType {\n");
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

