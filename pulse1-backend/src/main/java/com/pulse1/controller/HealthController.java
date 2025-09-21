package com.pulse1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/api/health/ping")
    public String ping() { return "✅ Backend is running!"; }
}