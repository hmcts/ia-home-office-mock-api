package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.ErrorResponse;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.MessageHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * InstructErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-25T13:02:20.630405Z[Europe/London]", comments = "Generator version: 7.20.0")
public class InstructErrorResponse {

  private @Nullable MessageHeader messageHeader;

  private @Nullable ErrorResponse errorDetail;

  public InstructErrorResponse messageHeader(@Nullable MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  /**
   * Get messageHeader
   * @return messageHeader
   */
  @Valid 
  @Schema(name = "messageHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageHeader")
  public @Nullable MessageHeader getMessageHeader() {
    return messageHeader;
  }

  public void setMessageHeader(@Nullable MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }

  public InstructErrorResponse errorDetail(@Nullable ErrorResponse errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  /**
   * Get errorDetail
   * @return errorDetail
   */
  @Valid 
  @Schema(name = "errorDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorDetail")
  public @Nullable ErrorResponse getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(@Nullable ErrorResponse errorDetail) {
    this.errorDetail = errorDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructErrorResponse instructErrorResponse = (InstructErrorResponse) o;
    return Objects.equals(this.messageHeader, instructErrorResponse.messageHeader) &&
        Objects.equals(this.errorDetail, instructErrorResponse.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageHeader, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructErrorResponse {\n");
    sb.append("    messageHeader: ").append(toIndentedString(messageHeader)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

