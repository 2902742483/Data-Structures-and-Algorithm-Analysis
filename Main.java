public class Main {

    public static void main(String[] args) {

        System.out.println("=== Data Mahasiswa ===\n");

        // membuat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("Asep Nugraha", "2440001", "Teknik Informatika", 3.75);
        Mahasiswa m2 = new Mahasiswa("Dede Supriatna", "2440002", "Sistem Informasi", 3.40);
        Mahasiswa m3 = new Mahasiswa("Cecep Ramdani", "2440003", "Teknik Informatika", 3.90);
        Mahasiswa m4 = new Mahasiswa("Ujang Suryana", "2440004", "Teknik Industri", 3.00);
        Mahasiswa m5 = new Mahasiswa("Eneng Nurhayati", "2440005", "Akuntansi", 3.20);

        // menyimpan ke dalam array
        Mahasiswa[] daftarMahasiswa = {m1, m2, m3, m4, m5};

        // menampilkan semua data mahasiswa menggunakan loop
        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanInfo();
        }
    }
}