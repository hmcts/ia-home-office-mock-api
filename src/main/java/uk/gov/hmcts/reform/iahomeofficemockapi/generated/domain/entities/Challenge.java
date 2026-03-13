package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Person;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a challenge (initially, all appeal related).
 */

@Schema(name = "Challenge", description = "Details of a challenge (initially, all appeal related).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-13T15:56:59.887283Z[Europe/London]")
public class Challenge   {

  /**
   * The type of appeal
   */
  public enum AppealTypeEnum {
    PROTECTION("PROTECTION"),
    
    REVOCATION_OF_PROTECTION("REVOCATION_OF_PROTECTION"),
    
    DEPRIVATION_OF_CITIZENSHIP("DEPRIVATION_OF_CITIZENSHIP"),
    
    HUMAN_RIGHTS("HUMAN_RIGHTS"),
    
    EEA("EEA");

    private String value;

    AppealTypeEnum(String value) {
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
    public static AppealTypeEnum fromValue(String value) {
      for (AppealTypeEnum b : AppealTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("appealType")
  private AppealTypeEnum appealType;

  /**
   * The type of appeal tier
   */
  public enum AppealTierTypeEnum {
    FIRST_TIER("FIRST_TIER");

    private String value;

    AppealTierTypeEnum(String value) {
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
    public static AppealTierTypeEnum fromValue(String value) {
      for (AppealTierTypeEnum b : AppealTierTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("appealTierType")
  private AppealTierTypeEnum appealTierType;

  @JsonProperty("challengeSubmissionDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime challengeSubmissionDate;

  @JsonProperty("applicants")
  @Valid
  private List<Person> applicants = new ArrayList<>();

  public Challenge appealType(AppealTypeEnum appealType) {
    this.appealType = appealType;
    return this;
  }

  /**
   * The type of appeal
   * @return appealType
  */
  @NotNull 
  @Schema(name = "appealType", description = "The type of appeal", required = true)
  public AppealTypeEnum getAppealType() {
    return appealType;
  }

  public void setAppealType(AppealTypeEnum appealType) {
    this.appealType = appealType;
  }

  public Challenge appealTierType(AppealTierTypeEnum appealTierType) {
    this.appealTierType = appealTierType;
    return this;
  }

  /**
   * The type of appeal tier
   * @return appealTierType
  */
  @NotNull 
  @Schema(name = "appealTierType", description = "The type of appeal tier", required = true)
  public AppealTierTypeEnum getAppealTierType() {
    return appealTierType;
  }

  public void setAppealTierType(AppealTierTypeEnum appealTierType) {
    this.appealTierType = appealTierType;
  }

  public Challenge challengeSubmissionDate(OffsetDateTime challengeSubmissionDate) {
    this.challengeSubmissionDate = challengeSubmissionDate;
    return this;
  }

  /**
   * Date (and time, if available) of challenge submission, in the standard format yyyy-mm-dd (with HH:mm:ss if the time is available, otherwise not). Date/time is assumed to be in UTC
   * @return challengeSubmissionDate
  */
  @NotNull @Valid 
  @Schema(name = "challengeSubmissionDate", example = "2017-07-21T17:32:28Z", description = "Date (and time, if available) of challenge submission, in the standard format yyyy-mm-dd (with HH:mm:ss if the time is available, otherwise not). Date/time is assumed to be in UTC", required = true)
  public OffsetDateTime getChallengeSubmissionDate() {
    return challengeSubmissionDate;
  }

  public void setChallengeSubmissionDate(OffsetDateTime challengeSubmissionDate) {
    this.challengeSubmissionDate = challengeSubmissionDate;
  }

  public Challenge applicants(List<Person> applicants) {
    this.applicants = applicants;
    return this;
  }

  public Challenge addApplicantsItem(Person applicantsItem) {
    this.applicants.add(applicantsItem);
    return this;
  }

  /**
   * List of applicants (will initially be just one)
   * @return applicants
  */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "applicants", description = "List of applicants (will initially be just one)", required = true)
  public List<Person> getApplicants() {
    return applicants;
  }

  public void setApplicants(List<Person> applicants) {
    this.applicants = applicants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Challenge challenge = (Challenge) o;
    return Objects.equals(this.appealType, challenge.appealType) &&
        Objects.equals(this.appealTierType, challenge.appealTierType) &&
        Objects.equals(this.challengeSubmissionDate, challenge.challengeSubmissionDate) &&
        Objects.equals(this.applicants, challenge.applicants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appealType, appealTierType, challengeSubmissionDate, applicants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Challenge {\n");
    sb.append("    appealType: ").append(toIndentedString(appealType)).append("\n");
    sb.append("    appealTierType: ").append(toIndentedString(appealTierType)).append("\n");
    sb.append("    challengeSubmissionDate: ").append(toIndentedString(challengeSubmissionDate)).append("\n");
    sb.append("    applicants: ").append(toIndentedString(applicants)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

