package com.dorayakisupplier.model;

public class Request {
    private int id;
    private int idDorayaki;
    private int amount;
    private String status;
    private String nama;

    public Request(int idDorayaki, int id, int amount, String status, String nama) {
        this.idDorayaki = idDorayaki;
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.nama = nama;
    }
    public int getIdDorayaki() {
        return idDorayaki;
    }

    public void setIdDorayaki(int idDorayaki) {
        this.idDorayaki = idDorayaki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", idDorayaki=" + idDorayaki +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}
