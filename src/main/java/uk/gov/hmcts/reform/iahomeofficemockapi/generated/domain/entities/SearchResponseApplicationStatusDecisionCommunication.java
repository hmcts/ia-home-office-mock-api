package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Communication of the decision
 */

@Schema(name = "SearchResponse_applicationStatus_decisionCommunication", description = "Communication of the decision")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-13T15:56:59.887283Z[Europe/London]")
public class SearchResponseApplicationStatusDecisionCommunication   {

  /**
   * Type of communication
   */
  public enum TypeEnum {
    EMAIL("EMAIL"),
    
    POST("POST");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("description")
  private String description;

  @JsonProperty("sentDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime sentDate;

  @JsonProperty("dispatchDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dispatchDate;

  public SearchResponseApplicationStatusDecisionCommunication type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of communication
   * @return type
  */
  
  @Schema(name = "type", example = "EMAIL", description = "Type of communication", required = false)
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SearchResponseApplicationStatusDecisionCommunication description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the communication type
   * @return description
  */
  
  @Schema(name = "description", example = "E-mail", description = "Description of the communication type", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SearchResponseApplicationStatusDecisionCommunication sentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
    return this;
  }

  /**
   * Date (and time, if available) the communication was requested to be sent. This is effectively the decision date. See description of decisionDate for details of how it will be displayed. This is assumed to be in UTC
   * @return sentDate
  */
  @Valid 
  @Schema(name = "sentDate", example = "2017-07-21T17:32:28Z", description = "Date (and time, if available) the communication was requested to be sent. This is effectively the decision date. See description of decisionDate for details of how it will be displayed. This is assumed to be in UTC", required = false)
  public OffsetDateTime getSentDate() {
    return sentDate;
  }

  public void setSentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
  }

  public SearchResponseApplicationStatusDecisionCommunication dispatchDate(OffsetDateTime dispatchDate) {
    this.dispatchDate = dispatchDate;
    return this;
  }

  /**
   * Date (and time, if available) the communication was actually dispatched. See description of decisionDate for details of how it will be displayed. This is assumed to be in UTC
   * @return dispatchDate
  */
  @Valid 
  @Schema(name = "dispatchDate", example = "2017-07-21T17:32:28Z", description = "Date (and time, if available) the communication was actually dispatched. See description of decisionDate for details of how it will be displayed. This is assumed to be in UTC", required = false)
  public OffsetDateTime getDispatchDate() {
    return dispatchDate;
  }

  public void setDispatchDate(OffsetDateTime dispatchDate) {
    this.dispatchDate = dispatchDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseApplicationStatusDecisionCommunication searchResponseApplicationStatusDecisionCommunication = (SearchResponseApplicationStatusDecisionCommunication) o;
    return Objects.equals(this.type, searchResponseApplicationStatusDecisionCommunication.type) &&
        Objects.equals(this.description, searchResponseApplicationStatusDecisionCommunication.description) &&
        Objects.equals(this.sentDate, searchResponseApplicationStatusDecisionCommunication.sentDate) &&
        Objects.equals(this.dispatchDate, searchResponseApplicationStatusDecisionCommunication.dispatchDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, sentDate, dispatchDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatusDecisionCommunication {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
    sb.append("    dispatchDate: ").append(toIndentedString(dispatchDate)).append("\n");
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

