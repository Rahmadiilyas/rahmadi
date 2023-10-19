package menumakanan;
import java.util.Scanner;
public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga = 0,harga1,porsi,pilih;
        String menu = null;
        System.out.println(">>>>>>>Warung Rahmadi<<<<<<<");
        System.out.println("Daftar Menu :\n1.Bakso\n2.Gado-Gado\n3.Mie Ayam\n4.Ayam Geprek");
        System.out.print("Pilih : ");
        pilih = input.nextDouble();
        System.out.print("Masukkan Jumlah Porsi : ");
        porsi = input.nextDouble();
        
        if (pilih==1){
            menu = "Bakso";
            harga = 10000;
        }else if (pilih==2){
            menu = "Gado-Gado";
            harga = 11000;
        }else if (pilih==3){
            menu = "Mie Ayam";
            harga = 12000;
        }else if (pilih==4){
            menu = "Ayam Geprek";
            harga = 11000;
            
        }
        System.out.println("Menu Yang Dipilih : "+ menu);
        System.out.println("Total Harga : "+ harga*porsi);
  }
}
    


  
    

