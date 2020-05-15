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
 * Role of the individual in this application
 */
@ApiModel(description = "Role of the individual in this application")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-15T16:51:58.701+01:00[Europe/London]")

public class SearchResponseDecisionStatusRoleType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SearchResponseDecisionStatusRoleType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the role type
   * @return code
  */
  @ApiModelProperty(example = "DEPENDANT", value = "Code for the role type")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseDecisionStatusRoleType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the role type
   * @return description
  */
  @ApiModelProperty(example = "Dependant", value = "Description of the role type")


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
    SearchResponseDecisionStatusRoleType searchResponseDecisionStatusRoleType = (SearchResponseDecisionStatusRoleType) o;
    return Objects.equals(this.code, searchResponseDecisionStatusRoleType.code) &&
        Objects.equals(this.description, searchResponseDecisionStatusRoleType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDecisionStatusRoleType {\n");
    
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

