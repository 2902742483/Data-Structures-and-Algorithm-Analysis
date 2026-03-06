// Class Mahasiswa
class Mahasiswa {

    // atribut mahasiswa (encapsulation)
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // constructor untuk mengisi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("IPK     : " + ipk);
        System.out.println();
    }
}