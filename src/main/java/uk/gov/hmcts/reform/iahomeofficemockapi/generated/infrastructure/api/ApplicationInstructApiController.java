package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api;

import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.InstructErrorResponse;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.InstructMessage;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.domain.entities.InstructResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-24T17:52:14.183321Z[Europe/London]", comments = "Generator version: 7.20.0")
@Controller
@RequestMapping("${openapi.appealsInterface.base-path:/ichallenge}")
public class ApplicationInstructApiController implements ApplicationInstructApi {

    private final NativeWebRequest request;

    @Autowired
    public ApplicationInstructApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
