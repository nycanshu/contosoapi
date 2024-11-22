package com.example.contosoapiservice.Service;


import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RiskScoreService {

    public int generateRiskScore(String SSN) {
        Random random = new Random();
        return random.nextInt(100)+1;
    }
}
