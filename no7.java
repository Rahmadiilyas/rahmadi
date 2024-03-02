
package tugaspbo;
import java.util.Scanner;
public class no7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        System.out.print("Masukkan nilai c: ");
        int c = scanner.nextInt();
        System.out.print("Masukkan nilai d: ");
        int d = scanner.nextInt();
        System.out.print("Masukkan nilai e: ");
        int e = scanner.nextInt();

        int min = Math.min(Math.min(Math.min(Math.min(a, b), c), d), e);
        int max = Math.max(Math.max(Math.max(Math.max(a, b), c), d), e);

        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai MAX: " + max);

        
    }
}

 
