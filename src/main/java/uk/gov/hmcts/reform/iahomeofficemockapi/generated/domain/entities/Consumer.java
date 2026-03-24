package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Consumer of the service.
 */

@Schema(name = "Consumer", description = "Consumer of the service.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T17:15:37.128859Z[Europe/London]", comments = "Generator version: 7.20.0")
public class Consumer {

  /**
   * Short code for the consumer
   */
  public enum CodeEnum {
    HMCTS("HMCTS");

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

  public Consumer() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Consumer(CodeEnum code) {
    this.code = code;
  }

  public Consumer code(CodeEnum code) {
    this.code = code;
    return this;
  }

  /**
   * Short code for the consumer
   * @return code
   */
  @NotNull 
  @Schema(name = "code", description = "Short code for the consumer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }

  public void setCode(CodeEnum code) {
    this.code = code;
  }

  public Consumer description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the consumer (for legibility reasons)
   * @return description
   */
  
  @Schema(name = "description", example = "HM Courts and Tribunal Service", description = "Description of the consumer (for legibility reasons)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consumer consumer = (Consumer) o;
    return Objects.equals(this.code, consumer.code) &&
        Objects.equals(this.description, consumer.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumer {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

