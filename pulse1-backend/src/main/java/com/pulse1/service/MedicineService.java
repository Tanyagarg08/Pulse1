package com.pulse1.service;

import com.pulse1.model.Medicine;
import com.pulse1.repository.MedicineRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicineService {
    private final MedicineRepository repo;
    public MedicineService(MedicineRepository repo) { this.repo = repo; }
    public List<Medicine> getAll() { return repo.findAll(); }
    public Medicine add(Medicine m) { return repo.save(m); }
}