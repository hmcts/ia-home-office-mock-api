package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Appellant;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the application, including appellants&#39; biographic information.
 */

@Schema(name = "Application", description = "Details of the application, including appellants' biographic information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T17:15:37.128859Z[Europe/London]", comments = "Generator version: 7.20.0")
public class Application {

  private @Nullable String uan;

  private String hoClaimDate;

  private String hoDecisionDate;

  private String hoDecisionLetterDate;

  @Valid
  private List<@Valid Appellant> appellants = new ArrayList<>();

  public Application() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Application(String hoClaimDate, String hoDecisionDate, String hoDecisionLetterDate, List<@Valid Appellant> appellants) {
    this.hoClaimDate = hoClaimDate;
    this.hoDecisionDate = hoDecisionDate;
    this.hoDecisionLetterDate = hoDecisionLetterDate;
    this.appellants = appellants;
  }

  public Application uan(@Nullable String uan) {
    this.uan = uan;
    return this;
  }

  /**
   * Get uan
   * @return uan
   */
  @Pattern(regexp = "^[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}$") 
  @Schema(name = "uan", example = "1342-5786-9120-3564", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uan")
  public @Nullable String getUan() {
    return uan;
  }

  public void setUan(@Nullable String uan) {
    this.uan = uan;
  }

  public Application hoClaimDate(String hoClaimDate) {
    this.hoClaimDate = hoClaimDate;
    return this;
  }

  /**
   * Get hoClaimDate
   * @return hoClaimDate
   */
  @NotNull @Pattern(regexp = "^(19[0-9]{2}|[2-9][0-9]{3})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$") 
  @Schema(name = "hoClaimDate", example = "2017-07-18", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hoClaimDate")
  public String getHoClaimDate() {
    return hoClaimDate;
  }

  public void setHoClaimDate(String hoClaimDate) {
    this.hoClaimDate = hoClaimDate;
  }

  public Application hoDecisionDate(String hoDecisionDate) {
    this.hoDecisionDate = hoDecisionDate;
    return this;
  }

  /**
   * Get hoDecisionDate
   * @return hoDecisionDate
   */
  @NotNull @Pattern(regexp = "^(19[0-9]{2}|[2-9][0-9]{3})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$") 
  @Schema(name = "hoDecisionDate", example = "2017-07-19", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hoDecisionDate")
  public String getHoDecisionDate() {
    return hoDecisionDate;
  }

  public void setHoDecisionDate(String hoDecisionDate) {
    this.hoDecisionDate = hoDecisionDate;
  }

  public Application hoDecisionLetterDate(String hoDecisionLetterDate) {
    this.hoDecisionLetterDate = hoDecisionLetterDate;
    return this;
  }

  /**
   * Get hoDecisionLetterDate
   * @return hoDecisionLetterDate
   */
  @NotNull @Pattern(regexp = "^(19[0-9]{2}|[2-9][0-9]{3})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$") 
  @Schema(name = "hoDecisionLetterDate", example = "2017-07-20", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hoDecisionLetterDate")
  public String getHoDecisionLetterDate() {
    return hoDecisionLetterDate;
  }

  public void setHoDecisionLetterDate(String hoDecisionLetterDate) {
    this.hoDecisionLetterDate = hoDecisionLetterDate;
  }

  public Application appellants(List<@Valid Appellant> appellants) {
    this.appellants = appellants;
    return this;
  }

  public Application addAppellantsItem(Appellant appellantsItem) {
    if (this.appellants == null) {
      this.appellants = new ArrayList<>();
    }
    this.appellants.add(appellantsItem);
    return this;
  }

  /**
   * Get appellants
   * @return appellants
   */
  @NotNull @Valid 
  @Schema(name = "appellants", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("appellants")
  public List<@Valid Appellant> getAppellants() {
    return appellants;
  }

  public void setAppellants(List<@Valid Appellant> appellants) {
    this.appellants = appellants;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Application application = (Application) o;
    return Objects.equals(this.uan, application.uan) &&
        Objects.equals(this.hoClaimDate, application.hoClaimDate) &&
        Objects.equals(this.hoDecisionDate, application.hoDecisionDate) &&
        Objects.equals(this.hoDecisionLetterDate, application.hoDecisionLetterDate) &&
        Objects.equals(this.appellants, application.appellants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uan, hoClaimDate, hoDecisionDate, hoDecisionLetterDate, appellants);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("    uan: ").append(toIndentedString(uan)).append("\n");
    sb.append("    hoClaimDate: ").append(toIndentedString(hoClaimDate)).append("\n");
    sb.append("    hoDecisionDate: ").append(toIndentedString(hoDecisionDate)).append("\n");
    sb.append("    hoDecisionLetterDate: ").append(toIndentedString(hoDecisionLetterDate)).append("\n");
    sb.append("    appellants: ").append(toIndentedString(appellants)).append("\n");
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

