package com.pulse1.controller;

import com.pulse1.model.Medicine;
import com.pulse1.service.MedicineService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
@CrossOrigin(origins = "*")
public class MedicineController {
    private final MedicineService service;
    public MedicineController(MedicineService service) { this.service = service; }
    @GetMapping public List<Medicine> all() { return service.getAll(); }
    @PostMapping public Medicine add(@RequestBody Medicine m) { return service.add(m); }
}