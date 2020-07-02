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
 * ErrorResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class ErrorResponse   {
  @JsonProperty("success")
  private Boolean success;

  @JsonProperty("messageText")
  private String messageText;

  /**
   * Error code (non-HTTP)    1010 - No event history details    1020 - No service delivery details    1030 - No valid service delivery details    1040 - Method argument not valid    1060 - Message format invalid    1070 - Internal system error    2000 - Call to CSDP unavailable    2010 - Call to AWS SQS unavailable
   */
  public enum ErrorCodeEnum {
    _1010("1010"),
    
    _1020("1020"),
    
    _1030("1030"),
    
    _1040("1040"),
    
    _1060("1060"),
    
    _1070("1070"),
    
    _2000("2000"),
    
    _2010("2010");

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

  public ErrorResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  */
  @ApiModelProperty(example = "false", value = "")


  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public ErrorResponse messageText(String messageText) {
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

  public ErrorResponse errorCode(ErrorCodeEnum errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Error code (non-HTTP)    1010 - No event history details    1020 - No service delivery details    1030 - No valid service delivery details    1040 - Method argument not valid    1060 - Message format invalid    1070 - Internal system error    2000 - Call to CSDP unavailable    2010 - Call to AWS SQS unavailable
   * @return errorCode
  */
  @ApiModelProperty(value = "Error code (non-HTTP)    1010 - No event history details    1020 - No service delivery details    1030 - No valid service delivery details    1040 - Method argument not valid    1060 - Message format invalid    1070 - Internal system error    2000 - Call to CSDP unavailable    2010 - Call to AWS SQS unavailable")


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

