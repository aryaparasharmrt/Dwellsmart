package com.example.calculater.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdd() throws Exception {
        int num1 = 5;
        int num2 = 3;
        System.out.println("Printing value"+num1+num2);
        MvcResult result = mockMvc.perform(post("/numbers/add")
                        .param("num1", String.valueOf(num1))
                        .param("num2", String.valueOf(num2)))
                .andExpect(status().isOk())
                .andReturn();

        int response = Integer.parseInt(result.getResponse().getContentAsString());
        assertEquals(8, response, "The sum should be 8");
    }

    @Test
    public void testSubtract() throws Exception {
        int num1 = 5;
        int num2 = 3;

        MvcResult result = mockMvc.perform(post("/numbers/subtract")
                        .param("num1", String.valueOf(num1))
                        .param("num2", String.valueOf(num2)))
                .andExpect(status().isOk())
                .andReturn();

        int response = Integer.parseInt(result.getResponse().getContentAsString());
        assertEquals(2, response, "The difference should be 2");
    }
}

