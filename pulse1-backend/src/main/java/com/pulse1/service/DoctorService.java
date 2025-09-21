package com.pulse1.service;

import com.pulse1.model.Doctor;
import com.pulse1.repository.DoctorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository repo;
    public DoctorService(DoctorRepository repo) { this.repo = repo; }
    public Doctor add(Doctor d) { return repo.save(d); }
    public List<Doctor> all() { return repo.findAll(); }
}