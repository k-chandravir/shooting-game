package com.training.shootinggame;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.security.Provider;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ShootingController.class)
public class ShootingControllerTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ShootingService shootingService;
    @Test
    void shouldGetInitialHeroHealthAsHundred() throws Exception{
        Mockito.when(shootingService.getHeroHealth()).thenReturn(100);

        mockMvc.perform(MockMvcRequestBuilders.get("/getHeroHealth"))
                .andExpect(status().isOk());
    }
}
