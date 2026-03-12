package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-11T18:43:20.015892Z[Europe/London]")

@Controller
@RequestMapping("${openapi.appealsInterface.base-path:/v1}")
public class ApplicationInstructApiController implements ApplicationInstructApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ApplicationInstructApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
