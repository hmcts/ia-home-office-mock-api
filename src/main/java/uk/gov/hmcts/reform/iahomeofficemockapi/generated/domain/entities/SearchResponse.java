package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.MessageHeader;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Response containing details of the application search.
 */

@Schema(name = "SearchResponse", description = "Response containing details of the application search.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T17:52:14.183321Z[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponse {

  private @Nullable MessageHeader messageHeader;

  /**
   * Identifies the type of message
   */
  public enum MessageTypeEnum {
    RESPONSE_RIGHT_OF_APPEAL_DETAILS("RESPONSE_RIGHT_OF_APPEAL_DETAILS");

    private final String value;

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

  private @Nullable MessageTypeEnum messageType;

  @Valid
  private List<@Valid SearchResponseStatusInner> status = new ArrayList<>();

  public SearchResponse messageHeader(@Nullable MessageHeader messageHeader) {
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

  public SearchResponse messageType(@Nullable MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Identifies the type of message
   * @return messageType
   */
  
  @Schema(name = "messageType", example = "RESPONSE_RIGHT_OF_APPEAL_DETAILS", description = "Identifies the type of message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageType")
  public @Nullable MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(@Nullable MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public SearchResponse status(List<@Valid SearchResponseStatusInner> status) {
    this.status = status;
    return this;
  }

  public SearchResponse addStatusItem(SearchResponseStatusInner statusItem) {
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
  @Valid 
  @Schema(name = "status", description = "An array of persons and application status; generally, the status will be the same for all persons but this format provides flexibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public List<@Valid SearchResponseStatusInner> getStatus() {
    return status;
  }

  public void setStatus(List<@Valid SearchResponseStatusInner> status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

