package uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.MessageHeader;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchParametersSearchParams;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Parameters passed in to enable searching for applications. Currently supports only one type/value pair but the interface is designed to support multiple in future.
 */
@ApiModel(description = "Parameters passed in to enable searching for applications. Currently supports only one type/value pair but the interface is designed to support multiple in future.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-26T15:41:16.451+01:00[Europe/London]")

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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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

