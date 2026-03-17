package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.Objects;

/**
 * SearchErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class SearchErrorResponse   {
  @JsonProperty("messageHeader")
  private MessageHeader messageHeader;

  @JsonProperty("errorDetail")
  private ErrorResponse errorDetail;

  public SearchErrorResponse messageHeader(MessageHeader messageHeader) {
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

  public SearchErrorResponse errorDetail(ErrorResponse errorDetail) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

