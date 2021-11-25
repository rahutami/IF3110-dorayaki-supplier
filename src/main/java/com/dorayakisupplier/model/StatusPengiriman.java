package com.dorayakisupplier.model;

import java.time.LocalDateTime;

public class StatusPengiriman {
    private int id;
    private int idDorayaki;
    private String namaDorayaki;
    private int amount;
    private LocalDateTime timestamp;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDorayaki() {
        return idDorayaki;
    }

    public void setIdDorayaki(int idDorayaki) {
        this.idDorayaki = idDorayaki;
    }

    public String getNamaDorayaki() {
        return namaDorayaki;
    }

    public void setNamaDorayaki(String namaDorayaki) {
        this.namaDorayaki = namaDorayaki;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
