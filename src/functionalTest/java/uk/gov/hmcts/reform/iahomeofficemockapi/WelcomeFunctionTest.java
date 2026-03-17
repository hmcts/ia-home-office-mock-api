package uk.gov.hmcts.reform.iahomeofficemockapi;

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

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.is;

@SpringBootTest(classes = {
    OpenAPI2SpringBoot.class
})
@ActiveProfiles("functional")
@AutoConfigureMockMvc(addFilters = false)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WelcomeFunctionTest {

    @Value("${targetInstance}") private String targetInstance;

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = targetInstance;
        RestAssured.useRelaxedHTTPSValidation();
    }

    @Test
    public void should_allow_unauthenticated_requests_to_welcome_message_and_return_200_response_code() {

        final String expected = "Welcome to Home Office API";

        final Response response1 = SerenityRest
            .given()
            .relaxedHTTPSValidation()
            .when()
            .get("/");

        response1
            .then()
            .statusCode(HttpStatus.OK.value())
            .contentType(MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
            .body(is(expected));
    }

}
