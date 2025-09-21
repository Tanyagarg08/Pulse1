package com.pulse1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/api/ai")
@CrossOrigin(origins = "*")
public class AiController {

    @PostMapping("/symptom-checker")
    public ResponseEntity<?> symptomChecker(@RequestBody Map<String,Object> body) {
        // Placeholder: forward to ML service in production
        return ResponseEntity.ok(Map.of("possibleConditions", new String[]{ "Common Cold", "Fever" }));
    }

    @PostMapping("/medicine-checker")
    public ResponseEntity<?> medicineChecker(@RequestBody Map<String,Object> body) {
        // Placeholder: simple safety check mock
        return ResponseEntity.ok(Map.of("safe", true, "notes", "No obvious interactions"));
    }
}