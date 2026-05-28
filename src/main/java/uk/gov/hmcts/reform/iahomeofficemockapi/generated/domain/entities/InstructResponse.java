package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import org.springframework.lang.Nullable;

import java.util.Objects;

/**
 * Response round-tripping request message header.
 */

@Schema(name = "InstructResponse", description = "Response round-tripping request message header.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T11:19:43.880285+01:00[Europe/London]", comments = "Generator version: 7.20.0")
public class InstructResponse {

  private @Nullable MessageHeader messageHeader;

  public InstructResponse messageHeader(@Nullable MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  /**
   * Get messageHeader
   * @return messageHeader
   */
  @Valid
  @Schema(name = "messageHeader", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("messageHeader")
  public @Nullable MessageHeader getMessageHeader() {
    return messageHeader;
  }

  public void setMessageHeader(@Nullable MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(@Nullable Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

