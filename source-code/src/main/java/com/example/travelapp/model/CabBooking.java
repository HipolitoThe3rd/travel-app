package com.example.travelapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cabbookings")
public class CabBooking {

    @Id
    private String id;

    private String fromLocation;
    private String toLocation;
    private String cabType;
    private String customerName;

    // Default constructor
    public CabBooking() {
    }

    // Parameterized constructor
    public CabBooking(String fromLocation, String toLocation, String cabType, String customerName) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.cabType = cabType;
        this.customerName = customerName;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getCabType() {
        return cabType;
    }

    public void setCabType(String cabType) {
        this.cabType = cabType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "CabBooking{" +
                "id='" + id + '\'' +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", cabType='" + cabType + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}
