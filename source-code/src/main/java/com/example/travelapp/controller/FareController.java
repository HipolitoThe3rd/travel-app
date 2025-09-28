package com.example.travelapp.controller;

import com.example.travelapp.service.FareCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/fare")
public class FareController {

    @Autowired
    private FareCalculationService fareCalculationService;

    @GetMapping("/calculate")
    @ResponseBody
    public String calculateFare(@RequestParam double distance, @RequestParam String cabType) {
        double fare = fareCalculationService.calculateFare(distance, cabType);
        return "<html>" +
                "<head><title>Fare Result</title></head>" +
                "<body>" +
                "<h3>Estimated Fare: $" + fare + "</h3>" +
                "<a href='/calculate-fare.html'>Calculate Again</a>" +
                "</br>" + 
                "<a href='/index.html'>Home</a>" +
                "</body>" +
                "</html>";
    }
}
