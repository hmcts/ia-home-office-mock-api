package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.Objects;

/**
 * InstructErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class InstructErrorResponse   {
  @JsonProperty("messageHeader")
  private MessageHeader messageHeader;

  @JsonProperty("errorDetail")
  private ErrorResponse errorDetail;

  public InstructErrorResponse messageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  /**
   * Get messageHeader
   * @return messageHeader
  */
  @Schema()

  @Valid

  public MessageHeader getMessageHeader() {
    return messageHeader;
  }

  public void setMessageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }

  public InstructErrorResponse errorDetail(ErrorResponse errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  /**
   * Get errorDetail
   * @return errorDetail
  */
  @Schema()

  @Valid

  public ErrorResponse getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(ErrorResponse errorDetail) {
    this.errorDetail = errorDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

