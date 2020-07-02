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
 * ErrorResponse1200
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-30T12:19:19.760+01:00[Europe/London]")

public class ErrorResponse1200   {
  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("messageText")
  private String messageText;

  /**
   * Error code (non-HTTP)
   */
  public enum ErrorCodeEnum {
    _1200("1200");

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

  public ErrorResponse1200 success(Boolean success) {
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

  public ErrorResponse1200 messageText(String messageText) {
    this.messageText = messageText;
    return this;
  }

  /**
   * Error message text
   * @return messageText
  */
  @ApiModelProperty(example = "TBD", value = "Error message text")


  public String getMessageText() {
    return messageText;
  }

  public void setMessageText(String messageText) {
    this.messageText = messageText;
  }

  public ErrorResponse1200 errorCode(ErrorCodeEnum errorCode) {
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
    ErrorResponse1200 errorResponse1200 = (ErrorResponse1200) o;
    return Objects.equals(this.success, errorResponse1200.success) &&
        Objects.equals(this.messageText, errorResponse1200.messageText) &&
        Objects.equals(this.errorCode, errorResponse1200.errorCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, messageText, errorCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse1200 {\n");
    
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

