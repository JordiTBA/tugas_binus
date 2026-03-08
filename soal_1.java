import java.util.Locale;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.printf(Locale.US, "IPK: %.2f\n", ipk);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] daftar = new Mahasiswa[5];
        
        daftar[0] = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        daftar[1] = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        daftar[2] = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        daftar[3] = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        daftar[4] = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        System.out.println("=== Data Mahasiswa ===\n");
        
        for (int i = 0; i < daftar.length; i++) {
            daftar[i].tampilkanInfo();
        }
    }
}
