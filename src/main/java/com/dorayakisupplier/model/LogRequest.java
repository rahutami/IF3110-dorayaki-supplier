package com.dorayakisupplier.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LogRequest {
    private String ipAddress;
    private String endpoint;

    public LogRequest(String ipAddress, String endpoint) {
        this.ipAddress = ipAddress;
        this.endpoint = endpoint;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
