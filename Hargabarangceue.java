
package hargabarangceue;
import java.util.Scanner;
public class Hargabarangceue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga = 0,pilihan,unit;
        String Barang = null;
        System.out.println("Harga barang Ceue");
        System.out.println("===================");
        System.out.println("1. spring bed\n2. boneka\n3. bantal");
        System.out.print("Pilihan : ");
        pilihan = input.nextDouble();
        System.out.print("Masukkan Jumlah unit/barang : ");
        unit = input.nextDouble();
        
        if (pilihan == 1){
            Barang = "Spring bed";
            harga = 2000*unit;
        }else if (pilihan == 2){
            Barang = "Boneka";
            harga = 1000*unit;
        }else if (pilihan == 3){
            Barang = "bantal";
            harga = 500*unit;
            
        }
        System.out.println("Barang yang anda pilih : " + Barang);
        System.out.println("Total harga : Rp. "+ harga);
    }
    
}
