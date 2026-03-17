package uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-03-16T15:17:31.480240Z[Europe/London]")
@Controller
@RequestMapping("${openapi.appealsInterface.base-path:}")
public class ApplicationsApiController implements ApplicationsApi {

    private final NativeWebRequest request;

    @Autowired
    public ApplicationsApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
