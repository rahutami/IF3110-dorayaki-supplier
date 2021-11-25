package com.dorayakisupplier.model;

public class RequestDorayakiRequest {
    private int idDorayaki;
    private int amount;
    private String ipAddress;

    public int getIdDorayaki() {
        return idDorayaki;
    }

    public void setIdDorayaki(int idDorayaki) {
        this.idDorayaki = idDorayaki;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
