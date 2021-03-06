package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Consumer;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Message parameters (not business oriented).
 */
@ApiModel(description = "Message parameters (not business oriented).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class MessageHeader   {
  @JsonProperty("eventDateTime")
  private OffsetDateTime eventDateTime;

  @JsonProperty("correlationId")
  private String correlationId;

  @JsonProperty("consumer")
  private Consumer consumer;

  public MessageHeader eventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
    return this;
  }

  /**
   * UTC timestamp for debugging purposes
   * @return eventDateTime
  */
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", required = true, value = "UTC timestamp for debugging purposes")
  @NotNull

  @Valid

  public OffsetDateTime getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(OffsetDateTime eventDateTime) {
    this.eventDateTime = eventDateTime;
  }

  public MessageHeader correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

  /**
   * ID allowing correlation between service consumer and API log files. Expected to be unique, for example, a UUID
   * @return correlationId
  */
  @ApiModelProperty(example = "ABC2344BCED2234EA", required = true, value = "ID allowing correlation between service consumer and API log files. Expected to be unique, for example, a UUID")
  @NotNull


  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public MessageHeader consumer(Consumer consumer) {
    this.consumer = consumer;
    return this;
  }

  /**
   * Get consumer
   * @return consumer
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Consumer getConsumer() {
    return consumer;
  }

  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageHeader messageHeader = (MessageHeader) o;
    return Objects.equals(this.eventDateTime, messageHeader.eventDateTime) &&
        Objects.equals(this.correlationId, messageHeader.correlationId) &&
        Objects.equals(this.consumer, messageHeader.consumer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDateTime, correlationId, consumer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageHeader {\n");
    
    sb.append("    eventDateTime: ").append(toIndentedString(eventDateTime)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    consumer: ").append(toIndentedString(consumer)).append("\n");
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

