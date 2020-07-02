package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusApplicationType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusClaimReasonType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusDecisionCommunication;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusDecisionType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusMetadata;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusRejectionReasons;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusRoleSubType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatusRoleType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Current status of the individual&#39;s application
 */
@ApiModel(description = "Current status of the individual's application")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class SearchResponseApplicationStatus   {
  @JsonProperty("documentReference")
  private String documentReference;

  @JsonProperty("roleType")
  private SearchResponseApplicationStatusRoleType roleType;

  @JsonProperty("roleSubType")
  private SearchResponseApplicationStatusRoleSubType roleSubType;

  @JsonProperty("applicationType")
  private SearchResponseApplicationStatusApplicationType applicationType;

  @JsonProperty("claimReasonType")
  private SearchResponseApplicationStatusClaimReasonType claimReasonType;

  @JsonProperty("decisionType")
  private SearchResponseApplicationStatusDecisionType decisionType;

  @JsonProperty("decisionDate")
  private OffsetDateTime decisionDate;

  @JsonProperty("decisionCommunication")
  private SearchResponseApplicationStatusDecisionCommunication decisionCommunication;

  @JsonProperty("rejectionReasons")
  @Valid
  private List<SearchResponseApplicationStatusRejectionReasons> rejectionReasons = null;

  @JsonProperty("metadata")
  @Valid
  private List<SearchResponseApplicationStatusMetadata> metadata = null;

  public SearchResponseApplicationStatus documentReference(String documentReference) {
    this.documentReference = documentReference;
    return this;
  }

  /**
   * The UAN or Case ID (CID) passed to the Home Office in the original request. (Allows for the UAN/nn value - nn denoting an individual within a group UAN - to be returned to HMCTS, should this value be available.)
   * @return documentReference
  */
  @ApiModelProperty(example = "1234-1234-5678-5678/00", value = "The UAN or Case ID (CID) passed to the Home Office in the original request. (Allows for the UAN/nn value - nn denoting an individual within a group UAN - to be returned to HMCTS, should this value be available.)")


  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }

  public SearchResponseApplicationStatus roleType(SearchResponseApplicationStatusRoleType roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * Get roleType
   * @return roleType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseApplicationStatusRoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(SearchResponseApplicationStatusRoleType roleType) {
    this.roleType = roleType;
  }

  public SearchResponseApplicationStatus roleSubType(SearchResponseApplicationStatusRoleSubType roleSubType) {
    this.roleSubType = roleSubType;
    return this;
  }

  /**
   * Get roleSubType
   * @return roleSubType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseApplicationStatusRoleSubType getRoleSubType() {
    return roleSubType;
  }

  public void setRoleSubType(SearchResponseApplicationStatusRoleSubType roleSubType) {
    this.roleSubType = roleSubType;
  }

  public SearchResponseApplicationStatus applicationType(SearchResponseApplicationStatusApplicationType applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * Get applicationType
   * @return applicationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseApplicationStatusApplicationType getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(SearchResponseApplicationStatusApplicationType applicationType) {
    this.applicationType = applicationType;
  }

  public SearchResponseApplicationStatus claimReasonType(SearchResponseApplicationStatusClaimReasonType claimReasonType) {
    this.claimReasonType = claimReasonType;
    return this;
  }

  /**
   * Get claimReasonType
   * @return claimReasonType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseApplicationStatusClaimReasonType getClaimReasonType() {
    return claimReasonType;
  }

  public void setClaimReasonType(SearchResponseApplicationStatusClaimReasonType claimReasonType) {
    this.claimReasonType = claimReasonType;
  }

  public SearchResponseApplicationStatus decisionType(SearchResponseApplicationStatusDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

  /**
   * Get decisionType
   * @return decisionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseApplicationStatusDecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(SearchResponseApplicationStatusDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  public SearchResponseApplicationStatus decisionDate(OffsetDateTime decisionDate) {
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

  public SearchResponseApplicationStatus decisionCommunication(SearchResponseApplicationStatusDecisionCommunication decisionCommunication) {
    this.decisionCommunication = decisionCommunication;
    return this;
  }

  /**
   * Get decisionCommunication
   * @return decisionCommunication
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseApplicationStatusDecisionCommunication getDecisionCommunication() {
    return decisionCommunication;
  }

  public void setDecisionCommunication(SearchResponseApplicationStatusDecisionCommunication decisionCommunication) {
    this.decisionCommunication = decisionCommunication;
  }

  public SearchResponseApplicationStatus rejectionReasons(List<SearchResponseApplicationStatusRejectionReasons> rejectionReasons) {
    this.rejectionReasons = rejectionReasons;
    return this;
  }

  public SearchResponseApplicationStatus addRejectionReasonsItem(SearchResponseApplicationStatusRejectionReasons rejectionReasonsItem) {
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

  public List<SearchResponseApplicationStatusRejectionReasons> getRejectionReasons() {
    return rejectionReasons;
  }

  public void setRejectionReasons(List<SearchResponseApplicationStatusRejectionReasons> rejectionReasons) {
    this.rejectionReasons = rejectionReasons;
  }

  public SearchResponseApplicationStatus metadata(List<SearchResponseApplicationStatusMetadata> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SearchResponseApplicationStatus addMetadataItem(SearchResponseApplicationStatusMetadata metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

  /**
   * Additional attributes (metadata) of the application 
   * @return metadata
  */
  @ApiModelProperty(value = "Additional attributes (metadata) of the application ")

  @Valid

  public List<SearchResponseApplicationStatusMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<SearchResponseApplicationStatusMetadata> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseApplicationStatus searchResponseApplicationStatus = (SearchResponseApplicationStatus) o;
    return Objects.equals(this.documentReference, searchResponseApplicationStatus.documentReference) &&
        Objects.equals(this.roleType, searchResponseApplicationStatus.roleType) &&
        Objects.equals(this.roleSubType, searchResponseApplicationStatus.roleSubType) &&
        Objects.equals(this.applicationType, searchResponseApplicationStatus.applicationType) &&
        Objects.equals(this.claimReasonType, searchResponseApplicationStatus.claimReasonType) &&
        Objects.equals(this.decisionType, searchResponseApplicationStatus.decisionType) &&
        Objects.equals(this.decisionDate, searchResponseApplicationStatus.decisionDate) &&
        Objects.equals(this.decisionCommunication, searchResponseApplicationStatus.decisionCommunication) &&
        Objects.equals(this.rejectionReasons, searchResponseApplicationStatus.rejectionReasons) &&
        Objects.equals(this.metadata, searchResponseApplicationStatus.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentReference, roleType, roleSubType, applicationType, claimReasonType, decisionType, decisionDate, decisionCommunication, rejectionReasons, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatus {\n");
    
    sb.append("    documentReference: ").append(toIndentedString(documentReference)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
    sb.append("    roleSubType: ").append(toIndentedString(roleSubType)).append("\n");
    sb.append("    applicationType: ").append(toIndentedString(applicationType)).append("\n");
    sb.append("    claimReasonType: ").append(toIndentedString(claimReasonType)).append("\n");
    sb.append("    decisionType: ").append(toIndentedString(decisionType)).append("\n");
    sb.append("    decisionDate: ").append(toIndentedString(decisionDate)).append("\n");
    sb.append("    decisionCommunication: ").append(toIndentedString(decisionCommunication)).append("\n");
    sb.append("    rejectionReasons: ").append(toIndentedString(rejectionReasons)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

