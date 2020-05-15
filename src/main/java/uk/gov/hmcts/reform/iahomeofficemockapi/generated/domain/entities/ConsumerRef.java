package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Consumer;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Consumer reference; reference provided to Home Office, to be used in subsequent calls to update the same item.
 */
@ApiModel(description = "Consumer reference; reference provided to Home Office, to be used in subsequent calls to update the same item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-15T16:51:58.701+01:00[Europe/London]")

public class ConsumerRef   {
  @JsonProperty("consumer")
  private Consumer consumer;

  /**
   * Short code for the reference
   */
  public enum CodeEnum {
    HMCTS_CHALLENGE_REF("HMCTS_CHALLENGE_REF");

    private String value;

    CodeEnum(String value) {
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
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("code")
  private CodeEnum code;

  @JsonProperty("description")
  private String description;

  @JsonProperty("value")
  private String value;

  public ConsumerRef consumer(Consumer consumer) {
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

  public ConsumerRef code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Short code for the reference
   * @return code
  */
  @ApiModelProperty(required = true, value = "Short code for the reference")
  @NotNull


  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public ConsumerRef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(example = "HMCTS challenge reference", value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ConsumerRef value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value for the reference
   * @return value
  */
  @ApiModelProperty(example = "xxxyyyynnn-nnn", required = true, value = "Value for the reference")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsumerRef consumerRef = (ConsumerRef) o;
    return Objects.equals(this.consumer, consumerRef.consumer) &&
        Objects.equals(this.code, consumerRef.code) &&
        Objects.equals(this.description, consumerRef.description) &&
        Objects.equals(this.value, consumerRef.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumer, code, description, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsumerRef {\n");
    
    sb.append("    consumer: ").append(toIndentedString(consumer)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

