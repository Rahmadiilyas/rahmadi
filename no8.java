
package tugaspbo;
import java.util.ArrayList;
import java.util.Scanner;

class MataKuliah {
    String nama;
    int sks;
    char nilai;

    public MataKuliah(String nama, int sks, char nilai) {
        this.nama = nama;
        this.sks = sks;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return "Mata Kuliah: " + nama + ", SKS: " + sks + ", Nilai: " + nilai;
    }
}

public class nomor8 {
    
 
    static ArrayList<MataKuliah> transkrip = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Transkrip Nilai ===");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Hapus Mata Kuliah");
            System.out.println("3. Tampilkan Transkrip");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    tambahMataKuliah();
                    break;
                case 2:
                    hapusMataKuliah();
                    break;
                case 3:
                    tampilkanTranskrip();
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    static void tambahMataKuliah() {
        System.out.print("Nama Mata Kuliah: ");
        String nama = scanner.nextLine();
        System.out.print("Jumlah SKS: ");
        int sks = scanner.nextInt();
        System.out.print("Nilai: ");
        char nilai = scanner.next().charAt(0);

        transkrip.add(new MataKuliah(nama, sks, nilai));
        System.out.println("Mata kuliah berhasil ditambahkan.");
    }

    static void hapusMataKuliah() {
        if (transkrip.isEmpty()) {
            System.out.println("Transkrip kosong.");
            return;
        }
        System.out.println("Pilih nomor mata kuliah yang akan dihapus:");
        for (int i = 0; i < transkrip.size(); i++) {
            System.out.println((i + 1) + ". " + transkrip.get(i));
        }
        int index = scanner.nextInt();
        if (index >= 1 && index <= transkrip.size()) {
            transkrip.remove(index - 1);
            System.out.println("Mata kuliah berhasil dihapus.");
        } else {
            System.out.println("Nomor mata kuliah tidak valid.");
        }
    }

    static void tampilkanTranskrip() {
        if (transkrip.isEmpty()) {
            System.out.println("Transkrip kosong.");
            return;
        }
        System.out.println("=== Transkrip Nilai ===");
        for (int i = 0; i < transkrip.size(); i++) {
            System.out.println((i + 1) + ". " + transkrip.get(i));
        }
    }
}

