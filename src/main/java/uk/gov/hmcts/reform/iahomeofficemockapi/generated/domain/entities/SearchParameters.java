package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Parameters passed in to enable searching for applications. Currently supports only one type/value pair but the interface is designed to support multiple in future.    As a side effect this service will send a notification to the Event Publisher to inform them that a request for a possible appeal has been made.
 */
@Schema(description = "Parameters passed in to enable searching for applications. Currently supports only one type/value pair but the interface is designed to support multiple in future.    As a side effect this service will send a notification to the Event Publisher to inform them that a request for a possible appeal has been made.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

public class SearchParameters   {
  @JsonProperty("messageHeader")
  private MessageHeader messageHeader;

  @JsonProperty("searchParams")
  @Valid
  private List<SearchParametersSearchParams> searchParams = new ArrayList<>();

  public SearchParameters messageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
    return this;
  }

  /**
   * Get messageHeader
   * @return messageHeader
  */
  @Schema(required = true)
  @NotNull

  @Valid

  public MessageHeader getMessageHeader() {
    return messageHeader;
  }

  public void setMessageHeader(MessageHeader messageHeader) {
    this.messageHeader = messageHeader;
  }

  public SearchParameters searchParams(List<SearchParametersSearchParams> searchParams) {
    this.searchParams = searchParams;
    return this;
  }

  public SearchParameters addSearchParamsItem(SearchParametersSearchParams searchParamsItem) {
    this.searchParams.add(searchParamsItem);
    return this;
  }

  /**
   * Get searchParams
   * @return searchParams
  */
  @Schema(required = true)
  @NotNull

  @Valid
@Size(min=1)
  public List<SearchParametersSearchParams> getSearchParams() {
    return searchParams;
  }

  public void setSearchParams(List<SearchParametersSearchParams> searchParams) {
    this.searchParams = searchParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchParameters searchParameters = (SearchParameters) o;
    return Objects.equals(this.messageHeader, searchParameters.messageHeader) &&
        Objects.equals(this.searchParams, searchParameters.searchParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageHeader, searchParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchParameters {\n");

    sb.append("    messageHeader: ").append(toIndentedString(messageHeader)).append("\n");
    sb.append("    searchParams: ").append(toIndentedString(searchParams)).append("\n");
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

