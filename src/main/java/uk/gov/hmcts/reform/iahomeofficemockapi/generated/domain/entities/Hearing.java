package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
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
 * Details of a hearing.
 */

@Schema(name = "Hearing", description = "Details of a hearing.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T17:15:37.128859Z[Europe/London]", comments = "Generator version: 7.20.0")
public class Hearing {

  private String hmctsHearingRef;

  private @Nullable String hearingLocation;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate hearingDate;

  private @Nullable String hearingTime;

  /**
   * Type of hearing
   */
  public enum HearingTypeEnum {
    PAPER("PAPER"),
    
    ORAL("ORAL");

    private final String value;

    HearingTypeEnum(String value) {
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
    public static HearingTypeEnum fromValue(String value) {
      for (HearingTypeEnum b : HearingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private HearingTypeEnum hearingType;

  private @Nullable Integer witnessQty;

  private @Nullable String witnessNames;

  public Hearing() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Hearing(String hmctsHearingRef, HearingTypeEnum hearingType) {
    this.hmctsHearingRef = hmctsHearingRef;
    this.hearingType = hearingType;
  }

  public Hearing hmctsHearingRef(String hmctsHearingRef) {
    this.hmctsHearingRef = hmctsHearingRef;
    return this;
  }

  /**
   * HMCTS reference for a hearing. (Allows for multiple hearings though usually it's just one.)
   * @return hmctsHearingRef
   */
  @NotNull 
  @Schema(name = "hmctsHearingRef", description = "HMCTS reference for a hearing. (Allows for multiple hearings though usually it's just one.)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hmctsHearingRef")
  public String getHmctsHearingRef() {
    return hmctsHearingRef;
  }

  public void setHmctsHearingRef(String hmctsHearingRef) {
    this.hmctsHearingRef = hmctsHearingRef;
  }

  public Hearing hearingLocation(@Nullable String hearingLocation) {
    this.hearingLocation = hearingLocation;
    return this;
  }

  /**
   * Venue where the hearing is to take place
   * @return hearingLocation
   */
  
  @Schema(name = "hearingLocation", example = "Royal Courts of Justice, London", description = "Venue where the hearing is to take place", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearingLocation")
  public @Nullable String getHearingLocation() {
    return hearingLocation;
  }

  public void setHearingLocation(@Nullable String hearingLocation) {
    this.hearingLocation = hearingLocation;
  }

  public Hearing hearingDate(@Nullable LocalDate hearingDate) {
    this.hearingDate = hearingDate;
    return this;
  }

  /**
   * Date of the hearing, in the standard format yyyy-mm-dd
   * @return hearingDate
   */
  @Valid 
  @Schema(name = "hearingDate", example = "2017-07-21", description = "Date of the hearing, in the standard format yyyy-mm-dd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearingDate")
  public @Nullable LocalDate getHearingDate() {
    return hearingDate;
  }

  public void setHearingDate(@Nullable LocalDate hearingDate) {
    this.hearingDate = hearingDate;
  }

  public Hearing hearingTime(@Nullable String hearingTime) {
    this.hearingTime = hearingTime;
    return this;
  }

  /**
   * Time of the hearing, in the standard format HH:mm:ss. Time is assumed to be in UTC
   * @return hearingTime
   */
  
  @Schema(name = "hearingTime", example = "10:30:00Z", description = "Time of the hearing, in the standard format HH:mm:ss. Time is assumed to be in UTC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearingTime")
  public @Nullable String getHearingTime() {
    return hearingTime;
  }

  public void setHearingTime(@Nullable String hearingTime) {
    this.hearingTime = hearingTime;
  }

  public Hearing hearingType(HearingTypeEnum hearingType) {
    this.hearingType = hearingType;
    return this;
  }

  /**
   * Type of hearing
   * @return hearingType
   */
  @NotNull 
  @Schema(name = "hearingType", description = "Type of hearing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hearingType")
  public HearingTypeEnum getHearingType() {
    return hearingType;
  }

  public void setHearingType(HearingTypeEnum hearingType) {
    this.hearingType = hearingType;
  }

  public Hearing witnessQty(@Nullable Integer witnessQty) {
    this.witnessQty = witnessQty;
    return this;
  }

  /**
   * Number of witnesses to be called to provide evidence at the hearing
   * @return witnessQty
   */
  
  @Schema(name = "witnessQty", description = "Number of witnesses to be called to provide evidence at the hearing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("witnessQty")
  public @Nullable Integer getWitnessQty() {
    return witnessQty;
  }

  public void setWitnessQty(@Nullable Integer witnessQty) {
    this.witnessQty = witnessQty;
  }

  public Hearing witnessNames(@Nullable String witnessNames) {
    this.witnessNames = witnessNames;
    return this;
  }

  /**
   * Names of witnesses. Recorded as notes in HMCTS, so cannot be a list of names
   * @return witnessNames
   */
  
  @Schema(name = "witnessNames", example = "John Smyth, Jennie Walker", description = "Names of witnesses. Recorded as notes in HMCTS, so cannot be a list of names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("witnessNames")
  public @Nullable String getWitnessNames() {
    return witnessNames;
  }

  public void setWitnessNames(@Nullable String witnessNames) {
    this.witnessNames = witnessNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hearing hearing = (Hearing) o;
    return Objects.equals(this.hmctsHearingRef, hearing.hmctsHearingRef) &&
        Objects.equals(this.hearingLocation, hearing.hearingLocation) &&
        Objects.equals(this.hearingDate, hearing.hearingDate) &&
        Objects.equals(this.hearingTime, hearing.hearingTime) &&
        Objects.equals(this.hearingType, hearing.hearingType) &&
        Objects.equals(this.witnessQty, hearing.witnessQty) &&
        Objects.equals(this.witnessNames, hearing.witnessNames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hmctsHearingRef, hearingLocation, hearingDate, hearingTime, hearingType, witnessQty, witnessNames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hearing {\n");
    sb.append("    hmctsHearingRef: ").append(toIndentedString(hmctsHearingRef)).append("\n");
    sb.append("    hearingLocation: ").append(toIndentedString(hearingLocation)).append("\n");
    sb.append("    hearingDate: ").append(toIndentedString(hearingDate)).append("\n");
    sb.append("    hearingTime: ").append(toIndentedString(hearingTime)).append("\n");
    sb.append("    hearingType: ").append(toIndentedString(hearingType)).append("\n");
    sb.append("    witnessQty: ").append(toIndentedString(witnessQty)).append("\n");
    sb.append("    witnessNames: ").append(toIndentedString(witnessNames)).append("\n");
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

