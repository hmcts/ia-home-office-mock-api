package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Challenge;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.ConsumerRef;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.CourtOutcome;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.Hearing;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.MessageHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ### Message instructing Home Office about an event, or action to perform.  #### Mandatory items for all messages  messageHeader, messageType, hoReference, and consumerReference  #### Optional items  note  #### Message Types and Mandatory Elements  REQUEST_CHALLENGE_END: endReason, endChallengeDate  REQUEST_EVIDENCE_BUNDLE: challenge, deadlineDate  REQUEST_REVIEW: deadlineDate (a review has its own deadline)  HEARING: hearing  HEARING_BUNDLE_READY: hearing (passing just hmctsHearingRef and hearingType)  COURT_OUTCOME: courtOutcome  PERMISSION_TO_APPEAL: courtType  DEFAULT: No additional mandatory elements; generic item that is not a bundle/review request 
 */

@Schema(name = "InstructMessage", description = "### Message instructing Home Office about an event, or action to perform.  #### Mandatory items for all messages  messageHeader, messageType, hoReference, and consumerReference  #### Optional items  note  #### Message Types and Mandatory Elements  REQUEST_CHALLENGE_END: endReason, endChallengeDate  REQUEST_EVIDENCE_BUNDLE: challenge, deadlineDate  REQUEST_REVIEW: deadlineDate (a review has its own deadline)  HEARING: hearing  HEARING_BUNDLE_READY: hearing (passing just hmctsHearingRef and hearingType)  COURT_OUTCOME: courtOutcome  PERMISSION_TO_APPEAL: courtType  DEFAULT: No additional mandatory elements; generic item that is not a bundle/review request ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-20T18:22:35.342881Z[Europe/London]")
public class InstructMessage   {

  @JsonProperty("messageHeader")
  private MessageHeader messageHeader;

  /**
   * Message type
   */
  public enum MessageTypeEnum {
    REQUEST_CHALLENGE_END("REQUEST_CHALLENGE_END"),
    
    REQUEST_EVIDENCE_BUNDLE("REQUEST_EVIDENCE_BUNDLE"),
    
    REQUEST_REVIEW("REQUEST_REVIEW"),
    
    HEARING("HEARING"),
    
    HEARING_BUNDLE_READY("HEARING_BUNDLE_READY"),
    
    COURT_OUTCOME("COURT_OUTCOME"),
    
    PERMISSION_TO_APPEAL("PERMISSION_TO_APPEAL"),
    
    DEFAULT("DEFAULT");

    private String value;

    MessageTypeEnum(String value) {
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
    public static MessageTypeEnum fromValue(String value) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("messageType")
  private MessageTypeEnum messageType;

  @JsonProperty("hoReference")
  private String hoReference;

  @JsonProperty("consumerReference")
  private ConsumerRef consumerReference;

  /**
   * Code indicating reason for ending a challenge. *Mandatory if messageType is REQUEST_CHALLENGE_END*
   */
  public enum EndReasonEnum {
    STRUCK_OUT("STRUCK_OUT"),
    
    ABANDONED("ABANDONED"),
    
    WITHDRAWN("WITHDRAWN"),
    
    NOT_VALID("NOT_VALID"),
    
    INCORRECT_DETAILS("INCORRECT_DETAILS");

    private String value;

    EndReasonEnum(String value) {
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
    public static EndReasonEnum fromValue(String value) {
      for (EndReasonEnum b : EndReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("endReason")
  private EndReasonEnum endReason;

  @JsonProperty("endChallengeDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endChallengeDate;

  @JsonProperty("deadlineDate")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime deadlineDate;

  /**
   * Court type. *Mandatory if messageType is PERMISSION_TO_APPEAL*
   */
  public enum CourtTypeEnum {
    FIRST_TIER("FIRST_TIER"),
    
    UPPER_TRIBUNAL("UPPER_TRIBUNAL"),
    
    COURT_OF_APPEAL("COURT_OF_APPEAL"),
    
    SUPREME_COURT("SUPREME_COURT");

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

  @JsonProperty("challenge")
  private Challenge challenge;

  @JsonProperty("hearing")
  private Hearing hearing;

  @JsonProperty("courtOutcome")
  private CourtOutcome courtOutcome;

  @JsonProperty("note")
  private String note;

  public InstructMessage messageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  /**
   * Get messageHeader
   * @return messageHeader
  */
  @NotNull @Valid 
  @Schema(name = "messageHeader", required = true)
  public MessageHeader getMessageHeader() {
    return messageHeader;
  }

  public void setMessageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }

  public InstructMessage messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Message type
   * @return messageType
  */
  @NotNull 
  @Schema(name = "messageType", description = "Message type", required = true)
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public InstructMessage hoReference(String hoReference) {
    this.hoReference = hoReference;
    return this;
  }

  /**
   * Home Office reference (UAN or CID case ID)
   * @return hoReference
  */
  @NotNull 
  @Schema(name = "hoReference", example = "nnnn-nnnn-nnnn-nnnn (UAN) or CID (case ID, e.g. 001234567)", description = "Home Office reference (UAN or CID case ID)", required = true)
  public String getHoReference() {
    return hoReference;
  }

  public void setHoReference(String hoReference) {
    this.hoReference = hoReference;
  }

  public InstructMessage consumerReference(ConsumerRef consumerReference) {
    this.consumerReference = consumerReference;
    return this;
  }

  /**
   * Get consumerReference
   * @return consumerReference
  */
  @NotNull @Valid 
  @Schema(name = "consumerReference", required = true)
  public ConsumerRef getConsumerReference() {
    return consumerReference;
  }

  public void setConsumerReference(ConsumerRef consumerReference) {
    this.consumerReference = consumerReference;
  }

  public InstructMessage endReason(EndReasonEnum endReason) {
    this.endReason = endReason;
    return this;
  }

  /**
   * Code indicating reason for ending a challenge. *Mandatory if messageType is REQUEST_CHALLENGE_END*
   * @return endReason
  */
  
  @Schema(name = "endReason", description = "Code indicating reason for ending a challenge. *Mandatory if messageType is REQUEST_CHALLENGE_END*", required = false)
  public EndReasonEnum getEndReason() {
    return endReason;
  }

  public void setEndReason(EndReasonEnum endReason) {
    this.endReason = endReason;
  }

  public InstructMessage endChallengeDate(OffsetDateTime endChallengeDate) {
    this.endChallengeDate = endChallengeDate;
    return this;
  }

  /**
   * Date (and time, if available) the challenge was ended, in the standard format yyyy-mm-dd (with HH:mm:ss if the time is available, otherwise not). Date/time is assumed to be in UTC. *Mandatory if messageType is REQUEST_CHALLENGE_END*
   * @return endChallengeDate
  */
  @Valid 
  @Schema(name = "endChallengeDate", example = "2017-07-21T17:32:28Z", description = "Date (and time, if available) the challenge was ended, in the standard format yyyy-mm-dd (with HH:mm:ss if the time is available, otherwise not). Date/time is assumed to be in UTC. *Mandatory if messageType is REQUEST_CHALLENGE_END*", required = false)
  public OffsetDateTime getEndChallengeDate() {
    return endChallengeDate;
  }

  public void setEndChallengeDate(OffsetDateTime endChallengeDate) {
    this.endChallengeDate = endChallengeDate;
  }

  public InstructMessage deadlineDate(OffsetDateTime deadlineDate) {
    this.deadlineDate = deadlineDate;
    return this;
  }

  /**
   * Deadline date (and time, if available) for the appeal, in the standard format yyyy-mm-dd (with HH:mm:ss if the time is available, otherwise not). Date/time is assumed to be in UTC
   * @return deadlineDate
  */
  @Valid 
  @Schema(name = "deadlineDate", example = "2017-07-21T17:32:28Z", description = "Deadline date (and time, if available) for the appeal, in the standard format yyyy-mm-dd (with HH:mm:ss if the time is available, otherwise not). Date/time is assumed to be in UTC", required = false)
  public OffsetDateTime getDeadlineDate() {
    return deadlineDate;
  }

  public void setDeadlineDate(OffsetDateTime deadlineDate) {
    this.deadlineDate = deadlineDate;
  }

  public InstructMessage courtType(CourtTypeEnum courtType) {
    this.courtType = courtType;
    return this;
  }

  /**
   * Court type. *Mandatory if messageType is PERMISSION_TO_APPEAL*
   * @return courtType
  */
  
  @Schema(name = "courtType", description = "Court type. *Mandatory if messageType is PERMISSION_TO_APPEAL*", required = false)
  public CourtTypeEnum getCourtType() {
    return courtType;
  }

  public void setCourtType(CourtTypeEnum courtType) {
    this.courtType = courtType;
  }

  public InstructMessage challenge(Challenge challenge) {
    this.challenge = challenge;
    return this;
  }

  /**
   * Get challenge
   * @return challenge
  */
  @Valid 
  @Schema(name = "challenge", required = false)
  public Challenge getChallenge() {
    return challenge;
  }

  public void setChallenge(Challenge challenge) {
    this.challenge = challenge;
  }

  public InstructMessage hearing(Hearing hearing) {
    this.hearing = hearing;
    return this;
  }

  /**
   * Get hearing
   * @return hearing
  */
  @Valid 
  @Schema(name = "hearing", required = false)
  public Hearing getHearing() {
    return hearing;
  }

  public void setHearing(Hearing hearing) {
    this.hearing = hearing;
  }

  public InstructMessage courtOutcome(CourtOutcome courtOutcome) {
    this.courtOutcome = courtOutcome;
    return this;
  }

  /**
   * Get courtOutcome
   * @return courtOutcome
  */
  @Valid 
  @Schema(name = "courtOutcome", required = false)
  public CourtOutcome getCourtOutcome() {
    return courtOutcome;
  }

  public void setCourtOutcome(CourtOutcome courtOutcome) {
    this.courtOutcome = courtOutcome;
  }

  public InstructMessage note(String note) {
    this.note = note;
    return this;
  }

  /**
   * Optional note. Can be used for indicating notification type and, possibly, Home Office actions required
   * @return note
  */
  
  @Schema(name = "note", example = "Additional notes from HMCTS", description = "Optional note. Can be used for indicating notification type and, possibly, Home Office actions required", required = false)
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructMessage instructMessage = (InstructMessage) o;
    return Objects.equals(this.messageHeader, instructMessage.messageHeader) &&
        Objects.equals(this.messageType, instructMessage.messageType) &&
        Objects.equals(this.hoReference, instructMessage.hoReference) &&
        Objects.equals(this.consumerReference, instructMessage.consumerReference) &&
        Objects.equals(this.endReason, instructMessage.endReason) &&
        Objects.equals(this.endChallengeDate, instructMessage.endChallengeDate) &&
        Objects.equals(this.deadlineDate, instructMessage.deadlineDate) &&
        Objects.equals(this.courtType, instructMessage.courtType) &&
        Objects.equals(this.challenge, instructMessage.challenge) &&
        Objects.equals(this.hearing, instructMessage.hearing) &&
        Objects.equals(this.courtOutcome, instructMessage.courtOutcome) &&
        Objects.equals(this.note, instructMessage.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageHeader, messageType, hoReference, consumerReference, endReason, endChallengeDate, deadlineDate, courtType, challenge, hearing, courtOutcome, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructMessage {\n");
    sb.append("    messageHeader: ").append(toIndentedString(messageHeader)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    hoReference: ").append(toIndentedString(hoReference)).append("\n");
    sb.append("    consumerReference: ").append(toIndentedString(consumerReference)).append("\n");
    sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
    sb.append("    endChallengeDate: ").append(toIndentedString(endChallengeDate)).append("\n");
    sb.append("    deadlineDate: ").append(toIndentedString(deadlineDate)).append("\n");
    sb.append("    courtType: ").append(toIndentedString(courtType)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    hearing: ").append(toIndentedString(hearing)).append("\n");
    sb.append("    courtOutcome: ").append(toIndentedString(courtOutcome)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

