package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Communication of the decision
 */
@Schema(description = "Communication of the decision")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-30T12:19:19.760+01:00[Europe/London]")

public class SearchResponseDecisionStatusDecisionCommunication   {
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
  private OffsetDateTime sentDate;

  public SearchResponseDecisionStatusDecisionCommunication type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of communication
   * @return type
  */
  @Schema(example = "EMAIL", description = "Type of communication")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SearchResponseDecisionStatusDecisionCommunication description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the communication type
   * @return description
  */
  @Schema(example = "E-mail", description = "Description of the communication type")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SearchResponseDecisionStatusDecisionCommunication sentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
    return this;
  }

  /**
   * Date (and time, if available) the communication was sent. This is effectively the decision date. See description of decisionDate for details of how it will be displayed. This is assumed to be in UTC
   * @return sentDate
  */
  @Schema(example = "2017-07-21T17:32:28Z", description = "Date (and time, if available) the communication was sent. This is effectively the decision date. See description of decisionDate for details of how it will be displayed. This is assumed to be in UTC")

  @Valid

  public OffsetDateTime getSentDate() {
    return sentDate;
  }

  public void setSentDate(OffsetDateTime sentDate) {
    this.sentDate = sentDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseDecisionStatusDecisionCommunication searchResponseDecisionStatusDecisionCommunication = (SearchResponseDecisionStatusDecisionCommunication) o;
    return Objects.equals(this.type, searchResponseDecisionStatusDecisionCommunication.type) &&
        Objects.equals(this.description, searchResponseDecisionStatusDecisionCommunication.description) &&
        Objects.equals(this.sentDate, searchResponseDecisionStatusDecisionCommunication.sentDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, sentDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDecisionStatusDecisionCommunication {\n");

    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sentDate: ").append(toIndentedString(sentDate)).append("\n");
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

