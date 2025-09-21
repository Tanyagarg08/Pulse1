package com.pulse1.repository;

import com.pulse1.model.Ambulance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AmbulanceRepository extends MongoRepository<Ambulance, String> {}