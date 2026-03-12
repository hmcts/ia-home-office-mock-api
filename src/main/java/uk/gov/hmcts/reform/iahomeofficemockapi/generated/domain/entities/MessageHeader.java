package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Consumer;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Message parameters (not business oriented).
 */

@Schema(name = "MessageHeader", description = "Message parameters (not business oriented).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-12T18:03:21.228960Z[Europe/London]")
public class MessageHeader   {

  @JsonProperty("eventDateTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
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
  @NotNull @Valid 
  @Schema(name = "eventDateTime", example = "2017-07-21T17:32:28Z", description = "UTC timestamp for debugging purposes", required = true)
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
  @NotNull 
  @Schema(name = "correlationId", example = "ABC2344BCED2234EA", description = "ID allowing correlation between service consumer and API log files. Expected to be unique, for example, a UUID", required = true)
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
  @NotNull @Valid 
  @Schema(name = "consumer", required = true)
  public Consumer getConsumer() {
    return consumer;
  }

  public void setConsumer(Consumer consumer) {
    this.consumer = consumer;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

