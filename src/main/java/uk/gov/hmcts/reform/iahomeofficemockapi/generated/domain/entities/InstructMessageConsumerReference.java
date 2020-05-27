package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.ConsumerRef;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference and consumer name
 */
@ApiModel(description = "Reference and consumer name")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-26T15:41:16.451+01:00[Europe/London]")

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
  @ApiModelProperty(value = "")

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

