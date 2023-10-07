
package perhitunganpenghasilan;
import java.util.Scanner;
public class PerhitunganPenghasilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan gaji anda = Rp ");
        double gaji = input.nextDouble();
        double penghasilan = input.nextDouble();
        if (gaji < 3000000){
            penghasilan = gaji;
            System.out.println("diskon 0%");
        }else if (gaji > 3000000 && gaji <4000000){
            penghasilan = gaji - (gaji*0.05);
            System.out.println("diskon 5%");
        }else if (gaji >= 4000000){
            penghasilan = gaji - (gaji*0.1);
            System.out.println("diskon 10%");
        }
        System.out.print("gaji bersih = Rp " + penghasilan);
        }
        
}

    
    

