
package tugaspbo;

import java.util.Scanner;

public class no11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai m: ");
        int m = scanner.nextInt();

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }
        System.out.print("Barisan bilangan: ");
        for (int i = m + 1; i < n; i++) {
            System.out.print(i);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}


 
