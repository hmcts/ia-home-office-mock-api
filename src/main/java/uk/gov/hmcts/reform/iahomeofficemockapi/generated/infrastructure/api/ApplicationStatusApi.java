/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.0).
 * https://openapi-generator.tech Do not edit the class manually.
 */
package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.MultiValueMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchParameters;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.SearchResponse;

import javax.validation.Valid;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")
@Validated
@Tag(name = "applicationStatus", description = "the applicationStatus API")
public interface ApplicationStatusApi {

    static final Logger log = LoggerFactory.getLogger(ApplicationStatusApi.class);

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /applicationStatus/getBySearchParameters : Finds applications by search parameters (initially one).
     *
     * @param bearerToken (required)
     * @param searchParameters (required)
     * @return OK (status code 200) or Invalid status value (status code 400)
     */
    @Operation(description = "Finds applications by search parameters (initially one).", operationId = "applicationStatusGetBySearchParametersPost", tags = {})
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/applicationStatus/getBySearchParameters",
        produces = {"application/json"},
        consumes = {"application/json"},
        method = RequestMethod.POST)
    default ResponseEntity<SearchResponse> applicationStatusGetBySearchParametersPost(
        @Parameter(required = true) @Valid @RequestHeader(HttpHeaders.AUTHORIZATION) String bearerToken,
        @Parameter(required = true) @Valid @RequestBody SearchParameters searchParameters) {

        final Optional<NativeWebRequest> nativeWebRequest = getRequest();

        log.info("/applicationStatus/getBySearchParameters nativeWebRequest->return mock response");

        final NativeWebRequest request = nativeWebRequest.get();

        log.info("/applicationStatus/getBySearchParameters nativeWebRequest->return mock response");

        final String documentReference = searchParameters.getSearchParams().get(0).getSpValue();

        if (documentReference.equalsIgnoreCase("1212/009900362015")
            || documentReference.equalsIgnoreCase("2/032323")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        String responseJson = null;
        try {
            responseJson = getResponseJson(documentReference);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String exampleString = "";
        ApiUtil.setExampleResponse(request, "application/json", responseJson);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    /**
     * POST /token : returns JWT access_token for given client_id and client_secret..
     *
     * @param searchParameters (required)
     * @return OK (status code 200) or Invalid status value (status code 400)
     */
    @Operation(summary = "get acces token.", operationId = "tokenPost", tags = {})
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK")
    })
    @RequestMapping(value = "/token",
        produces = {"application/json"},
        consumes = {"application/x-www-form-urlencoded"},
        method = RequestMethod.POST)
    default ResponseEntity<SearchResponse> tokenPost(
        @Parameter(required = true) @Valid @RequestBody MultiValueMap<String, String> requestBody) {

        getRequest().ifPresent(request -> {
            log.info("/token request->return mock response");

            String jwtToken = "{"
                + "\"access_token\": \"some_access_token\","
                + "\"expires_in\": 300,"
                + "\"token_type\": \"bearer\","
                + "\"not-before-policy\": 0,"
                + "\"scope\": \"email profile\""
                + "}";
            ApiUtil.setExampleResponse(request, "application/json", jwtToken);
        });
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @NotNull
    private String getResponseJson(String homeOfficeReference) throws IOException {

        String responseJsonFile;

        switch (homeOfficeReference) {
            case "1212-0007-0002-6108":
                responseJsonFile = "ho-api_get-by-search-params_200-valid_response_6108.json";
                break;
            case "1212-0099-0061-7075": // Valid UAN reference
                responseJsonFile = "ho-api_get-by-search-params_200-valid_response_7075.json";
                break;
            case "1212-0099-0062-8083":
                responseJsonFile = "ho-api_get-by-serach-params_200_valid-response-8083.json";
                break;
            case "1234-1111-5678-1111":
                responseJsonFile = "ho_api_get_by_search_params_200_main_applicant_dob_match_3980.json";
                break;
            case "1234-1111-5678-2222":
                responseJsonFile = "ho_api_get_by_search_params_200_main_applicant_name_and_dob_match_3980.json";
                break;
            case "1234-1111-5678-3333":
                responseJsonFile = "ho_api_get_by_search_params_200_main_applicant_name_match_3980.json";
                break;
            case "1234-1111-5678-1212":
                responseJsonFile = "ho_api_get_by_search_params_200_main_applicant_by_date.json";
                break;
            case "020639760": // CID reference response
                responseJsonFile = "ho-api_get-by-serach-params_200_valid-response-020639760.json";
                break;
            case "020651434": // CID reference - not Asylum case response
                responseJsonFile = "ho_api_get-by-search-params_200_no-data-found-uan-ref.json";
                break;
            case "1212-0099-0029-3029": // Valid UAN - no data found
                responseJsonFile = "ho_api_get-by-search-params_200_no-data-found-uan-ref.json";
                break;
            case "123123123": // Valid CID - no data found
                responseJsonFile = "ho_api_get-by-search-params_200_no-data-found-uan-ref.json";
                break;
                //Added for HMCTS testing only in format X00000000
            case "X00001010":
                responseJsonFile = "ho_api_get-by-search-params_200_no-appellant-found-1010.json";
                break;
            case "X00001020":
            case "4545-0000-0100-1006":
                responseJsonFile = "ho_api_get-by-search-params_200_no-ho-reference-data-found-1020.json";
                break;
            case "X00001060":
            case "1212/009900362015":
                responseJsonFile = "ho_api_get-by-search-params_200_invalid-format-1060.json";
                break;
            case "X00001111": //1 valid application status but no main applicant
                responseJsonFile = "ho-api_get-by-serach-params_200_valid-no-main-applicant-response-1111.json";
                break;
            case "X00002222": //2 valid application status but no main applicant
                responseJsonFile = "ho-api_get-by-search-params_200-valid-no-main-applicant-response-2222.json";
                break;
            case "X00002000":
            case "X00001070":
            case "X00002010":
            case "X00001040":
                responseJsonFile = "ho_api_get-by-search-params_200_error-response.json";
                break;
            default:
                responseJsonFile = "ho-api_get-by-serach-params_200_valid-response-default.json";
                break;
        }

        ClassPathResource resource = new ClassPathResource(responseJsonFile, ApplicationStatusApi.class.getClassLoader());
        InputStream inputStream = resource.getInputStream();

        String data = null;
        try
        {
            byte[] bdata = FileCopyUtils.copyToByteArray(inputStream);
            data = new String(bdata, StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return data;
    }
}
