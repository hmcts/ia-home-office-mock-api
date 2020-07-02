package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.MessageHeader;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response containing details of the application search.
 */
@ApiModel(description = "Response containing details of the application search.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class SearchResponse   {
  @JsonProperty("messageHeader")
  private MessageHeader messageHeader;

  /**
   * Identifies the type of message
   */
  public enum MessageTypeEnum {
    RESPONSE_RIGHT_OF_APPEAL_DETAILS("RESPONSE_RIGHT_OF_APPEAL_DETAILS");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("messageType")
  private MessageTypeEnum messageType;

  @JsonProperty("status")
  @Valid
  private List<SearchResponseStatus> status = null;

  public SearchResponse messageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  /**
   * Get messageHeader
   * @return messageHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageHeader getMessageHeader() {
    return messageHeader;
  }

  public void setMessageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }

  public SearchResponse messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Identifies the type of message
   * @return messageType
  */
  @ApiModelProperty(example = "RESPONSE_RIGHT_OF_APPEAL_DETAILS", value = "Identifies the type of message")


  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public SearchResponse status(List<SearchResponseStatus> status) {
    this.status = status;
    return this;
  }

  public SearchResponse addStatusItem(SearchResponseStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

  /**
   * An array of persons and application status; generally, the status will be the same for all persons but this format provides flexibility
   * @return status
  */
  @ApiModelProperty(value = "An array of persons and application status; generally, the status will be the same for all persons but this format provides flexibility")

  @Valid

  public List<SearchResponseStatus> getStatus() {
    return status;
  }

  public void setStatus(List<SearchResponseStatus> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponse searchResponse = (SearchResponse) o;
    return Objects.equals(this.messageHeader, searchResponse.messageHeader) &&
        Objects.equals(this.messageType, searchResponse.messageType) &&
        Objects.equals(this.status, searchResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageHeader, messageType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponse {\n");
    
    sb.append("    messageHeader: ").append(toIndentedString(messageHeader)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

