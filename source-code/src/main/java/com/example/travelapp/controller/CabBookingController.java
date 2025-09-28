package com.example.travelapp.controller;

import com.example.travelapp.model.CabBooking;
import com.example.travelapp.repository.CabBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cab")
public class CabBookingController {

    @Autowired
    private CabBookingRepository repository;

    @PostMapping("/book")
    @ResponseBody
    public String bookCab(@ModelAttribute CabBooking booking) {
        try {
            CabBooking savedBooking = repository.save(booking);
            
            return "<html>" +
                   "<head><title>Booking Result</title></head>" +
                   "<body>" +
                   "<h3>Cab booking successful with ID: " + savedBooking.getId() + "</h3>" +
                   "<a href='/'>Return to Home</a>" +
                   "</body>" +
                   "</html>";
        } catch (Exception e) {
            return "<html>" +
                   "<head><title>Booking Result</title></head>" +
                   "<body>" +
                   "<h3>Error saving booking: " + e.getMessage() + "</h3>" +
                   "<a href='/'>Return to Home</a>" +
                   "</body>" +
                   "</html>";
        }
    }


    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @GetMapping("/book-cab.html")
    public ModelAndView bookCabPage() {
        return new ModelAndView("book-cab.html");
    }
}
