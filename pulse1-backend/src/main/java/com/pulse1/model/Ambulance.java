package com.pulse1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ambulances")
public class Ambulance {
    @Id
    private String id;
    private String driverName;
    private String currentLocation;
    private String status; // AVAILABLE/ON_TRIP

    // ✅ Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }

    public String getCurrentLocation() { return currentLocation; }
    public void setCurrentLocation(String currentLocation) { this.currentLocation = currentLocation; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
