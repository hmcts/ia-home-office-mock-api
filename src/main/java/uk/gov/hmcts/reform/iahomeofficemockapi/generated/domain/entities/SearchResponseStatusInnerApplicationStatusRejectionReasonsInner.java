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
 * SearchResponseStatusInnerApplicationStatusRejectionReasonsInner
 */

@JsonTypeName("SearchResponse_status_inner_applicationStatus_rejectionReasons_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-25T13:02:20.630405Z[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInnerApplicationStatusRejectionReasonsInner {

  private @Nullable String reason;

  public SearchResponseStatusInnerApplicationStatusRejectionReasonsInner reason(@Nullable String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for application rejection
   * @return reason
   */
  
  @Schema(name = "reason", example = "Application not completed properly", description = "Reason for application rejection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public @Nullable String getReason() {
    return reason;
  }

  public void setReason(@Nullable String reason) {
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
    SearchResponseStatusInnerApplicationStatusRejectionReasonsInner searchResponseStatusInnerApplicationStatusRejectionReasonsInner = (SearchResponseStatusInnerApplicationStatusRejectionReasonsInner) o;
    return Objects.equals(this.reason, searchResponseStatusInnerApplicationStatusRejectionReasonsInner.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInnerApplicationStatusRejectionReasonsInner {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

