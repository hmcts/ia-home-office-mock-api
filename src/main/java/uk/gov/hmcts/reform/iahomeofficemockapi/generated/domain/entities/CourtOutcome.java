package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Court type and outcome of the appeal.
 */
@ApiModel(description = "Court type and outcome of the appeal.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-15T16:51:58.701+01:00[Europe/London]")

public class CourtOutcome   {
  /**
   * Court (tribunal) type
   */
  public enum CourtTypeEnum {
    FIRST_TIER("FIRST_TIER"),
    
    FTPA("FTPA"),
    
    UTPA("UTPA");

    private String value;

    CourtTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CourtTypeEnum fromValue(String value) {
      for (CourtTypeEnum b : CourtTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("courtType")
  private CourtTypeEnum courtType;

  /**
   * Appeal outcome
   */
  public enum OutcomeEnum {
    ALLOWED("ALLOWED"),
    
    DISMISSED("DISMISSED"),
    
    GRANTED("GRANTED"),
    
    REFUSED("REFUSED"),
    
    REHEARD("REHEARD"),
    
    REMADE("REMADE");

    private String value;

    OutcomeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OutcomeEnum fromValue(String value) {
      for (OutcomeEnum b : OutcomeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("outcome")
  private OutcomeEnum outcome;

  public CourtOutcome courtType(CourtTypeEnum courtType) {
    this.courtType = courtType;
    return this;
  }

  /**
   * Court (tribunal) type
   * @return courtType
  */
  @ApiModelProperty(required = true, value = "Court (tribunal) type")
  @NotNull


  public CourtTypeEnum getCourtType() {
    return courtType;
  }

  public void setCourtType(CourtTypeEnum courtType) {
    this.courtType = courtType;
  }

  public CourtOutcome outcome(OutcomeEnum outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Appeal outcome
   * @return outcome
  */
  @ApiModelProperty(required = true, value = "Appeal outcome")
  @NotNull


  public OutcomeEnum getOutcome() {
    return outcome;
  }

  public void setOutcome(OutcomeEnum outcome) {
    this.outcome = outcome;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CourtOutcome courtOutcome = (CourtOutcome) o;
    return Objects.equals(this.courtType, courtOutcome.courtType) &&
        Objects.equals(this.outcome, courtOutcome.outcome);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courtType, outcome);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CourtOutcome {\n");
    
    sb.append("    courtType: ").append(toIndentedString(courtType)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
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

