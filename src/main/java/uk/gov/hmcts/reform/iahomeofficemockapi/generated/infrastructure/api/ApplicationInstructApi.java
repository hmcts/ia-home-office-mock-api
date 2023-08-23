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
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.InstructMessage;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.InstructResponse;

import javax.validation.Valid;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@javax.annotation.Generated(value = "org.openapitools.responseCodegen.languages.SpringresponseCodegen", date = "2020-07-01T14:15:45.837+01:00[Europe/London]")
@Validated
@Tag(name = "applicationInstruct", description = "the applicationInstruct API")
public interface ApplicationInstructApi {

    static final Logger log = LoggerFactory.getLogger(ApplicationInstructApi.class);

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /applicationInstruct/setInstruct : Instructs Home Office downstream systems. Note: Use of the term &#39;instruct&#39; avoids any confusion with existing business terms, such as &#39;notification&#39; and &#39;direction&#39;, which are not overly descriptive to the Home Office.
     *
     * @param bearerToken  (required)
     * @param instructMessage  (required)
     * @return OK (status responseCode 200)
     *         or Invalid status value (status responseCode 400)
     */
    @Operation(summary = "Instructs Home Office downstream systems. Note: Use of the term 'instruct' avoids any confusion with existing business terms, such as 'notification' and 'direction', which are not overly descriptive to the Home Office.", operationId = "applicationInstructSetInstructPost", tags = {})
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "OK"),
        @ApiResponse(responseCode = "400", description = "Invalid status value")})
    @RequestMapping(value = "/applicationInstruct/setInstruct",
        produces = {"application/json"},
        consumes = {"application/json"},
        method = RequestMethod.POST)
    default ResponseEntity<InstructResponse> applicationInstructSetInstructPost(
        @Parameter(required = true) @Valid @RequestHeader(HttpHeaders.AUTHORIZATION) String bearerToken,
        @Parameter(required = true) @Valid @RequestBody InstructMessage instructMessage
    ) {

        final Optional<NativeWebRequest> nativeWebRequest = getRequest();

        log.info("/applicationStatus/getBySearchParameters nativeWebRequest->return mock response");

        final NativeWebRequest request = nativeWebRequest.get();

        log.info("/applicationStatus/getBySearchParameters nativeWebRequest->return mock response");

        final String documentReference = instructMessage.getHoReference();

        if (documentReference.equalsIgnoreCase("000000400")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        if (documentReference.equalsIgnoreCase("000000503")) {
            return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
        }

        if (documentReference.equalsIgnoreCase("000000500")) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        String responseJson = null;
        try {
            responseJson = getResponseJson(documentReference);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String exampleString = "";
        ApiUtil.setExampleResponse(request, "application/json", responseJson);

        if (documentReference.equalsIgnoreCase("X00001040")) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(HttpStatus.OK);

    }

    @NotNull
    private String getResponseJson(String homeOfficeReference) throws IOException {

        String responseJsonFile;

        switch (homeOfficeReference) {

            case "X00001040":
                responseJsonFile = "ho-api_instruct-response_500_error-response.json";
                break;
            default:
                responseJsonFile = "ho-api_instruct-response_200_valid-response-default.json";
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
