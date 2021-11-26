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
