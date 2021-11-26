package com.dorayakisupplier.model;

public class Request {
    private int id;
    private int idDorayaki;
    private int amount;
    private String status;

    public Request(int idDorayaki, int id, int amount, String status) {
        this.idDorayaki = idDorayaki;
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
