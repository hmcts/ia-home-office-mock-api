package uk.gov.hmcts.reform.iahomeofficemockapi.infrastructure.controllers;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MvcResult;
import uk.gov.hmcts.reform.iahomeofficemockapi.infrastructure.testutils.SpringBootIntegrationTest;

public class GetWelcomeTest extends SpringBootIntegrationTest {

    @Test
    public void welcomeRootEndpoint() throws Exception {
        MvcResult response = mockMvc.perform(get("/")).andExpect(status().is3xxRedirection()).andReturn();
        assertThat(response.getResponse().getContentAsString()).startsWith("");
    }
}
