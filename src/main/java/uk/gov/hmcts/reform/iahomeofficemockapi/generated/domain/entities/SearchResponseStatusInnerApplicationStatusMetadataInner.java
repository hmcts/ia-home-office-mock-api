package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Metadata item, comprising an item code and one (usually) or more data values that are typed
 */

@Schema(name = "SearchResponse_status_inner_applicationStatus_metadata_inner", description = "Metadata item, comprising an item code and one (usually) or more data values that are typed")
@JsonTypeName("SearchResponse_status_inner_applicationStatus_metadata_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-25T17:21:33.201375Z[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInnerApplicationStatusMetadataInner {

  private String code;

  private @Nullable Boolean valueBoolean;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime valueDateTime;

  private @Nullable String valueString;

  public SearchResponseStatusInnerApplicationStatusMetadataInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchResponseStatusInnerApplicationStatusMetadataInner(String code) {
    this.code = code;
  }

  public SearchResponseStatusInnerApplicationStatusMetadataInner code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Metadata item code
   * @return code
   */
  @NotNull 
  @Schema(name = "code", example = "APPEALABLE or DISPATCH_DATE", description = "Metadata item code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseStatusInnerApplicationStatusMetadataInner valueBoolean(@Nullable Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
    return this;
  }

  /**
   * Boolean metadata value
   * @return valueBoolean
   */
  
  @Schema(name = "valueBoolean", example = "true", description = "Boolean metadata value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueBoolean")
  public @Nullable Boolean getValueBoolean() {
    return valueBoolean;
  }

  public void setValueBoolean(@Nullable Boolean valueBoolean) {
    this.valueBoolean = valueBoolean;
  }

  public SearchResponseStatusInnerApplicationStatusMetadataInner valueDateTime(@Nullable OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date (and time) metadata value, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). This is assumed to be in UTC
   * @return valueDateTime
   */
  @Valid 
  @Schema(name = "valueDateTime", example = "2017-07-21T17:32:28Z", description = "Date (and time) metadata value, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). This is assumed to be in UTC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueDateTime")
  public @Nullable OffsetDateTime getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(@Nullable OffsetDateTime valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public SearchResponseStatusInnerApplicationStatusMetadataInner valueString(@Nullable String valueString) {
    this.valueString = valueString;
    return this;
  }

  /**
   * String metadata value
   * @return valueString
   */
  
  @Schema(name = "valueString", example = "Some extra decision data", description = "String metadata value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueString")
  public @Nullable String getValueString() {
    return valueString;
  }

  public void setValueString(@Nullable String valueString) {
    this.valueString = valueString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseStatusInnerApplicationStatusMetadataInner searchResponseStatusInnerApplicationStatusMetadataInner = (SearchResponseStatusInnerApplicationStatusMetadataInner) o;
    return Objects.equals(this.code, searchResponseStatusInnerApplicationStatusMetadataInner.code) &&
        Objects.equals(this.valueBoolean, searchResponseStatusInnerApplicationStatusMetadataInner.valueBoolean) &&
        Objects.equals(this.valueDateTime, searchResponseStatusInnerApplicationStatusMetadataInner.valueDateTime) &&
        Objects.equals(this.valueString, searchResponseStatusInnerApplicationStatusMetadataInner.valueString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, valueBoolean, valueDateTime, valueString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInnerApplicationStatusMetadataInner {\n");
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

