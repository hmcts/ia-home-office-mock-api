package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Consumer;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Consumer reference; reference provided to Home Office, to be used in subsequent calls to update the same item.
 */

@Schema(name = "ConsumerRef", description = "Consumer reference; reference provided to Home Office, to be used in subsequent calls to update the same item.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T17:15:37.128859Z[Europe/London]", comments = "Generator version: 7.20.0")
public class ConsumerRef {

  private Consumer consumer;

  /**
   * Short code for the reference
   */
  public enum CodeEnum {
    HMCTS_CHALLENGE_REF("HMCTS_CHALLENGE_REF");

    private final String value;

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

  private CodeEnum code;

  private @Nullable String description;

  private String value;

  public ConsumerRef() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConsumerRef(Consumer consumer, CodeEnum code, String value) {
    this.consumer = consumer;
    this.code = code;
    this.value = value;
  }

  public ConsumerRef consumer(Consumer consumer) {
    this.consumer = consumer;
    return this;
  }

  /**
   * Get consumer
   * @return consumer
   */
  @NotNull @Valid 
  @Schema(name = "consumer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consumer")
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
  @NotNull 
  @Schema(name = "code", description = "Short code for the reference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public ConsumerRef description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", example = "HMCTS challenge reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
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
  @NotNull 
  @Schema(name = "value", example = "xxxyyyynnn-nnn", description = "Value for the reference", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

