package latihanperulangann;
import java.util.Scanner;
public class LatihanPerulangann {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int awal,akhir;
        System.out.println("Bilangan ganjil");
        System.out.print("Masukkan bilangann awal : ");
        awal = input.nextInt();
        System.out.print("Masukkan bilangan akhir : ");
        akhir = input.nextInt();
        
        for (int a = awal; a <= akhir; a++){
           int hasil = a%2;
            if(hasil == 1){
                System.out.print(a+" ");
            }
        
    }
     
    }
}
    
    

