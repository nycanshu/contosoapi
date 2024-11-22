package com.example.contosoapiservice.Model;

public class RiskScoreResponse {

        private String SSN;
        private int riskScore;

        public String getSSN() {
            return SSN;
        }

        public void setSSN(String SSN) {
            this.SSN = SSN;
        }

        public int getRiskScore() {
            return riskScore;
        }

        public void setRiskScore(int riskScore) {
            this.riskScore = riskScore;
        }
}
