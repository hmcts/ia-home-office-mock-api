package uk.gov.hmcts.reform.iahomeofficemockapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.ActiveProfiles;
import uk.gov.hmcts.reform.iahomeofficemockapi.infrastructure.controllers.WelcomeController;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = WelcomeController.class)
@ActiveProfiles("functional")
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
            .when()
            .get("/welcome");

        String response = response1
            .then()
            .statusCode(HttpStatus.OK.value())
            .and()
            .extract()
            .body()
            .asString();

        assertThat(response.contains(expected));
    }

}
