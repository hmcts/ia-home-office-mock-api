package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * ErrorResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T11:19:43.880285+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class ErrorResponse {

  /**
   * Gets or Sets success
   */
  public enum SuccessEnum {
    TRUE("true"),

    FALSE("false");

    private final String value;

    SuccessEnum(String value) {
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
    public static SuccessEnum fromValue(String value) {
      for (SuccessEnum b : SuccessEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable SuccessEnum success;

  private @Nullable String messageText;

  /**
   * Error code (non-HTTP)    1010 - A UAN/Case Reference has a Service Delivery with no DECIDE_APPLICATION_OUTCOME event history   1020 - Cannot build Search Response - no service delivery details found for UAN:    1030 - A UAN/Case Reference does not refer to a valid application or reconsideration   1040 - Method argument not valid    1060 - A UAN/Case Reference is submitted in the incorrect format.   1070 - Internal system error    1080 - This Consumer is not authorised to access this endpoint   1090 - The header value is incorrect   2000 - A Downstream system is unavailable (CSDP)   2010 - A Downstream system is unavailable (AWS-SQS)
   */
  public enum ErrorCodeEnum {
    _1010("1010"),

    _1020("1020"),

    _1030("1030"),

    _1040("1040"),

    _1060("1060"),

    _1070("1070"),

    _1080("1080"),

    _1090("1090"),

    _2000("2000"),

    _2010("2010");

    private final String value;

    ErrorCodeEnum(String value) {
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
    public static ErrorCodeEnum fromValue(String value) {
      for (ErrorCodeEnum b : ErrorCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private @Nullable ErrorCodeEnum errorCode;

  public ErrorResponse success(@Nullable SuccessEnum success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   */

  @Schema(name = "success", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public @Nullable SuccessEnum getSuccess() {
    return success;
  }

  public void setSuccess(@Nullable SuccessEnum success) {
    this.success = success;
  }

  public ErrorResponse messageText(@Nullable String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * Error message text
   * @return messageText
   */

  @Schema(name = "messageText", example = "Invalid reference format. Format should be either nnnn-nnnn-nnnn-nnnn or 0(0) followed by digits (total length 9 or 10)", description = "Error message text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageText")
  public @Nullable String getMessageText() {
    return messageText;
  }

  public void setMessageText(@Nullable String messageText) {
    this.messageText = messageText;
  }

  public ErrorResponse errorCode(@Nullable ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code (non-HTTP)    1010 - A UAN/Case Reference has a Service Delivery with no DECIDE_APPLICATION_OUTCOME event history   1020 - Cannot build Search Response - no service delivery details found for UAN:    1030 - A UAN/Case Reference does not refer to a valid application or reconsideration   1040 - Method argument not valid    1060 - A UAN/Case Reference is submitted in the incorrect format.   1070 - Internal system error    1080 - This Consumer is not authorised to access this endpoint   1090 - The header value is incorrect   2000 - A Downstream system is unavailable (CSDP)   2010 - A Downstream system is unavailable (AWS-SQS)
   * @return errorCode
   */

  @Schema(name = "errorCode", example = "2000", description = "Error code (non-HTTP)    1010 - A UAN/Case Reference has a Service Delivery with no DECIDE_APPLICATION_OUTCOME event history   1020 - Cannot build Search Response - no service delivery details found for UAN:    1030 - A UAN/Case Reference does not refer to a valid application or reconsideration   1040 - Method argument not valid    1060 - A UAN/Case Reference is submitted in the incorrect format.   1070 - Internal system error    1080 - This Consumer is not authorised to access this endpoint   1090 - The header value is incorrect   2000 - A Downstream system is unavailable (CSDP)   2010 - A Downstream system is unavailable (AWS-SQS)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCode")
  public @Nullable ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(@Nullable ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.success, errorResponse.success) &&
        Objects.equals(this.messageText, errorResponse.messageText) &&
        Objects.equals(this.errorCode, errorResponse.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, messageText, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

