class Mahasiswa {

    // ===============================
    // SOAL 1: Atribut Mahasiswa
    // ===============================
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk; // SOAL 2: Encapsulation (private)

    // ===============================
    // SOAL 1: Constructor
    // ===============================
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // ===============================
    // SOAL 2: Getter & Setter IPK
    // ===============================
    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method update IPK
    public void updateIpk(double ipkBaru) {
        this.ipk = ipkBaru;
    }

    // ===============================
    // SOAL 2: Cek Kelulusan
    // ===============================
    public String cekKelulusan() {
        if (ipk >= 3.00) {
            return "Lulus";
        } else {
            return "Belum Lulus";
        }
    }

    // ===============================
    // SOAL 3: Predikat Akademik
    // ===============================
    public String hitungPredikat() {

        if (ipk >= 3.75) {
            return "Dengan Pujian";
        } else if (ipk >= 3.50) {
            return "Sangat Memuaskan";
        } else if (ipk >= 3.00) {
            return "Memuaskan";
        } else {
            return "Perlu Perbaikan";
        }
    }

    // ===============================
    // SOAL 1: Tampilkan Data
    // ===============================
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
        System.out.println("Status  : " + cekKelulusan());
        System.out.println("Predikat: " + hitungPredikat());
        System.out.println();
    }

    public String getNim() {
        return nim;
    }
}
