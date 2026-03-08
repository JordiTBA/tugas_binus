import java.util.Scanner;
import java.util.Locale;

class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
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
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Mahasiswa[] daftar = new Mahasiswa[5];
        
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("=== Data Mahasiswa ===");
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampilkanInfo();
        }

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = scanner.nextLine();

        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = scanner.nextDouble();
        System.out.println();

        boolean ditemukan = false;
        
        for (int i = 0; i < daftar.length; i++) {
            if (daftar[i].getNim().equals(cariNim)) {
                daftar[i].updateIpk(ipkBaru);
                System.out.println("=== Data Mahasiswa ===");
                daftar[i].tampilkanInfo();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM " + cariNim + " tidak ditemukan.");
        }

        scanner.close();
    }
}
