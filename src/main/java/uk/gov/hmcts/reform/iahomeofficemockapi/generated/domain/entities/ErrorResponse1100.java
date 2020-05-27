package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorResponse1100
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-26T15:41:16.451+01:00[Europe/London]")

public class ErrorResponse1100   {
  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("messageText")
  private String messageText;

  /**
   * Error code (non-HTTP)
   */
  public enum ErrorCodeEnum {
    _1100("1100");

    private String value;

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

  @JsonProperty("errorCode")
  private ErrorCodeEnum errorCode;

  public ErrorResponse1100 success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  */
  @ApiModelProperty(value = "")


  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ErrorResponse1100 messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * Error message text
   * @return messageText
  */
  @ApiModelProperty(example = "Invalid reference format. Format should be either nnnn-nnnn-nnnn-nnnn or 0(0) followed by digits (total length 9 or 10)", value = "Error message text")


  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public ErrorResponse1100 errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code (non-HTTP)
   * @return errorCode
  */
  @ApiModelProperty(value = "Error code (non-HTTP)")


  public ErrorCodeEnum getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse1100 errorResponse1100 = (ErrorResponse1100) o;
    return Objects.equals(this.success, errorResponse1100.success) &&
        Objects.equals(this.messageText, errorResponse1100.messageText) &&
        Objects.equals(this.errorCode, errorResponse1100.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, messageText, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse1100 {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

