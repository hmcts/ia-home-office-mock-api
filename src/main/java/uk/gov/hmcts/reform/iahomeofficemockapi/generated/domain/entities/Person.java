package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.PersonGender;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.PersonNationality;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An individual fufilling a role on the application.
 */
@ApiModel(description = "An individual fufilling a role on the application.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class Person   {
  @JsonProperty("givenName")
  private String givenName;

  @JsonProperty("familyName")
  private String familyName;

  @JsonProperty("fullName")
  private String fullName;

  @JsonProperty("gender")
  private PersonGender gender;

  @JsonProperty("dayOfBirth")
  private Integer dayOfBirth;

  @JsonProperty("monthOfBirth")
  private Integer monthOfBirth;

  @JsonProperty("yearOfBirth")
  private Integer yearOfBirth;

  @JsonProperty("nationality")
  private PersonNationality nationality;

  public Person givenName(String givenName) {
    this.givenName = givenName;
    return this;
  }

  /**
   * Person's given names. Assumed to be a concatenated list of names
   * @return givenName
  */
  @ApiModelProperty(example = "Capability", value = "Person's given names. Assumed to be a concatenated list of names")


  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public Person familyName(String familyName) {
    this.familyName = familyName;
    return this;
  }

  /**
   * Person's family names. Assumed to be a concatenated list of names
   * @return familyName
  */
  @ApiModelProperty(example = "Smith", value = "Person's family names. Assumed to be a concatenated list of names")


  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  public Person fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Person's full name
   * @return fullName
  */
  @ApiModelProperty(example = "Capability Smith", value = "Person's full name")


  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Person gender(PersonGender gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
  */
  @ApiModelProperty(value = "")

  @Valid

  public PersonGender getGender() {
    return gender;
  }

  public void setGender(PersonGender gender) {
    this.gender = gender;
  }

  public Person dayOfBirth(Integer dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
    return this;
  }

  /**
   * Day of month the person was born on, from 1-31. No leading zeroes
   * @return dayOfBirth
  */
  @ApiModelProperty(example = "21", value = "Day of month the person was born on, from 1-31. No leading zeroes")


  public Integer getDayOfBirth() {
    return dayOfBirth;
  }

  public void setDayOfBirth(Integer dayOfBirth) {
    this.dayOfBirth = dayOfBirth;
  }

  public Person monthOfBirth(Integer monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
    return this;
  }

  /**
   * Month of year (Gregorian calendar) the person was born in, from 1-12. No leading zeroes
   * @return monthOfBirth
  */
  @ApiModelProperty(value = "Month of year (Gregorian calendar) the person was born in, from 1-12. No leading zeroes")


  public Integer getMonthOfBirth() {
    return monthOfBirth;
  }

  public void setMonthOfBirth(Integer monthOfBirth) {
    this.monthOfBirth = monthOfBirth;
  }

  public Person yearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
    return this;
  }

  /**
   * Year the person was born in (4 digits)
   * @return yearOfBirth
  */
  @ApiModelProperty(example = "1970", value = "Year the person was born in (4 digits)")


  public Integer getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(Integer yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public Person nationality(PersonNationality nationality) {
    this.nationality = nationality;
    return this;
  }

  /**
   * Get nationality
   * @return nationality
  */
  @ApiModelProperty(value = "")

  @Valid

  public PersonNationality getNationality() {
    return nationality;
  }

  public void setNationality(PersonNationality nationality) {
    this.nationality = nationality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

