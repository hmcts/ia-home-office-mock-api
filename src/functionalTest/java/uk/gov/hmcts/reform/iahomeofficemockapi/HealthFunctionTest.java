package uk.gov.hmcts.reform.iahomeofficemockapi;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import uk.gov.hmcts.reform.iahomeofficemockapi.generated.infrastructure.api.invoker.OpenAPI2SpringBoot;

@SpringBootTest(classes = {
    OpenAPI2SpringBoot.class
})
@ActiveProfiles("functional")
@AutoConfigureMockMvc(addFilters = false)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HealthFunctionTest {

    @Value("${targetInstance}") private String targetInstance;

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = targetInstance;
        RestAssured.useRelaxedHTTPSValidation();
    }

    @Test
    public void should_allow_unauthenticated_requests_to_welcome_message_and_return_200_response_code()
        throws Exception {

        final Response response = SerenityRest
            .given()
            .relaxedHTTPSValidation()
            .when()
            .get("/health");

        assertThat(allStatusesUp(response.getBody().asString()));
        response
            .then()
            .statusCode(HttpStatus.OK.value())
            .contentType(MediaType.APPLICATION_JSON_VALUE);
    }

    private static boolean allStatusesUp(String json) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(json);

        return "UP".equals(root.path("status").asText())
            && "UP".equals(root.path("components").path("diskSpace").path("status").asText())
            && "UP".equals(root.path("components").path("ping").path("status").asText())
            && "UP".equals(root.path("components").path("refreshScope").path("status").asText());
    }
}
