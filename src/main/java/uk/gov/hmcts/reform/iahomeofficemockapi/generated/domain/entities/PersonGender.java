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
 * PersonGender
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-01T12:35:49.130+01:00[Europe/London]")

public class PersonGender   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public PersonGender code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Letter code for the gender
   * @return code
  */
  @ApiModelProperty(example = "M (denoting male)", value = "Letter code for the gender")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PersonGender description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Gender description
   * @return description
  */
  @ApiModelProperty(example = "Male", value = "Gender description")


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
    PersonGender personGender = (PersonGender) o;
    return Objects.equals(this.code, personGender.code) &&
        Objects.equals(this.description, personGender.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonGender {\n");
    
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

