import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // SOAL 1 & PANDUAN: Membuat 5 objek mahasiswa ke dalam array
        Mahasiswa[] daftar = {
                new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75),
                new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40),
                new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90),
                new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00),
                new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20)
        };

        int pilihan;

        // Loop untuk menu interaktif
        do {
            System.out.println("=== Sistem Data Mahasiswa ===");
            System.out.println("1. Tampilkan Data Mahasiswa (Menjawab Soal 1 & 3)");
            System.out.println("2. Update IPK Mahasiswa (Menjawab Soal 2)");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan karakter newline (enter)

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Data Mahasiswa ===\n");
                    // PANDUAN: Gunakan loop untuk menampilkan seluruh data
                    for (Mahasiswa m : daftar) {
                        m.tampilkanInfo();
                    }
                    break;

                case 2:
                    System.out.print("\nMasukkan NIM mahasiswa yang ingin diupdate: ");
                    String nimCari = input.nextLine();

                    System.out.print("Masukkan IPK baru: ");
                    // Mengambil input IPK sebagai string lalu dikonversi ke double untuk mencegah error Locale
                    double ipkBaru = Double.parseDouble(input.nextLine());

                    boolean ditemukan = false;
                    for (Mahasiswa m : daftar) {
                        if (m.getNim().equals(nimCari)) {
                            m.updateIpk(ipkBaru);
                            System.out.println("\nData berhasil diperbarui!\n");
                            System.out.println("=== Data Mahasiswa ===");
                            m.tampilkanInfo();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Mahasiswa dengan NIM tersebut tidak ditemukan.\n");
                    }
                    break;

                case 3:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);

        input.close();
    }
}
