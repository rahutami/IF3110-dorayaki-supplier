package com.dorayakisupplier.model;

public class RequestDorayaki {
    private int idDorayaki;
    private int amount;
    private String ipAddress;

    public RequestDorayaki(int idDorayaki, int amount, String ipAddress) {
        this.idDorayaki = idDorayaki;
        this.amount = amount;
        this.ipAddress = ipAddress;
    }

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

    @Override
    public String toString() {
        return "RequestDorayaki{" +
                "idDorayaki=" + idDorayaki +
                ", amount=" + amount +
                ", ipAddress='" + ipAddress + '\'' +
                '}';
    }
}
