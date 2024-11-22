package com.example.contosoapiservice.Service;

import org.springframework.stereotype.Service;

@Service
public class BaseAprService {

    private int baseAprValue = 5;

    public synchronized int getBaseAprValue() {
        return baseAprValue;
    }

    public synchronized void setBaseAprValue(int baseApr) {
        this.baseAprValue = baseApr;
    }
}
