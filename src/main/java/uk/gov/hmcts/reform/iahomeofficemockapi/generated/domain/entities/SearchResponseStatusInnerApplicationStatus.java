package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusApplicationType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusClaimReasonType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusDecisionCommunication;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusDecisionType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusMetadataInner;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusRejectionReasonsInner;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusRoleSubType;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseStatusInnerApplicationStatusRoleType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Current status of the individual&#39;s application
 */

@Schema(name = "SearchResponse_status_inner_applicationStatus", description = "Current status of the individual's application")
@JsonTypeName("SearchResponse_status_inner_applicationStatus")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-25T13:02:20.630405Z[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInnerApplicationStatus {

  private @Nullable String documentReference;

  private @Nullable SearchResponseStatusInnerApplicationStatusRoleType roleType;

  private @Nullable SearchResponseStatusInnerApplicationStatusRoleSubType roleSubType;

  private @Nullable SearchResponseStatusInnerApplicationStatusApplicationType applicationType;

  private @Nullable SearchResponseStatusInnerApplicationStatusClaimReasonType claimReasonType;

  private @Nullable SearchResponseStatusInnerApplicationStatusDecisionType decisionType;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private @Nullable OffsetDateTime decisionDate;

  private @Nullable SearchResponseStatusInnerApplicationStatusDecisionCommunication decisionCommunication;

  @Valid
  private List<@Valid SearchResponseStatusInnerApplicationStatusRejectionReasonsInner> rejectionReasons = new ArrayList<>();

  @Valid
  private List<@Valid SearchResponseStatusInnerApplicationStatusMetadataInner> metadata = new ArrayList<>();

  public SearchResponseStatusInnerApplicationStatus documentReference(@Nullable String documentReference) {
    this.documentReference = documentReference;
    return this;
  }

  /**
   * The UAN or Case ID (CID) passed to the Home Office in the original request. (Allows for the UAN/nn value - nn denoting an individual within a group UAN - to be returned to HMCTS, should this value be available.)
   * @return documentReference
   */
  
  @Schema(name = "documentReference", example = "1234-1234-5678-5678/00", description = "The UAN or Case ID (CID) passed to the Home Office in the original request. (Allows for the UAN/nn value - nn denoting an individual within a group UAN - to be returned to HMCTS, should this value be available.)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentReference")
  public @Nullable String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(@Nullable String documentReference) {
    this.documentReference = documentReference;
  }

  public SearchResponseStatusInnerApplicationStatus roleType(@Nullable SearchResponseStatusInnerApplicationStatusRoleType roleType) {
    this.roleType = roleType;
    return this;
  }

  /**
   * Get roleType
   * @return roleType
   */
  @Valid 
  @Schema(name = "roleType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleType")
  public @Nullable SearchResponseStatusInnerApplicationStatusRoleType getRoleType() {
    return roleType;
  }

  public void setRoleType(@Nullable SearchResponseStatusInnerApplicationStatusRoleType roleType) {
    this.roleType = roleType;
  }

  public SearchResponseStatusInnerApplicationStatus roleSubType(@Nullable SearchResponseStatusInnerApplicationStatusRoleSubType roleSubType) {
    this.roleSubType = roleSubType;
    return this;
  }

  /**
   * Get roleSubType
   * @return roleSubType
   */
  @Valid 
  @Schema(name = "roleSubType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleSubType")
  public @Nullable SearchResponseStatusInnerApplicationStatusRoleSubType getRoleSubType() {
    return roleSubType;
  }

  public void setRoleSubType(@Nullable SearchResponseStatusInnerApplicationStatusRoleSubType roleSubType) {
    this.roleSubType = roleSubType;
  }

  public SearchResponseStatusInnerApplicationStatus applicationType(@Nullable SearchResponseStatusInnerApplicationStatusApplicationType applicationType) {
    this.applicationType = applicationType;
    return this;
  }

  /**
   * Get applicationType
   * @return applicationType
   */
  @Valid 
  @Schema(name = "applicationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationType")
  public @Nullable SearchResponseStatusInnerApplicationStatusApplicationType getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(@Nullable SearchResponseStatusInnerApplicationStatusApplicationType applicationType) {
    this.applicationType = applicationType;
  }

  public SearchResponseStatusInnerApplicationStatus claimReasonType(@Nullable SearchResponseStatusInnerApplicationStatusClaimReasonType claimReasonType) {
    this.claimReasonType = claimReasonType;
    return this;
  }

  /**
   * Get claimReasonType
   * @return claimReasonType
   */
  @Valid 
  @Schema(name = "claimReasonType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("claimReasonType")
  public @Nullable SearchResponseStatusInnerApplicationStatusClaimReasonType getClaimReasonType() {
    return claimReasonType;
  }

  public void setClaimReasonType(@Nullable SearchResponseStatusInnerApplicationStatusClaimReasonType claimReasonType) {
    this.claimReasonType = claimReasonType;
  }

  public SearchResponseStatusInnerApplicationStatus decisionType(@Nullable SearchResponseStatusInnerApplicationStatusDecisionType decisionType) {
    this.decisionType = decisionType;
    return this;
  }

  /**
   * Get decisionType
   * @return decisionType
   */
  @Valid 
  @Schema(name = "decisionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionType")
  public @Nullable SearchResponseStatusInnerApplicationStatusDecisionType getDecisionType() {
    return decisionType;
  }

  public void setDecisionType(@Nullable SearchResponseStatusInnerApplicationStatusDecisionType decisionType) {
    this.decisionType = decisionType;
  }

  public SearchResponseStatusInnerApplicationStatus decisionDate(@Nullable OffsetDateTime decisionDate) {
    this.decisionDate = decisionDate;
    return this;
  }

  /**
   * Date (and time, if available) of decision made on the application, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). All dates/times are assumed to be in UTC
   * @return decisionDate
   */
  @Valid 
  @Schema(name = "decisionDate", example = "2017-07-21T17:32:28Z", description = "Date (and time, if available) of decision made on the application, in the standard format yyyy-mm-dd (with the HH:mm:ss if the time is available - this won't be displayed if it isn't). All dates/times are assumed to be in UTC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionDate")
  public @Nullable OffsetDateTime getDecisionDate() {
    return decisionDate;
  }

  public void setDecisionDate(@Nullable OffsetDateTime decisionDate) {
    this.decisionDate = decisionDate;
  }

  public SearchResponseStatusInnerApplicationStatus decisionCommunication(@Nullable SearchResponseStatusInnerApplicationStatusDecisionCommunication decisionCommunication) {
    this.decisionCommunication = decisionCommunication;
    return this;
  }

  /**
   * Get decisionCommunication
   * @return decisionCommunication
   */
  @Valid 
  @Schema(name = "decisionCommunication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decisionCommunication")
  public @Nullable SearchResponseStatusInnerApplicationStatusDecisionCommunication getDecisionCommunication() {
    return decisionCommunication;
  }

  public void setDecisionCommunication(@Nullable SearchResponseStatusInnerApplicationStatusDecisionCommunication decisionCommunication) {
    this.decisionCommunication = decisionCommunication;
  }

  public SearchResponseStatusInnerApplicationStatus rejectionReasons(List<@Valid SearchResponseStatusInnerApplicationStatusRejectionReasonsInner> rejectionReasons) {
    this.rejectionReasons = rejectionReasons;
    return this;
  }

  public SearchResponseStatusInnerApplicationStatus addRejectionReasonsItem(SearchResponseStatusInnerApplicationStatusRejectionReasonsInner rejectionReasonsItem) {
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
  @Valid 
  @Schema(name = "rejectionReasons", description = "Rejection reasons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rejectionReasons")
  public List<@Valid SearchResponseStatusInnerApplicationStatusRejectionReasonsInner> getRejectionReasons() {
    return rejectionReasons;
  }

  public void setRejectionReasons(List<@Valid SearchResponseStatusInnerApplicationStatusRejectionReasonsInner> rejectionReasons) {
    this.rejectionReasons = rejectionReasons;
  }

  public SearchResponseStatusInnerApplicationStatus metadata(List<@Valid SearchResponseStatusInnerApplicationStatusMetadataInner> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SearchResponseStatusInnerApplicationStatus addMetadataItem(SearchResponseStatusInnerApplicationStatusMetadataInner metadataItem) {
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
  @Valid 
  @Schema(name = "metadata", description = "Additional attributes (metadata) of the application ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metadata")
  public List<@Valid SearchResponseStatusInnerApplicationStatusMetadataInner> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<@Valid SearchResponseStatusInnerApplicationStatusMetadataInner> metadata) {
    this.metadata = metadata;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseStatusInnerApplicationStatus searchResponseStatusInnerApplicationStatus = (SearchResponseStatusInnerApplicationStatus) o;
    return Objects.equals(this.documentReference, searchResponseStatusInnerApplicationStatus.documentReference) &&
        Objects.equals(this.roleType, searchResponseStatusInnerApplicationStatus.roleType) &&
        Objects.equals(this.roleSubType, searchResponseStatusInnerApplicationStatus.roleSubType) &&
        Objects.equals(this.applicationType, searchResponseStatusInnerApplicationStatus.applicationType) &&
        Objects.equals(this.claimReasonType, searchResponseStatusInnerApplicationStatus.claimReasonType) &&
        Objects.equals(this.decisionType, searchResponseStatusInnerApplicationStatus.decisionType) &&
        Objects.equals(this.decisionDate, searchResponseStatusInnerApplicationStatus.decisionDate) &&
        Objects.equals(this.decisionCommunication, searchResponseStatusInnerApplicationStatus.decisionCommunication) &&
        Objects.equals(this.rejectionReasons, searchResponseStatusInnerApplicationStatus.rejectionReasons) &&
        Objects.equals(this.metadata, searchResponseStatusInnerApplicationStatus.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentReference, roleType, roleSubType, applicationType, claimReasonType, decisionType, decisionDate, decisionCommunication, rejectionReasons, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInnerApplicationStatus {\n");
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

