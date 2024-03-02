
package tugaspbo;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Luas dan Keliling Bangun Datar");
        System.out.println("Pilih bangun datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Jajar Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Layang-layang");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Lingkaran");
        System.out.print("Masukkan pilihan Anda: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungPersegi();
                break;
            case 2:
                hitungPersegiPanjang();
                break;
            case 3:
                hitungSegitiga();
                break;
            case 4:
                hitungJajarGenjang();
                break;
            case 5:
                hitungTrapesium();
                break;
            case 6:
                hitungLayangLayang();
                break;
            case 7:
                hitungBelahKetupat();
                break;
            case 8:
                hitungLingkaran();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    static void hitungPersegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi: ");
        double sisi = scanner.nextDouble();

        double luas = sisi * sisi;
        double keliling = 4 * sisi;

        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }

    static void hitungPersegiPanjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan panjang: ");
        double panjang = scanner.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = scanner.nextDouble();

        double luas = panjang * lebar;
        double keliling = 2 * (panjang + lebar);

        System.out.println("Luas persegi panjang: " + luas);
        System.out.println("Keliling persegi panjang: " + keliling);
    }

    static void hitungSegitiga() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan sisi 1: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        double sisi2 = scanner.nextDouble();
        System.out.print("Masukkan sisi 3: ");
        double sisi3 = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;
        double keliling = sisi1 + sisi2 + sisi3;

        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }

    static void hitungJajarGenjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas: ");
        double alas = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan sisi 1: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        double sisi2 = scanner.nextDouble();

        double luas = alas * tinggi;
        double keliling = 2 * (sisi1 + sisi2);

        System.out.println("Luas jajar genjang: " + luas);
        System.out.println("Keliling jajar genjang: " + keliling);
    }

    static void hitungTrapesium() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan alas atas: ");
        double alasAtas = scanner.nextDouble();
        System.out.print("Masukkan alas bawah: ");
        double alasBawah = scanner.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = scanner.nextDouble();
        System.out.print("Masukkan sisi 1: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        double sisi2 = scanner.nextDouble();

        double luas = 0.5 * (alasAtas + alasBawah) * tinggi;
        double keliling = alasAtas + alasBawah + sisi1 + sisi2;

        System.out.println("Luas trapesium: " + luas);
        System.out.println("Keliling trapesium: " + keliling);
    }

    static void hitungLayangLayang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan diagonal 1: ");
        double diagonal1 = scanner.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        double diagonal2 = scanner.nextDouble();
        System.out.print("Masukkan sisi 1: ");
        double sisi1 = scanner.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        double sisi2 = scanner.nextDouble();

        double luas = 0.5 * diagonal1 * diagonal2;
        double keliling = 2 * (sisi1 + sisi2);

        System.out.println("Luas layang-layang: " + luas);
        System.out.println("Keliling layang-layang: " + keliling);
    }

    static void hitungBelahKetupat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan diagonal 1: ");
        double diagonal1 = scanner.nextDouble();
        System.out.print("Masukkan diagonal 2: ");
        double diagonal2 = scanner.nextDouble();
        System.out.print("Masukkan sisi: ");
        double sisi = scanner.nextDouble();

        double luas = 0.5 * diagonal1 * diagonal2;
        double keliling = 4 * sisi;

        System.out.println("Luas belah ketupat: " + luas);
        System.out.println("Keliling belah ketupat: " + keliling);
    }

    static void hitungLingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran: ");
        double jariJari = scanner.nextDouble();

        double luas = Math.PI * jariJari * jariJari;
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
}

    

