package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.PersonGender;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.PersonNationality;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An individual fufilling a role on the application.
 */

@Schema(name = "Person", description = "An individual fufilling a role on the application.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-04-27T09:30:21.003363+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class Person {

  private @Nullable String givenName;

  private @Nullable String familyName;

  private @Nullable String fullName;

  private @Nullable PersonGender gender;

  private @Nullable Integer dayOfBirth;

  private @Nullable Integer monthOfBirth;

  private @Nullable Integer yearOfBirth;

  private @Nullable PersonNationality nationality;

  public Person givenName(@Nullable String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Person's given names. Assumed to be a concatenated list of names
   * @return givenName
   */
  
  @Schema(name = "givenName", example = "Capability", description = "Person's given names. Assumed to be a concatenated list of names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("givenName")
  public @Nullable String getGivenName() {
    return givenName;
  }

  public void setGivenName(@Nullable String givenName) {
    this.givenName = givenName;
  }

  public Person familyName(@Nullable String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Person's family names. Assumed to be a concatenated list of names
   * @return familyName
   */
  
  @Schema(name = "familyName", example = "Smith", description = "Person's family names. Assumed to be a concatenated list of names", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("familyName")
  public @Nullable String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(@Nullable String familyName) {
    this.familyName = familyName;
  }

  public Person fullName(@Nullable String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Person's full name
   * @return fullName
   */
  
  @Schema(name = "fullName", example = "Capability Smith", description = "Person's full name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullName")
  public @Nullable String getFullName() {
    return fullName;
  }

  public void setFullName(@Nullable String fullName) {
    this.fullName = fullName;
  }

  public Person gender(@Nullable PersonGender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   */
  @Valid 
  @Schema(name = "gender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender")
  public @Nullable PersonGender getGender() {
    return gender;
  }

  public void setGender(@Nullable PersonGender gender) {
    this.gender = gender;
  }

  public Person dayOfBirth(@Nullable Integer dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
    return this;
  }

  /**
   * Day of month the person was born on, from 1-31. No leading zeroes
   * @return dayOfBirth
   */
  
  @Schema(name = "dayOfBirth", example = "21", description = "Day of month the person was born on, from 1-31. No leading zeroes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dayOfBirth")
  public @Nullable Integer getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(@Nullable Integer dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public Person monthOfBirth(@Nullable Integer monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
    return this;
  }

  /**
   * Month of year (Gregorian calendar) the person was born in, from 1-12. No leading zeroes
   * @return monthOfBirth
   */
  
  @Schema(name = "monthOfBirth", description = "Month of year (Gregorian calendar) the person was born in, from 1-12. No leading zeroes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthOfBirth")
  public @Nullable Integer getMonthOfBirth() {
    return monthOfBirth;
  }

  public void setMonthOfBirth(@Nullable Integer monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
  }

  public Person yearOfBirth(@Nullable Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
    return this;
  }

  /**
   * Year the person was born in (4 digits)
   * @return yearOfBirth
   */
  
  @Schema(name = "yearOfBirth", example = "1970", description = "Year the person was born in (4 digits)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yearOfBirth")
  public @Nullable Integer getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(@Nullable Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public Person nationality(@Nullable PersonNationality nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
   */
  @Valid 
  @Schema(name = "nationality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("nationality")
  public @Nullable PersonNationality getNationality() {
    return nationality;
  }

  public void setNationality(@Nullable PersonNationality nationality) {
    this.nationality = nationality;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Person person = (Person) o;
    return Objects.equals(this.givenName, person.givenName) &&
        Objects.equals(this.familyName, person.familyName) &&
        Objects.equals(this.fullName, person.fullName) &&
        Objects.equals(this.gender, person.gender) &&
        Objects.equals(this.dayOfBirth, person.dayOfBirth) &&
        Objects.equals(this.monthOfBirth, person.monthOfBirth) &&
        Objects.equals(this.yearOfBirth, person.yearOfBirth) &&
        Objects.equals(this.nationality, person.nationality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, familyName, fullName, gender, dayOfBirth, monthOfBirth, yearOfBirth, nationality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Person {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dayOfBirth: ").append(toIndentedString(dayOfBirth)).append("\n");
    sb.append("    monthOfBirth: ").append(toIndentedString(monthOfBirth)).append("\n");
    sb.append("    yearOfBirth: ").append(toIndentedString(yearOfBirth)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
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

