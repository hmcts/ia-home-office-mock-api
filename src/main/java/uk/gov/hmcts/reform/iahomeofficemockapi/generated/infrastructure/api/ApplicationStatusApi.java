/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api;

import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchErrorResponse;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchParameters;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponse;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-26T15:41:16.451+01:00[Europe/London]")

@Validated
@Api(value = "applicationStatus", description = "the applicationStatus API")
public interface ApplicationStatusApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /applicationStatus/getBySearchParameters : Finds applications by search parameters (initially one).
     *
     * @param searchParameters  (required)
     * @return OK (status code 200)
     *         or Invalid status value (status code 400)
     */
    @ApiOperation(value = "Finds applications by search parameters (initially one).", nickname = "applicationStatusGetBySearchParametersPost", notes = "", response = SearchResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SearchResponse.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = SearchErrorResponse.class) })
    @RequestMapping(value = "/applicationStatus/getBySearchParameters",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<SearchResponse> applicationStatusGetBySearchParametersPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody SearchParameters searchParameters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"messageHeader\" : { \"eventDateTime\" : \"2017-07-21T17:32:28Z\", \"correlationId\" : \"ABC2344BCED2234EA\", \"consumer\" : { \"code\" : \"HMCTS\", \"description\" : \"HM Courts and Tribunal Service\" } }, \"messageType\" : \"MessageType.RESPONSE_RIGHT_OF_APPEAL_DETAILS\", \"status\" : [ { \"person\" : { \"gender\" : { \"code\" : \"M (denoting male)\", \"description\" : \"Male\" }, \"nationality\" : { \"code\" : \"CAN (denoting Canada)\", \"description\" : \"Canada\" }, \"dayOfBirth\" : 21, \"givenName\" : \"Capability\", \"familyName\" : \"Smith\", \"fullName\" : \"Capability Smith\", \"monthOfBirth\" : 0, \"yearOfBirth\" : 1970 }, \"decisionStatus\" : { \"applicationType\" : { \"code\" : \"ASYLUM\", \"description\" : \"Asylum and Protection\" }, \"rejectionReasons\" : [ { \"reason\" : \"Application not completed properly\" }, { \"reason\" : \"Application not completed properly\" } ], \"decisionCommunication\" : { \"sentDate\" : \"2017-07-21T17:32:28Z\", \"description\" : \"E-mail\", \"type\" : \"EMAIL\" }, \"claimReasonType\" : { \"code\" : \"HUMANRIGHTS\", \"description\" : \"Human Rights\" }, \"roleSubType\" : { \"code\" : \"SPOUSE. Could be MAIN if the role type is APPLICANT\", \"description\" : \"Spouse\" }, \"decisionType\" : { \"code\" : \"REJECTION\", \"description\" : \"Rejected\" }, \"appealable\" : true, \"roleType\" : { \"code\" : \"DEPENDANT\", \"description\" : \"Dependant\" }, \"decisionDate\" : \"2017-07-21T17:32:28Z\" } }, { \"person\" : { \"gender\" : { \"code\" : \"M (denoting male)\", \"description\" : \"Male\" }, \"nationality\" : { \"code\" : \"CAN (denoting Canada)\", \"description\" : \"Canada\" }, \"dayOfBirth\" : 21, \"givenName\" : \"Capability\", \"familyName\" : \"Smith\", \"fullName\" : \"Capability Smith\", \"monthOfBirth\" : 0, \"yearOfBirth\" : 1970 }, \"decisionStatus\" : { \"applicationType\" : { \"code\" : \"ASYLUM\", \"description\" : \"Asylum and Protection\" }, \"rejectionReasons\" : [ { \"reason\" : \"Application not completed properly\" }, { \"reason\" : \"Application not completed properly\" } ], \"decisionCommunication\" : { \"sentDate\" : \"2017-07-21T17:32:28Z\", \"description\" : \"E-mail\", \"type\" : \"EMAIL\" }, \"claimReasonType\" : { \"code\" : \"HUMANRIGHTS\", \"description\" : \"Human Rights\" }, \"roleSubType\" : { \"code\" : \"SPOUSE. Could be MAIN if the role type is APPLICANT\", \"description\" : \"Spouse\" }, \"decisionType\" : { \"code\" : \"REJECTION\", \"description\" : \"Rejected\" }, \"appealable\" : true, \"roleType\" : { \"code\" : \"DEPENDANT\", \"description\" : \"Dependant\" }, \"decisionDate\" : \"2017-07-21T17:32:28Z\" } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
