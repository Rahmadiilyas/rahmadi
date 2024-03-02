
package tugaspbo;

import java.util.Arrays;

public class no10 {
    public static void main(String[] args) {
       
        // charAt(int index): Mengembalikan karakter pada posisi index tertentu dalam string.
        String str = "Halo";
        char ch = str.charAt(1);
        System.out.println("Karakter pada indeks 1: " + ch);

        // compareTo(String anotherString): Membandingkan dua string berdasarkan urutan leksikal.
        int compareResult = str.compareTo("halo");
        System.out.println("Bandingkan dengan 'halo': " + compareResult);

        // compareToIgnoreCase(String str): Membandingkan dua string tanpa memperhatikan case (huruf besar/kecil).
        int ignoreCaseResult = str.compareToIgnoreCase("HALO");
        System.out.println("Bandingkan dengan 'HALO' (abaikan case): " + ignoreCaseResult);

        // concat(String str): Menggabungkan dua string.
        String concatStr = str.concat(" Dunia");
        System.out.println("String yang digabungkan: " + concatStr);

        // contains(CharSequence s): Memeriksa apakah string mengandung subsequence tertentu.
        boolean containsResult = str.contains("al");
        System.out.println("Mengandung 'al': " + containsResult);

        // copyValueOf(char[] data): Membuat string dari array karakter.
        String copyStr = String.copyValueOf(new char[] {'H', 'i'});
        System.out.println("Salinan dari array: " + copyStr);

        // equals(Object anObject): Memeriksa apakah dua string memiliki nilai yang sama.
        boolean equalsResult = str.equals("Halo");
        System.out.println("Sama dengan 'Halo': " + equalsResult);

        // equalsIgnoreCase(String anotherString): Memeriksa apakah dua string memiliki nilai yang sama tanpa memperhatikan case.
        boolean equalsIgnoreCaseResult = str.equalsIgnoreCase("HALO");
        System.out.println("Sama dengan 'HALO' (abaikan case): " + equalsIgnoreCaseResult);

        // format(String format, Object... args): Memformat string menggunakan format tertentu.
        String formattedStr = String.format("Halo, %s!", "Dunia");
        System.out.println("String yang diformat: " + formattedStr);

        // hashCode(): Mengembalikan nilai hash code dari string.
        int hashCode = str.hashCode();
        System.out.println("Nilai hash: " + hashCode);

        // indexOf(int ch): Mengembalikan indeks dari karakter tertentu dalam string.
        int indexOfChar = str.indexOf('a');
        System.out.println("Indeks 'a': " + indexOfChar);

        // isBlank(): Memeriksa apakah string kosong atau hanya berisi whitespace.
        String blankStr = "    ";
        boolean isBlankResult = blankStr.isBlank();
        System.out.println("Kosong: " + isBlankResult);

        // length(): Mengembalikan panjang string.
        int length = str.length();
        System.out.println("Panjang: " + length);

        // lines(): Mengembalikan stream dari baris dalam string.
        String multilineStr = "Halo\nDunia";
        multilineStr.lines().forEach(System.out::println);

        // matches(String regex): Memeriksa apakah string cocok dengan ekspresi regular tertentu.
        boolean matchesResult = str.matches("Ha.*");
        System.out.println("Cocok dengan regex 'Ha.*': " + matchesResult);

        // repeat(int count): Mengulangi string sebanyak count kali.
        String repeatedStr = str.repeat(3);
        System.out.println("String yang diulang: " + repeatedStr);

        // replace(char oldChar, char newChar): Mengganti semua kemunculan karakter lama dengan karakter baru.
        String replacedStr = str.replace('l', 'w');
        System.out.println("String yang diganti: " + replacedStr);

        // replaceAll(String regex, String replacement): Mengganti semua substring yang cocok dengan ekspresi regular dengan string pengganti.
        String replacedAllStr = str.replaceAll("[aeiou]", "*");
        System.out.println("Semua vokal diganti: " + replacedAllStr);

        // replaceFirst(String regex, String replacement): Mengganti substring pertama yang cocok dengan ekspresi regular dengan string pengganti.
        String replaceFirstStr = str.replaceFirst("[aeiou]", "*");
        System.out.println("Vokal pertama diganti: " + replaceFirstStr);

        // split(String regex): Memisahkan string menjadi array substring berdasarkan ekspresi regular.
        String[] splitStr = str.split("l");
        System.out.println("String yang dipisah: " + Arrays.toString(splitStr));

        // substring(int beginIndex): Mengembalikan substring mulai dari indeks tertentu hingga akhir string.
        String subStr1 = str.substring(2);
        System.out.println("Substring dari indeks 2: " + subStr1);

        // substring(int beginIndex, int endIndex): Mengembalikan substring dari indeks mulai hingga indeks akhir - 1.
        String subStr2 = str.substring(1, 4);
        System.out.println("Substring dari indeks 1 hingga 4: " + subStr2);

        // toCharArray(): Mengembalikan array karakter dari string.
        char[] charArray = str.toCharArray();
        System.out.println("Array karakter: " + Arrays.toString(charArray));

        // toLowerCase(): Mengubah semua karakter menjadi huruf kecil.
        String lowerCaseStr = str.toLowerCase();
        System.out.println("String menjadi huruf kecil: " + lowerCaseStr);

        // toString(): Mengembalikan representasi string dari objek.
        String stringRepresentation = str.toString();
        System.out.println("Representasi string: " + stringRepresentation);

        // toUpperCase(): Mengubah semua karakter menjadi huruf besar.
        String upperCaseStr = str.toUpperCase();
        System.out.println("String menjadi huruf besar: " + upperCaseStr);

        // trim(): Menghapus spasi di awal dan akhir string.
        String trimmedStr = "   Halo   ";
        System.out.println("String yang di-trim: '" + trimmedStr.trim() + "'");

        // valueOf(primitive data type): Mengkonversi tipe data primitif menjadi string.
        String valueOfInt = String.valueOf(123);
        String valueOfDouble = String.valueOf(3.14);
        String valueOfBoolean = String.valueOf(true);
        System.out.println("Nilai dari integer: " + valueOfInt);
        System.out.println("Nilai dari double: " + valueOfDouble);
        System.out.println("Nilai dari boolean: " + valueOfBoolean);
    }
}


