package com.pulse1.repository;

import com.pulse1.model.FirstAid;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FirstAidRepository extends MongoRepository<FirstAid, String> {}