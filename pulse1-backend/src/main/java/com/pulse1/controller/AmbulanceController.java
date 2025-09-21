package com.pulse1.controller;

import com.pulse1.model.Ambulance;
import com.pulse1.service.AmbulanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/ambulance")
@CrossOrigin(origins = "*") // allow frontend to call
public class AmbulanceController {

    private final AmbulanceService service;

    public AmbulanceController(AmbulanceService service) {
        this.service = service;
    }

    // POST: Book an ambulance
    @PostMapping("/book")
    public ResponseEntity<?> book(@RequestBody Ambulance a) {
        try {
            Ambulance saved = service.book(a);
            return ResponseEntity.status(HttpStatus.CREATED).body(saved);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Booking failed: " + e.getMessage());
        }
    }

    // GET: Check status of a booking by ID
    @GetMapping("/status/{id}")
    public ResponseEntity<?> status(@PathVariable String id) {
        try {
            Optional<Ambulance> result = service.status(id);
            if (result.isPresent()) {
                return ResponseEntity.ok(result.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body("Booking not found for ID: " + id);
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error fetching status: " + e.getMessage());
        }
    }

    // GET: Fetch all bookings
    @GetMapping("/all")
    public ResponseEntity<?> all() {
        try {
            List<Ambulance> list = service.all();
            return ResponseEntity.ok(list);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error fetching bookings: " + e.getMessage());
        }
    }
}
