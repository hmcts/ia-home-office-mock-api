package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Appellant
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T17:52:14.183321Z[Europe/London]", comments = "Generator version: 7.20.0")
public class Appellant {

  private @Nullable String pp;

  private String familyName;

  private String givenNames;

  private String dateOfBirth;

  private String nationality;

  private @Nullable Boolean roa;

  private @Nullable Boolean asylumSupport;

  private @Nullable Boolean hoFeeWaiver;

  private String language;

  private @Nullable Boolean interpreterNeeded;

  public Appellant() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Appellant(String familyName, String givenNames, String dateOfBirth, String nationality, String language) {
    this.familyName = familyName;
    this.givenNames = givenNames;
    this.dateOfBirth = dateOfBirth;
    this.nationality = nationality;
    this.language = language;
  }

  public Appellant pp(@Nullable String pp) {
    this.pp = pp;
    return this;
  }

  /**
   * Get pp
   * @return pp
   */
  @Pattern(regexp = "^[0-9]{2}$") 
  @Schema(name = "pp", example = "01", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pp")
  public @Nullable String getPp() {
    return pp;
  }

  public void setPp(@Nullable String pp) {
    this.pp = pp;
  }

  public Appellant familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Get familyName
   * @return familyName
   */
  @NotNull 
  @Schema(name = "familyName", example = "Wimp", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("familyName")
  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Appellant givenNames(String givenNames) {
    this.givenNames = givenNames;
    return this;
  }

  /**
   * Get givenNames
   * @return givenNames
   */
  @NotNull 
  @Schema(name = "givenNames", example = "Horace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("givenNames")
  public String getGivenNames() {
    return givenNames;
  }

  public void setGivenNames(String givenNames) {
    this.givenNames = givenNames;
  }

  public Appellant dateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  /**
   * Get dateOfBirth
   * @return dateOfBirth
   */
  @NotNull @Pattern(regexp = "^(19[0-9]{2}|[2-9][0-9]{3})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$") 
  @Schema(name = "dateOfBirth", example = "2017-07-21", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateOfBirth")
  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Appellant nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @NotNull @Pattern(regexp = "^[A-Z]{3}$") 
  @Schema(name = "nationality", example = "GER", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nationality")
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Appellant roa(@Nullable Boolean roa) {
    this.roa = roa;
    return this;
  }

  /**
   * Get roa
   * @return roa
   */
  
  @Schema(name = "roa", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roa")
  public @Nullable Boolean getRoa() {
    return roa;
  }

  public void setRoa(@Nullable Boolean roa) {
    this.roa = roa;
  }

  public Appellant asylumSupport(@Nullable Boolean asylumSupport) {
    this.asylumSupport = asylumSupport;
    return this;
  }

  /**
   * Get asylumSupport
   * @return asylumSupport
   */
  
  @Schema(name = "asylumSupport", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asylumSupport")
  public @Nullable Boolean getAsylumSupport() {
    return asylumSupport;
  }

  public void setAsylumSupport(@Nullable Boolean asylumSupport) {
    this.asylumSupport = asylumSupport;
  }

  public Appellant hoFeeWaiver(@Nullable Boolean hoFeeWaiver) {
    this.hoFeeWaiver = hoFeeWaiver;
    return this;
  }

  /**
   * Get hoFeeWaiver
   * @return hoFeeWaiver
   */
  
  @Schema(name = "hoFeeWaiver", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hoFeeWaiver")
  public @Nullable Boolean getHoFeeWaiver() {
    return hoFeeWaiver;
  }

  public void setHoFeeWaiver(@Nullable Boolean hoFeeWaiver) {
    this.hoFeeWaiver = hoFeeWaiver;
  }

  public Appellant language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @NotNull @Pattern(regexp = "^[a-z]{3}$") 
  @Schema(name = "language", example = "eng", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Appellant interpreterNeeded(@Nullable Boolean interpreterNeeded) {
    this.interpreterNeeded = interpreterNeeded;
    return this;
  }

  /**
   * Get interpreterNeeded
   * @return interpreterNeeded
   */
  
  @Schema(name = "interpreterNeeded", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("interpreterNeeded")
  public @Nullable Boolean getInterpreterNeeded() {
    return interpreterNeeded;
  }

  public void setInterpreterNeeded(@Nullable Boolean interpreterNeeded) {
    this.interpreterNeeded = interpreterNeeded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Appellant appellant = (Appellant) o;
    return Objects.equals(this.pp, appellant.pp) &&
        Objects.equals(this.familyName, appellant.familyName) &&
        Objects.equals(this.givenNames, appellant.givenNames) &&
        Objects.equals(this.dateOfBirth, appellant.dateOfBirth) &&
        Objects.equals(this.nationality, appellant.nationality) &&
        Objects.equals(this.roa, appellant.roa) &&
        Objects.equals(this.asylumSupport, appellant.asylumSupport) &&
        Objects.equals(this.hoFeeWaiver, appellant.hoFeeWaiver) &&
        Objects.equals(this.language, appellant.language) &&
        Objects.equals(this.interpreterNeeded, appellant.interpreterNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pp, familyName, givenNames, dateOfBirth, nationality, roa, asylumSupport, hoFeeWaiver, language, interpreterNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Appellant {\n");
    sb.append("    pp: ").append(toIndentedString(pp)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenNames: ").append(toIndentedString(givenNames)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    roa: ").append(toIndentedString(roa)).append("\n");
    sb.append("    asylumSupport: ").append(toIndentedString(asylumSupport)).append("\n");
    sb.append("    hoFeeWaiver: ").append(toIndentedString(hoFeeWaiver)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    interpreterNeeded: ").append(toIndentedString(interpreterNeeded)).append("\n");
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

