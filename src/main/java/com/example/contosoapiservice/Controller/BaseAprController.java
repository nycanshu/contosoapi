package com.example.contosoapiservice.Controller;

import com.example.contosoapiservice.Model.AprModel;
import com.example.contosoapiservice.Service.BaseAprService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BaseAprController {

    @Autowired
    private BaseAprService baseAprService;

    // Change the method to accept baseApr in the JSON body
    @PutMapping("/setbaseapr")
    public ResponseEntity<AprModel> setBaseAprValue(@RequestBody AprModel aprModel) {
        baseAprService.setBaseAprValue(aprModel.getBaseApr());
        System.out.println("Base APR is set to: " + aprModel.getBaseApr());
        return ResponseEntity.ok(aprModel);
    }

    @GetMapping("/getbaseapr")
    public ResponseEntity<AprModel> getBaseAprValue() {
        AprModel aprModel = new AprModel();
        aprModel.setBaseApr(baseAprService.getBaseAprValue());
        System.out.println("Base APR is: " + aprModel.getBaseApr());
        return ResponseEntity.ok(aprModel);
    }
}
