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
 * Role sub-type of the individual in this application. **Note:** may not be available for legacy CID cases
 */
@ApiModel(description = "Role sub-type of the individual in this application. **Note:** may not be available for legacy CID cases")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class SearchResponseApplicationStatusRoleSubType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SearchResponseApplicationStatusRoleSubType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the role sub-type
   * @return code
  */
  @ApiModelProperty(example = "SPOUSE. Could be MAIN if the role type is APPLICANT", value = "Code for the role sub-type")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseApplicationStatusRoleSubType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the role sub-type
   * @return description
  */
  @ApiModelProperty(example = "Spouse", value = "Description of the role sub-type")


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
    SearchResponseApplicationStatusRoleSubType searchResponseApplicationStatusRoleSubType = (SearchResponseApplicationStatusRoleSubType) o;
    return Objects.equals(this.code, searchResponseApplicationStatusRoleSubType.code) &&
        Objects.equals(this.description, searchResponseApplicationStatusRoleSubType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseApplicationStatusRoleSubType {\n");
    
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

