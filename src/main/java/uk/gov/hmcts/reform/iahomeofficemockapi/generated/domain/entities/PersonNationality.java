package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Person&#39;s nationality
 */
@Schema(description = "Person's nationality")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class PersonNationality   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public PersonNationality code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Short code for the nationality
   * @return code
  */
  @Schema(example = "CAN (denoting Canada)", description = "Short code for the nationality")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PersonNationality description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the nationality
   * @return description
  */
  @Schema(example = "Canada", description = "Description of the nationality")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonNationality personNationality = (PersonNationality) o;
    return Objects.equals(this.code, personNationality.code) &&
        Objects.equals(this.description, personNationality.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonNationality {\n");

    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

