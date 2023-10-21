package menentukanzodiak;
import java.util.Scanner;
public class MenentukanZodiak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tanggal,bulan;
        System.out.println("\tMenentukan zodiak");
        System.out.println("=================================");
        System.out.print("Masukkan Tanggal lahir Anda : ");
        tanggal = input.nextInt();
        System.out.print("Masukkan Bulan lahir Anda : ");
        bulan = input.nextInt();
        
        if (tanggal > 32 || bulan > 12){
            System.out.println("Tanggal/bulan tidak Valid");
        }else {
            if (tanggal >= 21 && bulan == 3 || tanggal <= 19 && bulan == 4){
                System.out.println("Zodiak anda : Aries ");
            }else if (tanggal >= 20 && bulan == 4 || tanggal <= 20 && bulan == 5){
                System.out.println("Zodiak anda : Taurus ");
            }else if (tanggal >= 21 && bulan == 5 || tanggal <= 20 && bulan == 6){
                System.out.println("Zodiak anda : Gemini ");
            }else if (tanggal >= 21 && bulan == 6 || tanggal <= 22 && bulan == 7){
                System.out.println("Zodiak anda : Cancer ");
            }else if (tanggal >= 23 && bulan == 7 || tanggal <= 22 && bulan == 8){
                System.out.println("Zodiak anda : Leo ");
            }else if (tanggal >= 23 && bulan == 8 || tanggal <= 22 && bulan == 9){
                System.out.println("Zodiak anda : Virgo ");
            }else if (tanggal >= 23 && bulan == 9 || tanggal <= 22 && bulan == 10){
                System.out.println("Zodiak anda : Libra ");
            }else if (tanggal >= 23 && bulan == 10 || tanggal <= 21 && bulan == 11){
                System.out.println("Zodiak anda : Scorpio ");
            }else if (tanggal >= 22 && bulan == 11 || tanggal <= 21 && bulan == 12){
                System.out.println("Zodiak anda : Sagitarius ");
            }else if (tanggal >= 22 && bulan == 12 || tanggal <= 19 && bulan == 1){
                System.out.println("Zodiak anda : Capricornus ");
            }else if (tanggal >= 20 && bulan == 1 || tanggal <= 18 && bulan == 2){
                System.out.println("Zodiak anda : Aquarius ");
            }else if (tanggal >= 19 && bulan == 2 || tanggal <= 20 && bulan == 3){
                System.out.println("Zodiak anda : Pisces ");
            }
        }
    }
    
}
