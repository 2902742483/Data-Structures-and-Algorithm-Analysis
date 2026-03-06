# Tugas Personal Assignment - OOP Java

## 👨‍🎓 Identitas Mahasiswa
- **Nama:** Indra Koesumah
- **NIM:** 2902742483
- **Mata Kuliah:** Data Structures & Algorithm

## 📝 Deskripsi Program
Project ini adalah implementasi konsep *Object-Oriented Programming* (OOP) dasar menggunakan bahasa Java. Program ini mensimulasikan sistem sederhana untuk mengelola dan menampilkan data akademik mahasiswa.

Terdapat dua class utama dalam project ini:
1. `Mahasiswa.java`: Berfungsi sebagai *blueprint* (model) yang mendefinisikan atribut (nama, nim, jurusan, ipk) dengan konsep *Encapsulation* (private modifier & Getter/Setter), serta memuat *method* untuk logika bisnis (cek kelulusan & hitung predikat).
2. `Main.java`: Berfungsi sebagai *driver class* yang memuat fungsi `main` untuk berinteraksi dengan user melalui *Console/Terminal* (menu interaktif dengan `Scanner`).

## 🚀 Fitur Program
Sesuai dengan instruksi soal tugas, program ini memiliki fitur:
1. **Tampilkan Data Mahasiswa (Soal 1):** Menginstansiasi 5 objek mahasiswa ke dalam *Array* dan menampilkan detail datanya.
2. **Update IPK (Soal 2):** Mencari mahasiswa berdasarkan input NIM, lalu memperbarui nilai IPK menggunakan method *Setter*.
3. **Lihat Predikat Akademik (Soal 3):** Menampilkan status kelulusan (Lulus/Belum Lulus) dan predikat akademik (Dengan Pujian, Sangat Memuaskan, Memuaskan, Perlu Perbaikan) berdasarkan IPK terbaru.
