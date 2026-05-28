package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * Person&#39;s nationality
 */

@Schema(name = "Person_nationality", description = "Person's nationality")
@JsonTypeName("Person_nationality")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T11:19:43.880285+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class PersonNationality {

  private @Nullable String code;

  private @Nullable String description;

  public PersonNationality code(@Nullable String code) {
    this.code = code;
    return this;
  }

  /**
   * Short code for the nationality
   * @return code
   */

  @Schema(name = "code", example = "CAN (denoting Canada)", description = "Short code for the nationality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable String getCode() {
    return code;
  }

  public void setCode(@Nullable String code) {
    this.code = code;
  }

  public PersonNationality description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the nationality
   * @return description
   */

  @Schema(name = "description", example = "Canada", description = "Description of the nationality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

