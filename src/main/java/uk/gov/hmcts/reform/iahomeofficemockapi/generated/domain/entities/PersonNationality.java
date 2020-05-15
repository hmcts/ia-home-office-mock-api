package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Person&#39;s nationality
 */
@ApiModel(description = "Person's nationality")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-15T16:51:58.701+01:00[Europe/London]")

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
  @ApiModelProperty(example = "CAN (denoting Canada)", value = "Short code for the nationality")


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
  @ApiModelProperty(example = "Canada", value = "Description of the nationality")


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

