/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")

@Validated
@Api(value = "applicationStatus", description = "the applicationStatus API")
public interface ApplicationStatusApi {

    static final Logger log = LoggerFactory.getLogger(ApplicationStatusApi.class);
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
                    log.info("/applicationStatus/getBySearchParameters request->return mock response");
                    String exampleString = "{\n" +
                        "  \"messageHeader\": {\n" +
                        "    \"consumer\": {\n" +
                        "      \"code\": \"HMCTS\",\n" +
                        "      \"description\": \"HM Courts and Tribunal Service\"\n" +
                        "    },\n" +
                        "    \"correlationId\": \"ABC2344BCED2234EA\",\n" +
                        "    \"eventDateTime\": \"2020-07-21T17:32:28Z\"\n" +
                        "  },\n" +
                        "  \"messageType\": \"RESPONSE_RIGHT_OF_APPEAL_DETAILS\",\n" +
                        "  \"status\": [\n" +
                        "    {\n" +
                        "      \"applicationStatus\": {\n" +
                        "        \"applicationType\": {\n" +
                        "          \"code\": \"ASYLUM\",\n" +
                        "          \"description\": \"Asylum and Protection\"\n" +
                        "        },\n" +
                        "        \"claimReasonType\": {\n" +
                        "          \"code\": \"HUMANRIGHTS\",\n" +
                        "          \"description\": \"Human Rights\"\n" +
                        "        },\n" +
                        "        \"decisionCommunication\": {\n" +
                        "          \"description\": \"E-mail\",\n" +
                        "          \"dispatchDate\": \"2020-07-21T17:32:28Z\",\n" +
                        "          \"sentDate\": \"2020-07-21T17:32:28Z\",\n" +
                        "          \"type\": \"EMAIL\"\n" +
                        "        },\n" +
                        "        \"decisionDate\": \"2020-07-21T17:32:28Z\",\n" +
                        "        \"decisionType\": {\n" +
                        "          \"code\": \"REJECTION\",\n" +
                        "          \"description\": \"Rejected\"\n" +
                        "        },\n" +
                        "        \"documentReference\": \"1234-1234-5678-5678/00\",\n" +
                        "        \"metadata\": [\n" +
                        "          {\n" +
                        "            \"code\": \"APPEALABLE or DISPATCH_DATE\",\n" +
                        "            \"valueBoolean\": true,\n" +
                        "            \"valueDateTime\": \"2020-07-21T17:32:28Z\",\n" +
                        "            \"valueString\": \"Some extra decision data\"\n" +
                        "          }\n" +
                        "        ],\n" +
                        "        \"rejectionReasons\": [\n" +
                        "          {\n" +
                        "            \"reason\": \"Application not completed properly\"\n" +
                        "          }\n" +
                        "        ],\n" +
                        "        \"roleSubType\": {\n" +
                        "          \"code\": \"MAIN\",\n" +
                        "          \"description\": \"Main\"\n" +
                        "        },\n" +
                        "        \"roleType\": {\n" +
                        "          \"code\": \"MAIN\",\n" +
                        "          \"description\": \"Main\"\n" +
                        "        }\n" +
                        "      },\n" +
                        "      \"person\": {\n" +
                        "        \"dayOfBirth\": 29,\n" +
                        "        \"familyName\": \"Smith\",\n" +
                        "        \"fullName\": \"John Smith\",\n" +
                        "        \"gender\": {\n" +
                        "          \"code\": \"M (denoting male)\",\n" +
                        "          \"description\": \"Male\"\n" +
                        "        },\n" +
                        "        \"givenName\": \"John\",\n" +
                        "        \"monthOfBirth\": 2,\n" +
                        "        \"nationality\": {\n" +
                        "          \"code\": \"CAN\",\n" +
                        "          \"description\": \"Canada\"\n" +
                        "        },\n" +
                        "        \"yearOfBirth\": 1968\n" +
                        "      }\n" +
                        "    },\n" +
                        "    {\n" +
                        "      \"applicationStatus\": {\n" +
                        "        \"applicationType\": {\n" +
                        "          \"code\": \"ASYLUM\",\n" +
                        "          \"description\": \"Asylum and Protection\"\n" +
                        "        },\n" +
                        "        \"claimReasonType\": {\n" +
                        "          \"code\": \"HUMANRIGHTS\",\n" +
                        "          \"description\": \"Human Rights\"\n" +
                        "        },\n" +
                        "        \"decisionCommunication\": {\n" +
                        "          \"description\": \"E-mail\",\n" +
                        "          \"dispatchDate\": \"2020-07-21T17:32:28Z\",\n" +
                        "          \"sentDate\": \"2020-07-21T17:32:28Z\",\n" +
                        "          \"type\": \"EMAIL\"\n" +
                        "        },\n" +
                        "        \"decisionDate\": \"2020-07-21T17:32:28Z\",\n" +
                        "        \"decisionType\": {\n" +
                        "          \"code\": \"REJECTION\",\n" +
                        "          \"description\": \"Rejected\"\n" +
                        "        },\n" +
                        "        \"documentReference\": \"1234-1234-5678-5678/00\",\n" +
                        "        \"metadata\": [\n" +
                        "          {\n" +
                        "            \"code\": \"DISPATCH_DATE\",\n" +
                        "            \"valueBoolean\": true,\n" +
                        "            \"valueDateTime\": \"2020-07-21T17:32:28Z\",\n" +
                        "            \"valueString\": \"Some extra decision data\"\n" +
                        "          },\n" +
                        "          {\n" +
                        "            \"code\": \"APPEALABLE\",\n" +
                        "            \"valueBoolean\": true,\n" +
                        "            \"valueDateTime\": \"2020-07-21T17:32:28Z\",\n" +
                        "            \"valueString\": \"Some extra decision data\"\n" +
                        "          }\n" +
                        "        ],\n" +
                        "        \"rejectionReasons\": [\n" +
                        "          {\n" +
                        "            \"reason\": \"Application not completed properly\"\n" +
                        "          },\n" +
                        "          {\n" +
                        "            \"reason\": \"Application not entered properly\"\n" +
                        "          }\n" +
                        "        ],\n" +
                        "        \"roleSubType\": {\n" +
                        "          \"code\": \"MAIN\",\n" +
                        "          \"description\": \"Main\"\n" +
                        "        },\n" +
                        "        \"roleType\": {\n" +
                        "          \"code\": \"APPLICANT\",\n" +
                        "          \"description\": \"Applicant\"\n" +
                        "        }\n" +
                        "      },\n" +
                        "      \"person\": {\n" +
                        "        \"dayOfBirth\": 21,\n" +
                        "        \"familyName\": \"Smith\",\n" +
                        "        \"fullName\": \"Capability Smith\",\n" +
                        "        \"gender\": {\n" +
                        "          \"code\": \"M (denoting male)\",\n" +
                        "          \"description\": \"Male\"\n" +
                        "        },\n" +
                        "        \"givenName\": \"Capability\",\n" +
                        "        \"monthOfBirth\": 0,\n" +
                        "        \"nationality\": {\n" +
                        "          \"code\": \"CAN\",\n" +
                        "          \"description\": \"Canada\"\n" +
                        "        },\n" +
                        "        \"yearOfBirth\": 1970\n" +
                        "      }\n" +
                        "    }\n" +
                        "  ]\n" +
                        "}";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }

}
