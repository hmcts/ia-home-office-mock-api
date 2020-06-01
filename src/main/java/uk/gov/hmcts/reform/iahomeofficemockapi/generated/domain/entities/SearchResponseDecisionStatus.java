package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatusApplicationType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatusClaimReasonType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatusDecisionCommunication;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatusDecisionType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatusRejectionReasons;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatusRoleSubType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatusRoleType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Current status of the individual&#39;s application
 */
@ApiModel(description = "Current status of the individual's application")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-01T12:35:49.130+01:00[Europe/London]")

public class SearchResponseDecisionStatus   {
  @JsonProperty("roleType")
  private SearchResponseDecisionStatusRoleType roleType;

  @JsonProperty("roleSubType")
  private SearchResponseDecisionStatusRoleSubType roleSubType;

  @JsonProperty("applicationType")
  private SearchResponseDecisionStatusApplicationType applicationType;

  @JsonProperty("claimReasonType")
  private SearchResponseDecisionStatusClaimReasonType claimReasonType;

  @JsonProperty("decisionType")
  private SearchResponseDecisionStatusDecisionType decisionType;

  @JsonProperty("decisionDate")
  private OffsetDateTime decisionDate;

  @JsonProperty("decisionCommunication")
  private SearchResponseDecisionStatusDecisionCommunication decisionCommunication;

  @JsonProperty("rejectionReasons")
  @Valid
  private List<SearchResponseDecisionStatusRejectionReasons> rejectionReasons = null;

  @JsonProperty("appealable")
  private Boolean appealable;

  public SearchResponseDecisionStatus roleType(SearchResponseDecisionStatusRoleType roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * Get roleType
   * @return roleType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseDecisionStatusRoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(SearchResponseDecisionStatusRoleType roleType) {
    this.roleType = roleType;
  }

  public SearchResponseDecisionStatus roleSubType(SearchResponseDecisionStatusRoleSubType roleSubType) {
    this.roleSubType = roleSubType;
    return this;
  }

  /**
   * Get roleSubType
   * @return roleSubType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseDecisionStatusRoleSubType getRoleSubType() {
    return roleSubType;
  }

  public void setRoleSubType(SearchResponseDecisionStatusRoleSubType roleSubType) {
    this.roleSubType = roleSubType;
  }

  public SearchResponseDecisionStatus applicationType(SearchResponseDecisionStatusApplicationType applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * Get applicationType
   * @return applicationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseDecisionStatusApplicationType getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(SearchResponseDecisionStatusApplicationType applicationType) {
    this.applicationType = applicationType;
  }

  public SearchResponseDecisionStatus claimReasonType(SearchResponseDecisionStatusClaimReasonType claimReasonType) {
    this.claimReasonType = claimReasonType;
    return this;
  }

  /**
   * Get claimReasonType
   * @return claimReasonType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseDecisionStatusClaimReasonType getClaimReasonType() {
    return claimReasonType;
  }

  public void setClaimReasonType(SearchResponseDecisionStatusClaimReasonType claimReasonType) {
    this.claimReasonType = claimReasonType;
  }

  public SearchResponseDecisionStatus decisionType(SearchResponseDecisionStatusDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

  /**
   * Get decisionType
   * @return decisionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseDecisionStatusDecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(SearchResponseDecisionStatusDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  public SearchResponseDecisionStatus decisionDate(OffsetDateTime decisionDate) {
    this.decisionDate = decisionDate;
    return this;
  }

  /**
   * Date (and time, if available) of decision made on the application, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). All dates/times are assumed to be in UTC
   * @return decisionDate
  */
  @ApiModelProperty(example = "2017-07-21T17:32:28Z", value = "Date (and time, if available) of decision made on the application, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). All dates/times are assumed to be in UTC")

  @Valid

  public OffsetDateTime getDecisionDate() {
    return decisionDate;
  }

  public void setDecisionDate(OffsetDateTime decisionDate) {
    this.decisionDate = decisionDate;
  }

  public SearchResponseDecisionStatus decisionCommunication(SearchResponseDecisionStatusDecisionCommunication decisionCommunication) {
    this.decisionCommunication = decisionCommunication;
    return this;
  }

  /**
   * Get decisionCommunication
   * @return decisionCommunication
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseDecisionStatusDecisionCommunication getDecisionCommunication() {
    return decisionCommunication;
  }

  public void setDecisionCommunication(SearchResponseDecisionStatusDecisionCommunication decisionCommunication) {
    this.decisionCommunication = decisionCommunication;
  }

  public SearchResponseDecisionStatus rejectionReasons(List<SearchResponseDecisionStatusRejectionReasons> rejectionReasons) {
    this.rejectionReasons = rejectionReasons;
    return this;
  }

  public SearchResponseDecisionStatus addRejectionReasonsItem(SearchResponseDecisionStatusRejectionReasons rejectionReasonsItem) {
    if (this.rejectionReasons == null) {
      this.rejectionReasons = new ArrayList<>();
    }
    this.rejectionReasons.add(rejectionReasonsItem);
    return this;
  }

  /**
   * Rejection reasons
   * @return rejectionReasons
  */
  @ApiModelProperty(value = "Rejection reasons")

  @Valid

  public List<SearchResponseDecisionStatusRejectionReasons> getRejectionReasons() {
    return rejectionReasons;
  }

  public void setRejectionReasons(List<SearchResponseDecisionStatusRejectionReasons> rejectionReasons) {
    this.rejectionReasons = rejectionReasons;
  }

  public SearchResponseDecisionStatus appealable(Boolean appealable) {
    this.appealable = appealable;
    return this;
  }

  /**
   * Indicates whether the decision can be appealed or not
   * @return appealable
  */
  @ApiModelProperty(example = "true", value = "Indicates whether the decision can be appealed or not")


  public Boolean getAppealable() {
    return appealable;
  }

  public void setAppealable(Boolean appealable) {
    this.appealable = appealable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseDecisionStatus searchResponseDecisionStatus = (SearchResponseDecisionStatus) o;
    return Objects.equals(this.roleType, searchResponseDecisionStatus.roleType) &&
        Objects.equals(this.roleSubType, searchResponseDecisionStatus.roleSubType) &&
        Objects.equals(this.applicationType, searchResponseDecisionStatus.applicationType) &&
        Objects.equals(this.claimReasonType, searchResponseDecisionStatus.claimReasonType) &&
        Objects.equals(this.decisionType, searchResponseDecisionStatus.decisionType) &&
        Objects.equals(this.decisionDate, searchResponseDecisionStatus.decisionDate) &&
        Objects.equals(this.decisionCommunication, searchResponseDecisionStatus.decisionCommunication) &&
        Objects.equals(this.rejectionReasons, searchResponseDecisionStatus.rejectionReasons) &&
        Objects.equals(this.appealable, searchResponseDecisionStatus.appealable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleType, roleSubType, applicationType, claimReasonType, decisionType, decisionDate, decisionCommunication, rejectionReasons, appealable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDecisionStatus {\n");
    
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    roleSubType: ").append(toIndentedString(roleSubType)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    claimReasonType: ").append(toIndentedString(claimReasonType)).append("\n");
    sb.append("    decisionType: ").append(toIndentedString(decisionType)).append("\n");
    sb.append("    decisionDate: ").append(toIndentedString(decisionDate)).append("\n");
    sb.append("    decisionCommunication: ").append(toIndentedString(decisionCommunication)).append("\n");
    sb.append("    rejectionReasons: ").append(toIndentedString(rejectionReasons)).append("\n");
    sb.append("    appealable: ").append(toIndentedString(appealable)).append("\n");
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

