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
 * SearchParametersSearchParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-01T12:35:49.130+01:00[Europe/London]")

public class SearchParametersSearchParams   {
  /**
   * Reference type
   */
  public enum SpTypeEnum {
    DOCUMENT_REFERENCE("DOCUMENT_REFERENCE");

    private String value;

    SpTypeEnum(String value) {
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
    public static SpTypeEnum fromValue(String value) {
      for (SpTypeEnum b : SpTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("spType")
  private SpTypeEnum spType;

  @JsonProperty("spValue")
  private String spValue;

  public SearchParametersSearchParams spType(SpTypeEnum spType) {
    this.spType = spType;
    return this;
  }

  /**
   * Reference type
   * @return spType
  */
  @ApiModelProperty(example = "DOCUMENT_REFERENCE", required = true, value = "Reference type")
  @NotNull


  public SpTypeEnum getSpType() {
    return spType;
  }

  public void setSpType(SpTypeEnum spType) {
    this.spType = spType;
  }

  public SearchParametersSearchParams spValue(String spValue) {
    this.spValue = spValue;
    return this;
  }

  /**
   * Unique reference
   * @return spValue
  */
  @ApiModelProperty(example = "UAN (nnnn-nnnn-nnnn-nnnn) or CID (case ID, ex. 001234567)", required = true, value = "Unique reference")
  @NotNull

@Size(max=30) 
  public String getSpValue() {
    return spValue;
  }

  public void setSpValue(String spValue) {
    this.spValue = spValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchParametersSearchParams searchParametersSearchParams = (SearchParametersSearchParams) o;
    return Objects.equals(this.spType, searchParametersSearchParams.spType) &&
        Objects.equals(this.spValue, searchParametersSearchParams.spValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spType, spValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParametersSearchParams {\n");
    
    sb.append("    spType: ").append(toIndentedString(spType)).append("\n");
    sb.append("    spValue: ").append(toIndentedString(spValue)).append("\n");
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

