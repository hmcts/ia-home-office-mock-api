package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.MessageHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response round-tripping request message header.
 */
@ApiModel(description = "Response round-tripping request message header.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-26T15:41:16.451+01:00[Europe/London]")

public class InstructResponse   {
  @JsonProperty("messageHeader")
  private MessageHeader messageHeader;

  public InstructResponse messageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  /**
   * Get messageHeader
   * @return messageHeader
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageHeader getMessageHeader() {
    return messageHeader;
  }

  public void setMessageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstructResponse instructResponse = (InstructResponse) o;
    return Objects.equals(this.messageHeader, instructResponse.messageHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstructResponse {\n");
    
    sb.append("    messageHeader: ").append(toIndentedString(messageHeader)).append("\n");
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

