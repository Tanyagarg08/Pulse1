package com.pulse1.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @NoArgsConstructor @AllArgsConstructor
@Document(collection = "doctors")
public class Doctor {
    @Id private String id;
    private String name;
    private String specialty;
    private String contact;
}