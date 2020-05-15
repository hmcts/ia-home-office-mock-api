package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of a hearing.
 */
@ApiModel(description = "Details of a hearing.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-15T16:51:58.701+01:00[Europe/London]")

public class Hearing   {
  @JsonProperty("hmctsHearingRef")
  private String hmctsHearingRef;

  @JsonProperty("hearingLocation")
  private String hearingLocation;

  @JsonProperty("hearingDate")
  private LocalDate hearingDate;

  @JsonProperty("hearingTime")
  private String hearingTime;

  /**
   * Type of hearing
   */
  public enum HearingTypeEnum {
    PAPER("PAPER"),
    
    ORAL("ORAL");

    private String value;

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

  @JsonProperty("hearingType")
  private HearingTypeEnum hearingType;

  @JsonProperty("witnessQty")
  private Integer witnessQty;

  @JsonProperty("witnessNames")
  private String witnessNames;

  public Hearing hmctsHearingRef(String hmctsHearingRef) {
    this.hmctsHearingRef = hmctsHearingRef;
    return this;
  }

  /**
   * HMCTS reference for a hearing. (Allows for multiple hearings though usually it's just one.)
   * @return hmctsHearingRef
  */
  @ApiModelProperty(required = true, value = "HMCTS reference for a hearing. (Allows for multiple hearings though usually it's just one.)")
  @NotNull


  public String getHmctsHearingRef() {
    return hmctsHearingRef;
  }

  public void setHmctsHearingRef(String hmctsHearingRef) {
    this.hmctsHearingRef = hmctsHearingRef;
  }

  public Hearing hearingLocation(String hearingLocation) {
    this.hearingLocation = hearingLocation;
    return this;
  }

  /**
   * Venue where the hearing is to take place
   * @return hearingLocation
  */
  @ApiModelProperty(example = "Royal Courts of Justice, London", value = "Venue where the hearing is to take place")


  public String getHearingLocation() {
    return hearingLocation;
  }

  public void setHearingLocation(String hearingLocation) {
    this.hearingLocation = hearingLocation;
  }

  public Hearing hearingDate(LocalDate hearingDate) {
    this.hearingDate = hearingDate;
    return this;
  }

  /**
   * Date of the hearing, in the standard format yyyy-mm-dd
   * @return hearingDate
  */
  @ApiModelProperty(example = "Fri Jul 21 01:00:00 BST 2017", value = "Date of the hearing, in the standard format yyyy-mm-dd")

  @Valid

  public LocalDate getHearingDate() {
    return hearingDate;
  }

  public void setHearingDate(LocalDate hearingDate) {
    this.hearingDate = hearingDate;
  }

  public Hearing hearingTime(String hearingTime) {
    this.hearingTime = hearingTime;
    return this;
  }

  /**
   * Time of the hearing, in the standard format HH:mm:ss. Time is assumed to be in UTC
   * @return hearingTime
  */
  @ApiModelProperty(example = "10:30:00Z", value = "Time of the hearing, in the standard format HH:mm:ss. Time is assumed to be in UTC")


  public String getHearingTime() {
    return hearingTime;
  }

  public void setHearingTime(String hearingTime) {
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
  @ApiModelProperty(required = true, value = "Type of hearing")
  @NotNull


  public HearingTypeEnum getHearingType() {
    return hearingType;
  }

  public void setHearingType(HearingTypeEnum hearingType) {
    this.hearingType = hearingType;
  }

  public Hearing witnessQty(Integer witnessQty) {
    this.witnessQty = witnessQty;
    return this;
  }

  /**
   * Number of witnesses to be called to provide evidence at the hearing
   * @return witnessQty
  */
  @ApiModelProperty(value = "Number of witnesses to be called to provide evidence at the hearing")


  public Integer getWitnessQty() {
    return witnessQty;
  }

  public void setWitnessQty(Integer witnessQty) {
    this.witnessQty = witnessQty;
  }

  public Hearing witnessNames(String witnessNames) {
    this.witnessNames = witnessNames;
    return this;
  }

  /**
   * Names of witnesses. Recorded as notes in HMCTS, so cannot be a list of names
   * @return witnessNames
  */
  @ApiModelProperty(example = "John Smyth, Jennie Walker", value = "Names of witnesses. Recorded as notes in HMCTS, so cannot be a list of names")


  public String getWitnessNames() {
    return witnessNames;
  }

  public void setWitnessNames(String witnessNames) {
    this.witnessNames = witnessNames;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

