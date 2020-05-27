package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Person;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponseDecisionStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SearchResponseStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-26T15:41:16.451+01:00[Europe/London]")

public class SearchResponseStatus   {
  @JsonProperty("person")
  private Person person;

  @JsonProperty("decisionStatus")
  private SearchResponseDecisionStatus decisionStatus;

  public SearchResponseStatus person(Person person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  */
  @ApiModelProperty(value = "")

  @Valid

  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  public SearchResponseStatus decisionStatus(SearchResponseDecisionStatus decisionStatus) {
    this.decisionStatus = decisionStatus;
    return this;
  }

  /**
   * Get decisionStatus
   * @return decisionStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public SearchResponseDecisionStatus getDecisionStatus() {
    return decisionStatus;
  }

  public void setDecisionStatus(SearchResponseDecisionStatus decisionStatus) {
    this.decisionStatus = decisionStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseStatus searchResponseStatus = (SearchResponseStatus) o;
    return Objects.equals(this.person, searchResponseStatus.person) &&
        Objects.equals(this.decisionStatus, searchResponseStatus.decisionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(person, decisionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseStatus {\n");
    
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    decisionStatus: ").append(toIndentedString(decisionStatus)).append("\n");
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

