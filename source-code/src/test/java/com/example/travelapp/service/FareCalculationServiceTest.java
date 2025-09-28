package com.example.travelapp.service;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FareCalculationServiceTest {

    private FareCalculationService fareCalculationService;

    @BeforeEach
    public void setUp() {
        fareCalculationService = new FareCalculationService();
    }
    
    @Test
    public void testCalculateFareSedan() {
        double fare = fareCalculationService.calculateFare(10, "Sedan");
        assertEquals(28.0, fare, "Fare should be base + 10 * sedan rate");
    }

    @Test
    public void testCalculateFareSUV() {
        double fare = fareCalculationService.calculateFare(5, "SUV");
        assertEquals(20.5, fare, "Fare should calculated correctly for SUV");
    }

    @Test
    public void testCalculateFareUnknownCabType() {
        double fare = fareCalculationService.calculateFare(7, "Unknown");
        assertEquals(20.5, fare, "Default per km rate should be used");
    }
}
