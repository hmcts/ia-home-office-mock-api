package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Type of reason for claim on application. **Note:** may not be available for any cases
 */
@Schema(description = "Type of reason for claim on application. **Note:** may not be available for any cases")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-30T12:19:19.760+01:00[Europe/London]")

public class SearchResponseDecisionStatusClaimReasonType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SearchResponseDecisionStatusClaimReasonType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the claim reason type
   * @return code
  */
  @Schema(example = "HUMANRIGHTS", description = "Code for the claim reason type")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseDecisionStatusClaimReasonType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the claim reason type
   * @return description
  */
  @Schema(example = "Human Rights", description = "Description of the claim reason type")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseDecisionStatusClaimReasonType searchResponseDecisionStatusClaimReasonType = (SearchResponseDecisionStatusClaimReasonType) o;
    return Objects.equals(this.code, searchResponseDecisionStatusClaimReasonType.code) &&
        Objects.equals(this.description, searchResponseDecisionStatusClaimReasonType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDecisionStatusClaimReasonType {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

