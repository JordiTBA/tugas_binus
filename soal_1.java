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
        System.out.println("=== Data Mahasiswa ===");
        
        Mahasiswa mhs1 = new Mahasiswa("Andi Pratama", "2440001", "Teknik Informatika", 3.75);
        Mahasiswa mhs2 = new Mahasiswa("Budi Santoso", "2440002", "Sistem Informasi", 3.40);
        Mahasiswa mhs3 = new Mahasiswa("Citra Lestari", "2440003", "Teknik Informatika", 3.90);
        Mahasiswa mhs4 = new Mahasiswa("Joni Suhartono", "2440004", "Teknik Industri", 3.00);
        Mahasiswa mhs5 = new Mahasiswa("Bulan Suci", "2440005", "Akuntansi", 3.20);

        mhs1.tampilkanInfo();
        mhs2.tampilkanInfo();
        mhs3.tampilkanInfo();
        mhs4.tampilkanInfo();
        mhs5.tampilkanInfo();
    }
}
