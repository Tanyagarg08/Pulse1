package com.pulse1.controller;

import com.pulse1.model.Donor;
import com.pulse1.service.DonorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donors")
@CrossOrigin(origins = "*")
public class DonorController {
    private final DonorService service;
    public DonorController(DonorService service) { this.service = service; }
    @PostMapping("/register") public Donor register(@RequestBody Donor d) { return service.register(d); }
    @GetMapping public List<Donor> byGroup(@RequestParam(required = false) String bloodGroup) {
        if (bloodGroup == null) return service.findByGroup("");
        return service.findByGroup(bloodGroup);
    }
}