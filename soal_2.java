import java.util.Scanner;
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
        System.out.println(); 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        Mahasiswa[] daftarMahasiswa = {
            new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75),
            new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40),
            new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90),
            new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00),
            new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20)
        };

        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = scanner.nextLine();

        System.out.print("Masukkan IPK baru: ");
        double ipkBaru = scanner.nextDouble();
        System.out.println(); 

        boolean ditemukan = false;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.nim.equals(cariNim)) {
                mhs.updateIpk(ipkBaru);
                System.out.println("=== Data Mahasiswa ===");
                mhs.tampilkanInfo();
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
