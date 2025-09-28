package com.example.travelapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.travelapp.model.CabBooking;

public interface CabBookingRepository extends MongoRepository<CabBooking, String> {
}
