package com.example.travelapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.travelapp.model.CabBooking;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(CabBookingController.class)
public class CabBookingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testBookCab() throws Exception {
        CabBooking booking = new CabBooking("Home", "Airport", "Sedan", "Alice");
        mockMvc.perform(post("/cab/book")
                .contentType("application/json")
                .content(objectMapper.writeValueAsString(booking)))
            .andExpect(status().isCreated());
    }
}
