package com.pulse1.service;

import com.pulse1.model.Donor;
import com.pulse1.repository.DonorRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DonorService {
    private final DonorRepository repo;
    public DonorService(DonorRepository repo) { this.repo = repo; }
    public Donor register(Donor d) { return repo.save(d); }
    public List<Donor> findByGroup(String g) { return repo.findByBloodGroup(g); }
}