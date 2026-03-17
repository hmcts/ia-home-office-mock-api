package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Metadata item, comprising an item code and one (usually) or more data values that are typed
 */
@Schema(description = "Metadata item, comprising an item code and one (usually) or more data values that are typed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class SearchResponseApplicationStatusMetadata   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("valueBoolean")
  private Boolean valueBoolean;

  @JsonProperty("valueDateTime")
  private OffsetDateTime valueDateTime;

  @JsonProperty("valueString")
  private String valueString;

  public SearchResponseApplicationStatusMetadata code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Metadata item code
   * @return code
  */
  @Schema(example = "APPEALABLE or DISPATCH_DATE", required = true, description = "Metadata item code")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseApplicationStatusMetadata valueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
    return this;
  }

  /**
   * Boolean metadata value
   * @return valueBoolean
  */
  @Schema(example = "true", description = "Boolean metadata value")


  public Boolean getValueBoolean() {
    return valueBoolean;
  }

  public void setValueBoolean(Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public SearchResponseApplicationStatusMetadata valueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date (and time) metadata value, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). This is assumed to be in UTC
   * @return valueDateTime
  */
  @Schema(example = "2017-07-21T17:32:28Z", description = "Date (and time) metadata value, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). This is assumed to be in UTC")

  @Valid

  public OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public SearchResponseApplicationStatusMetadata valueString(String valueString) {
    this.valueString = valueString;
    return this;
  }

  /**
   * String metadata value
   * @return valueString
  */
  @Schema(example = "Some extra decision data", description = "String metadata value")


  public String getValueString() {
    return valueString;
  }

  public void setValueString(String valueString) {
    this.valueString = valueString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseApplicationStatusMetadata searchResponseApplicationStatusMetadata = (SearchResponseApplicationStatusMetadata) o;
    return Objects.equals(this.code, searchResponseApplicationStatusMetadata.code) &&
        Objects.equals(this.valueBoolean, searchResponseApplicationStatusMetadata.valueBoolean) &&
        Objects.equals(this.valueDateTime, searchResponseApplicationStatusMetadata.valueDateTime) &&
        Objects.equals(this.valueString, searchResponseApplicationStatusMetadata.valueString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, valueBoolean, valueDateTime, valueString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatusMetadata {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    valueBoolean: ").append(toIndentedString(valueBoolean)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    valueString: ").append(toIndentedString(valueString)).append("\n");
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

