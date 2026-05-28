package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api;

import jakarta.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-05-28T10:55:26.076071+01:00[Europe/London]", comments = "Generator version: 7.20.0")
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
