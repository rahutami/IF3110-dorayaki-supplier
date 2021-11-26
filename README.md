# Dorayaki-Supplier

SOAP


## Deskripsi singkat
Dorayaki-Supplier merupakan web service yang bertugas sebagai interface antara backend pabrik dengan toko dorayaki. Web service ini dibuat menggunakan Java JAX-WS.
## Skema basis data yang digunakan
Skema basisdata yang digunakan terdapat pada file pabrik.sql

## How to run
```
mvn clean install
mvn tomcat7:run
```

## Pembagian Tugas
REST (Backend)
1. Database Pabrik: 13519040
2. Autentikasi Pengguna: 13518108, 13519192
3. Pengelolaan Request Penambahan Stok: 13519040
4. Manajemen Resep: 13518108, 13519040
5. Manajemen Bahan Baku: 13519192
6. Notifikasi Email: 13519192

SOAP
1. Melakukan request pengiriman dorayaki (penambahan stok): 13519192
2. Membaca status request pengiriman yang dilakukan toko tersebut: 13519192
3. Membaca varian dorayaki yang disediakan pabrik: 13519040

NodeJS (Frontend)
1. Perubahan Halaman Edit Stok Toko: 13519192
2. Perubahan Halaman Create Dorayaki di Toko: 13519040
3. Halaman Login dan Register di Pabrik: 13519040
4. Halaman Resep di Pabrik: 13518108, 13519040
5. Halaman Bahan Baku di Pabrik: 13519192
6. Halaman Daftar Request di Pabrik: 13519040

Bonus: Tidak dikerjakan