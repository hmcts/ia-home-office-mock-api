package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Person;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Details of a challenge (initially, all appeal related).
 */
@ApiModel(description = "Details of a challenge (initially, all appeal related).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-26T15:41:16.451+01:00[Europe/London]")

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
  @ApiModelProperty(required = true, value = "The type of appeal")
  @NotNull


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
  @ApiModelProperty(required = true, value = "The type of appeal tier")
  @NotNull


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
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", required = true, value = "Date (and time, if available) of challenge submission, in the standard format yyyy-mm-dd (with HH:mm:ss if the time is available, otherwise not). Date/time is assumed to be in UTC")
  @NotNull

  @Valid

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
  @ApiModelProperty(required = true, value = "List of applicants (will initially be just one)")
  @NotNull

  @Valid
@Size(min=1) 
  public List<Person> getApplicants() {
    return applicants;
  }

  public void setApplicants(List<Person> applicants) {
    this.applicants = applicants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

