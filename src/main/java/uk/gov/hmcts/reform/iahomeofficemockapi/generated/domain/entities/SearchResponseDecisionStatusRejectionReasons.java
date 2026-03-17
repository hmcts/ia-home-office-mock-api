package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * SearchResponseDecisionStatusRejectionReasons
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-30T12:19:19.760+01:00[Europe/London]")

public class SearchResponseDecisionStatusRejectionReasons   {
  @JsonProperty("reason")
  private String reason;

  public SearchResponseDecisionStatusRejectionReasons reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for application rejection
   * @return reason
  */
  @Schema(example = "Application not completed properly", description = "Reason for application rejection")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseDecisionStatusRejectionReasons searchResponseDecisionStatusRejectionReasons = (SearchResponseDecisionStatusRejectionReasons) o;
    return Objects.equals(this.reason, searchResponseDecisionStatusRejectionReasons.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDecisionStatusRejectionReasons {\n");

    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

