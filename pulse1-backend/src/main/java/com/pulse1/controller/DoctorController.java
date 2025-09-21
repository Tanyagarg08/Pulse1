package com.pulse1.controller;

import com.pulse1.model.Doctor;
import com.pulse1.service.DoctorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@CrossOrigin(origins = "*")
public class DoctorController {
    private final DoctorService service;
    public DoctorController(DoctorService service) { this.service = service; }
    @GetMapping public List<Doctor> all() { return service.all(); }
    @PostMapping public Doctor add(@RequestBody Doctor d) { return service.add(d); }
}