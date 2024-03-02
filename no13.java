
package tugaspbo;
import java.util.Scanner;
public class no13 {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);

        
        String kalimat = scanner.nextLine();

        String kalimatTerkriptografi = kriptografi(kalimat);

        System.out.println(kalimatTerkriptografi);

        scanner.close();
    }

    static String kriptografi(String kalimat) {
        StringBuilder hasil = new StringBuilder();

        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);

            // Memeriksa apakah karakter adalah huruf vocal
            if (isVokal(karakter)) {
                // Mengubah huruf vocal sesuai format yang diberikan
                switch (karakter) {
                    case 'a':
                        hasil.append("ava");
                        break;
                    case 'i':
                        hasil.append("ivi");
                        break;
                    case 'u':
                        hasil.append("uvu");
                        break;
                    case 'e':
                        hasil.append("eve");
                        break;
                    case 'o':
                        hasil.append("ovo");
                        break;
                }
            } else {
                // Menambahkan karakter ke hasil jika bukan huruf vocal
                hasil.append(karakter);
            }
        }

        return hasil.toString();
    }

    static boolean isVokal(char karakter) {
        // Memeriksa apakah karakter adalah huruf vocal
        return karakter == 'a' || karakter == 'i' || karakter == 'u' || karakter == 'e' || karakter == 'o' ||
                karakter == 'A' || karakter == 'I' || karakter == 'U' || karakter == 'E' || karakter == 'O';
    }
}

    

