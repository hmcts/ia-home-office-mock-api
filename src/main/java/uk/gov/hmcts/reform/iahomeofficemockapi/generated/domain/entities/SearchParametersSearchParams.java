package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * SearchParametersSearchParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

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
  @Schema(example = "DOCUMENT_REFERENCE", required = true, description = "Reference type")
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
  @Schema(example = "UAN (nnnn-nnnn-nnnn-nnnn) or CID (case ID, e.g. 001234567)", required = true, description = "Unique reference")
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

