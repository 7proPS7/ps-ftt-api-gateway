package com.pablos.psfttapigateway.monitoring;

import com.pablos.psfttapigateway.models.HealthCheck;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @Value("${ftt.application.name}")
    private String applicationName;

    @RequestMapping("/health")
    public HealthCheck health() {
        return new HealthCheck(applicationName, HttpStatus.OK.name(), HttpStatus.OK.value());
    }
}
