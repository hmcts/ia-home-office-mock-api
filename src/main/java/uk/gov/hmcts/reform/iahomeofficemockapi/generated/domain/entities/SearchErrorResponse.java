package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * SearchErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T11:19:43.880285+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchErrorResponse {

  private @Nullable MessageHeader messageHeader;

  private @Nullable ErrorResponse errorDetail;

  public SearchErrorResponse messageHeader(@Nullable MessageHeader messageHeader) {
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

  public SearchErrorResponse errorDetail(@Nullable ErrorResponse errorDetail) {
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
    SearchErrorResponse searchErrorResponse = (SearchErrorResponse) o;
    return Objects.equals(this.messageHeader, searchErrorResponse.messageHeader) &&
        Objects.equals(this.errorDetail, searchErrorResponse.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageHeader, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchErrorResponse {\n");
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

