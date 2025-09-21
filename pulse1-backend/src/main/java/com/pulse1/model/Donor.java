package com.pulse1.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data @NoArgsConstructor @AllArgsConstructor
@Document(collection = "donors")
public class Donor {
    @Id private String id;
    private String name;
    private String bloodGroup;
    private String contact;
    private String location; // "lat,lng"
}