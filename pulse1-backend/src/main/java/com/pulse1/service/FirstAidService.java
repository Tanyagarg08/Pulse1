package com.pulse1.service;

import com.pulse1.model.FirstAid;
import com.pulse1.repository.FirstAidRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FirstAidService {
    private final FirstAidRepository repo;
    public FirstAidService(FirstAidRepository repo) { this.repo = repo; }
    public FirstAid add(FirstAid f) { return repo.save(f); }
    public List<FirstAid> all() { return repo.findAll(); }
}