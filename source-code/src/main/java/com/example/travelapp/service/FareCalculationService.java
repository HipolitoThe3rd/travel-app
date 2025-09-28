package com.example.travelapp.service;

import org.springframework.stereotype.Service;

@Service
public class FareCalculationService {

    public double calculateFare(double distance, String cabType) {
        double baseFare = 3.0; // base fare
        double perKmRate;

        switch (cabType.toLowerCase()) {
            case "sedan":
                perKmRate = 2.5;
                break;
            case "suv":
                perKmRate = 3.5;
                break;
            case "compact":
                perKmRate = 2.0;
                break;
            default:
                perKmRate = 2.5;
        }

        return baseFare + (distance * perKmRate);
    }
}
