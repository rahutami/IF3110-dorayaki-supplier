package com.dorayakisupplier.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class LogRequest {
    private String ipAddress;
    private Timestamp timestamp;
    private String endpoint;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
