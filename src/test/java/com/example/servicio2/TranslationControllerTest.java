package com.example.servicio2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
public class TranslationControllerTest {

    private MockMvc mockMvc;

    @Test
    void testTranslation() throws Exception {
        mockMvc.perform(get("/translate")
                        .param("text", "Hello")
                        .param("lang", "es"))
                .andExpect(status().isOk());
    }
}