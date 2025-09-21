package com.pulse1.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "appointments")
public class Appointment {
    @Id 
    private String id;
    private String doctorId;
    private String patientId;
    private String datetime;
    private String status; // BOOKED/COMPLETED/CANCELLED

    // ✅ Manual Getters and Setters as fallback if Lombok fails
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getDoctorId() { return doctorId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }

    public String getPatientId() { return patientId; }
    public void setPatientId(String patientId) { this.patientId = patientId; }

    public String getDatetime() { return datetime; }
    public void setDatetime(String datetime) { this.datetime = datetime; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
