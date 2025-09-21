package com.pulse1.service;

import com.pulse1.model.Ambulance;
import com.pulse1.repository.AmbulanceRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AmbulanceService {
    private final AmbulanceRepository repo;
    public AmbulanceService(AmbulanceRepository repo) { this.repo = repo; }
    public Ambulance book(Ambulance a) { a.setStatus("ON_TRIP"); return repo.save(a); }
    public Optional<Ambulance> status(String id) { return repo.findById(id); }
    public List<Ambulance> all() { return repo.findAll(); }
}