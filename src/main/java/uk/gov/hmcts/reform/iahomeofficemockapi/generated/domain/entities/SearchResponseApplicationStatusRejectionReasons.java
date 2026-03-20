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
 * SearchResponseApplicationStatusRejectionReasons
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-20T18:22:35.342881Z[Europe/London]")
public class SearchResponseApplicationStatusRejectionReasons   {

  @JsonProperty("reason")
  private String reason;

  public SearchResponseApplicationStatusRejectionReasons reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for application rejection
   * @return reason
  */
  
  @Schema(name = "reason", example = "Application not completed properly", description = "Reason for application rejection", required = false)
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseApplicationStatusRejectionReasons searchResponseApplicationStatusRejectionReasons = (SearchResponseApplicationStatusRejectionReasons) o;
    return Objects.equals(this.reason, searchResponseApplicationStatusRejectionReasons.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatusRejectionReasons {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

