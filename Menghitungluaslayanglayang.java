package luaslayanglayang;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang diagonal 1: ");
        double diagonal1 = input.nextDouble();

        System.out.print("Masukkan panjang diagonal 2: ");
        double diagonal2 = input.nextDouble();

        // Menghitung luas layang-layang
        double luasLayangLayang = 0.5 * diagonal1 * diagonal2;

        System.out.println("Luas layang-layang adalah: " + luasLayangLayang);
    }


    


    }
    
