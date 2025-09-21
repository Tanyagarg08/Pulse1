package com.pulse1.repository;

import com.pulse1.model.Donor;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface DonorRepository extends MongoRepository<Donor, String> {
    List<Donor> findByBloodGroup(String bloodGroup);
}