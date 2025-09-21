package com.pulse1.controller;

import com.pulse1.model.Appointment;
import com.pulse1.service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "*")
public class AppointmentController {
    private final AppointmentService service;
    public AppointmentController(AppointmentService service) { this.service = service; }
    @GetMapping public List<Appointment> all() { return service.all(); }
    @PostMapping public Appointment book(@RequestBody Appointment a) { return service.book(a); }
}