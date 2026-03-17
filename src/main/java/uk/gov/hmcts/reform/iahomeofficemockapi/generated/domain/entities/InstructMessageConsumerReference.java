package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.util.Objects;

/**
 * Reference and consumer name
 */
@Schema(description = "Reference and consumer name")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-30T12:19:19.760+01:00[Europe/London]")

public class InstructMessageConsumerReference   {
  @JsonProperty("consumer")
  private ConsumerRef consumer;

  public InstructMessageConsumerReference consumer(ConsumerRef consumer) {
    this.consumer = consumer;
    return this;
  }

  /**
   * Get consumer
   * @return consumer
  */
  @Schema()

  @Valid

  public ConsumerRef getConsumer() {
    return consumer;
  }

  public void setConsumer(ConsumerRef consumer) {
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
    InstructMessageConsumerReference instructMessageConsumerReference = (InstructMessageConsumerReference) o;
    return Objects.equals(this.consumer, instructMessageConsumerReference.consumer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructMessageConsumerReference {\n");

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

