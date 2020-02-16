package com.pablos.psfttapigateway.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class HealthCheck {
    private String applicationName;
    private String httpStatusName;
    private int httpStatusCode;
}
