package com.pulse1.service;

import com.pulse1.model.Appointment;
import com.pulse1.repository.AppointmentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository repo;
    public AppointmentService(AppointmentRepository repo) { this.repo = repo; }
    public Appointment book(Appointment a) { a.setStatus("BOOKED"); return repo.save(a); }
    public List<Appointment> all() { return repo.findAll(); }
}