import java.util.Locale;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    private double ipk; 

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void cekKelulusan() {
        if (this.ipk >= 3.00) {
            System.out.println("Status: Lulus");
        } else {
            System.out.println("Status: Belum Lulus");
        }
    }

    public void hitungPredikat() {
        if (this.ipk >= 3.75) {
            System.out.println("Predikat: Dengan Pujian");
        } else if (this.ipk >= 3.50) { 
            System.out.println("Predikat: Sangat Memuaskan");
        } else if (this.ipk >= 3.00) {
            System.out.println("Predikat: Memuaskan");
        } else {
            System.out.println("Predikat: Perlu Perbaikan");
        }
    }

    public void updateIpk(double ipkBaru) {
        setIpk(ipkBaru);
        System.out.println("Data berhasil diperbarui!\n");
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf(Locale.US, "IPK: %.2f\n", ipk);
        cekKelulusan(); 
        hitungPredikat();
        System.out.println(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        
        System.out.println("=== Data Mahasiswa ===");
        mhs.tampilkanInfo();
    }
}
