package uk.gov.hmcts.reform.iahomeofficemockapi.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Type of application
 */
@ApiModel(description = "Type of application")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-14T11:29:42.760+01:00[Europe/London]")

public class SearchResponseDecisionStatusApplicationType   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("description")
  private String description;

  public SearchResponseDecisionStatusApplicationType code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Code for the application type
   * @return code
  */
  @ApiModelProperty(example = "ASYLUM", value = "Code for the application type")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public SearchResponseDecisionStatusApplicationType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the application type
   * @return description
  */
  @ApiModelProperty(example = "Asylum and Protection", value = "Description of the application type")


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
    SearchResponseDecisionStatusApplicationType searchResponseDecisionStatusApplicationType = (SearchResponseDecisionStatusApplicationType) o;
    return Objects.equals(this.code, searchResponseDecisionStatusApplicationType.code) &&
        Objects.equals(this.description, searchResponseDecisionStatusApplicationType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseDecisionStatusApplicationType {\n");
    
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

