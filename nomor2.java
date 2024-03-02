
package tugaspbo;
// Kelas Segitiga
class Segitiga {
    // State (keadaan)
    double alas;
    double tinggi;
    double sisi1;
    double sisi2;
    double sisi3;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double alas, double tinggi, double sisi1, double sisi2, double sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    // Method untuk menghitung luas segitiga
    double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    // Method untuk menghitung keliling segitiga
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi 1: " + sisi1);
        System.out.println("Sisi 2: " + sisi2);
        System.out.println("Sisi 3: " + sisi3);
        System.out.println("");
    }
}

// Kelas PersegiPanjang
class PersegiPanjang {
    // State (keadaan)
    double panjang;
    double lebar;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas persegi panjang
    double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling persegi panjang
    double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("");
    }
}

// Kelas Persegi
class Persegi {
    // State (keadaan)
    double sisi;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double sisi) {
        this.sisi = sisi;
    }

    // Method untuk menghitung luas persegi
    double hitungLuas() {
        return sisi * sisi;
    }

    // Method untuk menghitung keliling persegi
    double hitungKeliling() {
        return 4 * sisi;
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        System.out.println("Sisi: " + sisi);
        System.out.println("");
    }
}

// Kelas Lingkaran
class Lingkaran {
    // State (keadaan)
    double jariJari;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas lingkaran
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }

    // Method untuk menghitung keliling lingkaran
    double hitungKeliling() {
        return 2 * Math.PI * jariJari;
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        System.out.println("Jari-jari: " + jariJari);
        System.out.println("");
    }
}

// Kelas JajarGenjang
class JajarGenjang {
    // State (keadaan)
    double alas;
    double tinggi;
    double sisi1;
    double sisi2;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double alas, double tinggi, double sisi1, double sisi2) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    // Method untuk menghitung luas jajar genjang
    double hitungLuas() {
        return alas * tinggi;
    }

    // Method untuk menghitung keliling jajar genjang
    double hitungKeliling() {
        return 2 * (sisi1 + sisi2);
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        System.out.println("Alas: " + alas);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi 1: " + sisi1);
        System.out.println("Sisi 2: " + sisi2);
        System.out.println("");
    }
}

// Kelas Trapesium
class Trapesium {
    // State (keadaan)
    double alasAtas;
    double alasBawah;
    double tinggi;
    double sisi1;
    double sisi2;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double alasAtas, double alasBawah, double tinggi, double sisi1, double sisi2) {
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    // Method untuk menghitung luas trapesium
    double hitungLuas() {
        return 0.5 * (alasAtas + alasBawah) * tinggi;
    }

    // Method untuk menghitung keliling trapesium
    double hitungKeliling() {
        return alasAtas + alasBawah + sisi1 + sisi2;
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        System.out.println("Alas Atas: " + alasAtas);
        System.out.println("Alas Bawah: " + alasBawah);
        System.out.println("Tinggi: " + tinggi);
        System.out.println("Sisi 1: " + sisi1);
        System.out.println("Sisi 2: " + sisi2);
        System.out.println("");
    }
}

// Kelas BelahKetupat
class BelahKetupat {
    // State (keadaan)
    double diagonal1;
    double diagonal2;
    double sisi;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double diagonal1, double diagonal2, double sisi) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }

    // Method untuk menghitung luas belah ketupat
    double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    // Method untuk menghitung keliling belah ketupat
    double hitungKeliling() {
        return 4 * sisi;
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
        System.out.println("Sisi: " + sisi);
        System.out.println("");
    }
}

// Kelas LayangLayang
class LayangLayang {
    // State (keadaan)
    double diagonal1;
    double diagonal2;
    double sisi1;
    double sisi2;

    // Method untuk men-set nilai variabel-variabel
    void setNilai(double diagonal1, double diagonal2, double sisi1, double sisi2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    // Method untuk menghitung luas layang-layang
    double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    // Method untuk menghitung keliling layang-layang
    double hitungKeliling() {
        return 2 * (sisi1 + sisi2);
    }

    // Method untuk menampilkan nilai variabel-variabel terkini
    void printState() {
        System.out.println("Diagonal 1: " + diagonal1);
        System.out.println("Diagonal 2: " + diagonal2);
        System.out.println("Sisi 1: " + sisi1);
        System.out.println("Sisi 2: " + sisi2);
        System.out.println("");
    }
}

// Kelas Main
public class nomor2 {
    public static void main(String[] args) {
        // Membuat objek untuk setiap kelas geometri
        Segitiga segitiga = new Segitiga();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        JajarGenjang jajarGenjang = new JajarGenjang();
        Trapesium trapesium = new Trapesium();
        BelahKetupat belahKetupat = new BelahKetupat();
        LayangLayang layangLayang = new LayangLayang();

        // Mengatur nilai variabel-variabel untuk setiap objek
        segitiga.setNilai(3, 4, 5, 4, 3);
        persegiPanjang.setNilai(6, 4);
        persegi.setNilai(5);
        lingkaran.setNilai(7);
        jajarGenjang.setNilai(6, 4, 5, 7);
        trapesium.setNilai(4, 8, 5, 6, 7);
        belahKetupat.setNilai(8, 6, 5);
        layangLayang.setNilai(10, 12, 6, 8);

        // Memanggil method untuk menampilkan nilai variabel-variabel terkini
        System.out.println("Segitiga:");
        segitiga.printState();
        System.out.println("Persegi Panjang:");
        persegiPanjang.printState();
        System.out.println("Persegi:");
        persegi.printState();
        System.out.println("Lingkaran:");
        lingkaran.printState();
        System.out.println("Jajar Genjang:");
        jajarGenjang.printState();
        System.out.println("Trapesium:");
        trapesium.printState();
        System.out.println("Belah Ketupat:");
        belahKetupat.printState();
        System.out.println("Layang-Layang:");
        layangLayang.printState();

        // Memanggil method untuk menghitung luas dan keliling
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());
        System.out.println("Luas Jajar Genjang: " + jajarGenjang.hitungLuas());
        System.out.println("Keliling Jajar Genjang: " + jajarGenjang.hitungKeliling());
        System.out.println("Luas Trapesium: " + trapesium.hitungLuas());
        System.out.println("Keliling Trapesium: " + trapesium.hitungKeliling());
        System.out.println("Luas Belah Ketupat: " + belahKetupat.hitungLuas());
        System.out.println("Keliling Belah Ketupat: " + belahKetupat.hitungKeliling());
        System.out.println("Luas Layang-Layang: " + layangLayang.hitungLuas());
        System.out.println("Keliling Layang-Layang: " + layangLayang.hitungKeliling());
    }
}


    

