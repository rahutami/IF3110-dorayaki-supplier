package com.dorayakisupplier.model;

public class Variant {
    private int id;
    private String namaDorayaki;
    private String deskripsi;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaDorayaki() {
        return namaDorayaki;
    }

    public void setNamaDorayaki(String namaDorayaki) {
        this.namaDorayaki = namaDorayaki;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
