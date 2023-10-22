package dialermotor;
import java.util.Scanner;
public class DIALERMOTOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga = 0,unit,diskon,pilihan = 0;
        String nama = null;
        System.out.println("\tDaftar Harga Motor Honda di Dialer Wono");
        System.out.println("=======================================================");
        System.out.println("1. Supra\n2. Scoopy Cbs\n3. Scoopy Iss\n4. Vario 125 Cbs\n5. Aerox Iss\n6. Nmax iss");
        System.out.print("Masukkan Pilihan : ");
        pilihan = input.nextInt();
        System.out.print("Jumlah Unit : ");
        unit = input.nextInt();
        
        if (pilihan == 1){
            nama = "Supra";
            harga = 17000*unit;
        }else if (pilihan == 2){
            nama = "Scoopy Cbs";
            harga = 21000*unit;
        }else if (pilihan == 3){
            nama = "Scoopy Iss";
            harga = 22000*unit;
        }else if (pilihan == 4){
            nama = "Vario 125 Cbs";
            harga = 23420*unit;
        }else if (pilihan == 5){
            nama = "Aerox Iss";
            harga = 26000*unit;
        }else if (pilihan == 6){
            nama = "Nmax Iss";
            harga = 27000*unit;



            }
        System.out.println("=======================================================");
        System.out.println("Motor Pilihan Anda : "+nama);
        System.out.println("Total Harga : Rp. "+ harga+"000");
        }
        
    }
    

