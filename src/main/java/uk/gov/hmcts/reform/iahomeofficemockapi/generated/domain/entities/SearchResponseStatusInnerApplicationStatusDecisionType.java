package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * Type of decision made on the application
 */

@Schema(name = "SearchResponse_status_inner_applicationStatus_decisionType", description = "Type of decision made on the application")
@JsonTypeName("SearchResponse_status_inner_applicationStatus_decisionType")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T11:19:43.880285+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInnerApplicationStatusDecisionType {

  private @Nullable String code;

  private @Nullable String description;

  public SearchResponseStatusInnerApplicationStatusDecisionType code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the decision type
   * @return code
   */

  @Schema(name = "code", example = "REJECTION", description = "Code for the decision type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public SearchResponseStatusInnerApplicationStatusDecisionType description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the decision type
   * @return description
   */

  @Schema(name = "description", example = "Rejected", description = "Description of the decision type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SearchResponseStatusInnerApplicationStatusDecisionType searchResponseStatusInnerApplicationStatusDecisionType = (SearchResponseStatusInnerApplicationStatusDecisionType) o;
    return Objects.equals(this.code, searchResponseStatusInnerApplicationStatusDecisionType.code) &&
        Objects.equals(this.description, searchResponseStatusInnerApplicationStatusDecisionType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInnerApplicationStatusDecisionType {\n");
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

