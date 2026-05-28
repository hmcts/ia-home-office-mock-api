package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * SearchResponseStatusInner
 */

@JsonTypeName("SearchResponse_status_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T11:19:43.880285+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class SearchResponseStatusInner {

  private @Nullable Person person;

  private @Nullable SearchResponseStatusInnerApplicationStatus applicationStatus;

  public SearchResponseStatusInner person(@Nullable Person person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
   */
  @Valid
  @Schema(name = "person", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("person")
  public @Nullable Person getPerson() {
    return person;
  }

  public void setPerson(@Nullable Person person) {
    this.person = person;
  }

  public SearchResponseStatusInner applicationStatus(@Nullable SearchResponseStatusInnerApplicationStatus applicationStatus) {
    this.applicationStatus = applicationStatus;
    return this;
  }

  /**
   * Get applicationStatus
   * @return applicationStatus
   */
  @Valid
  @Schema(name = "applicationStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("applicationStatus")
  public @Nullable SearchResponseStatusInnerApplicationStatus getApplicationStatus() {
    return applicationStatus;
  }

  public void setApplicationStatus(@Nullable SearchResponseStatusInnerApplicationStatus applicationStatus) {
    this.applicationStatus = applicationStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseStatusInner searchResponseStatusInner = (SearchResponseStatusInner) o;
    return Objects.equals(this.person, searchResponseStatusInner.person) &&
        Objects.equals(this.applicationStatus, searchResponseStatusInner.applicationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, applicationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatusInner {\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
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

