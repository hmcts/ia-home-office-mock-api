package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Person;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseApplicationStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SearchResponseStatus
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-16T15:17:31.480240Z[Europe/London]")
public class SearchResponseStatus   {

  @JsonProperty("person")
  private Person person;

  @JsonProperty("applicationStatus")
  private SearchResponseApplicationStatus applicationStatus;

  public SearchResponseStatus person(Person person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @Valid 
  @Schema(name = "person", required = false)
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public SearchResponseStatus applicationStatus(SearchResponseApplicationStatus applicationStatus) {
    this.applicationStatus = applicationStatus;
    return this;
  }

  /**
   * Get applicationStatus
   * @return applicationStatus
  */
  @Valid 
  @Schema(name = "applicationStatus", required = false)
  public SearchResponseApplicationStatus getApplicationStatus() {
    return applicationStatus;
  }

  public void setApplicationStatus(SearchResponseApplicationStatus applicationStatus) {
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
    SearchResponseStatus searchResponseStatus = (SearchResponseStatus) o;
    return Objects.equals(this.person, searchResponseStatus.person) &&
        Objects.equals(this.applicationStatus, searchResponseStatus.applicationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, applicationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatus {\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    applicationStatus: ").append(toIndentedString(applicationStatus)).append("\n");
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

