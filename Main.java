import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

        // SOAL 1: Membuat 5 objek mahasiswa
        Mahasiswa[] daftar = {
                new Mahasiswa("Asep Nugraha", "2440001", "Teknik Informatika", 3.75),
                new Mahasiswa("Dede Supriatna", "2440002", "Sistem Informasi", 3.40),
                new Mahasiswa("Cecep Ramdani", "2440003", "Teknik Informatika", 3.90),
                new Mahasiswa("Ujang Suryana", "2440004", "Teknik Industri", 2.90),
                new Mahasiswa("Eneng Nurhayati", "2440005", "Akuntansi", 3.20)
        };

        int pilihan;

        do {

            System.out.println("=== Sistem Data Mahasiswa ===");
            System.out.println("1. Tampilkan Data Mahasiswa (Soal 1)");
            System.out.println("2. Update IPK Mahasiswa (Soal 2)");
            System.out.println("3. Lihat Predikat Akademik (Soal 3)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.println("\n=== Data Mahasiswa ===\n");

                    for (Mahasiswa m : daftar) {
                        m.tampilkanInfo();
                    }
                    break;

                case 2:
                    System.out.print("\nMasukkan NIM mahasiswa yang ingin diupdate: ");
                    String nimCari = input.nextLine();

                    System.out.print("Masukkan IPK baru: ");
                    double ipkBaru = input.nextDouble();

                    boolean ditemukan = false;

                    for (Mahasiswa m : daftar) {

                        if (m.getNim().equals(nimCari)) {

                            m.updateIpk(ipkBaru);

                            System.out.println("\nData berhasil diperbarui!\n");
                            m.tampilkanInfo();

                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Mahasiswa tidak ditemukan.");
                    }

                    break;

                case 3:

                    System.out.println("\n=== Predikat Akademik Mahasiswa ===\n");

                    for (Mahasiswa m : daftar) {
                        m.tampilkanInfo();
                    }

                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");

            }

        } while (pilihan != 4);
    }
        input.close();
    }
}
