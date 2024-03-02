
package tugaspbo;
import java.util.Scanner;
public class no4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Debit Air");
        System.out.print("Masukkan luas permukaan (m^2): ");
        double luasPermukaan = scanner.nextDouble();
        System.out.print("Masukkan kecepatan aliran air (m/s): ");
        double kecepatanAir = scanner.nextDouble();

        double debitAir = luasPermukaan * kecepatanAir;

        System.out.println("Debit air adalah: " + debitAir + " m^3/s");

        
    }
}

