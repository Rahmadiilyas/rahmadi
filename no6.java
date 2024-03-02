
package tugaspbo;

import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println("Nilai MIN: " + min);
        System.out.println("Nilai MAX: " + max);

    }
}

  
