package com.pulse1.controller;

import com.pulse1.model.FirstAid;
import com.pulse1.service.FirstAidService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/firstaid")
@CrossOrigin(origins = "*")
public class FirstAidController {
    private final FirstAidService service;
    public FirstAidController(FirstAidService service) { this.service = service; }
    @GetMapping public List<FirstAid> all() { return service.all(); }
    @PostMapping public FirstAid add(@RequestBody FirstAid f) { return service.add(f); }
}