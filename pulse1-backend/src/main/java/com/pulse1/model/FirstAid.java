package com.pulse1.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Data @NoArgsConstructor @AllArgsConstructor
@Document(collection = "firstaid")
public class FirstAid {
    @Id private String id;
    private String topic;
    private List<String> steps;
}