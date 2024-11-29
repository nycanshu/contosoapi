package com.example.contosoapiservice.Controller;


import com.example.contosoapiservice.Model.RiskScoreRequest;
import com.example.contosoapiservice.Model.RiskScoreResponse;
import com.example.contosoapiservice.Service.RiskScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RiskScoreController {

    @Autowired
    private RiskScoreService riskScoreService;

    @PostMapping("/getriskscore")
    public ResponseEntity<RiskScoreResponse> generateRiskScore(@RequestBody RiskScoreRequest request) {

      if(request.getSSN() == null || request.getSSN().isEmpty()) {
          return ResponseEntity.badRequest().build();
      }

      //return invalid SSN value if SSN is not 9 characters long
      if(request.getSSN().length() != 9) {
          return ResponseEntity.badRequest().build();
      }


      //generating risk score
        int riskScore = riskScoreService.generateRiskScore(request.getSSN());
        RiskScoreResponse response = new RiskScoreResponse();
        response.setSSN(request.getSSN());
        response.setRiskScore(riskScore);
        System.out.println("Risk Score is set to : " + riskScore);
        return ResponseEntity.ok(response);
    }

}
