import java.util.Scanner;

public class Segitiga17 {
    public static void main(String[] args) {
        
        // Deklarasi Scanner
        Scanner sc = new Scanner (System.in);
        
        // Deklarasi Variabel
        int alas, tinggi;
        float luas;

        // Syntax input
        System.out.println("Masukkan alas: ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt();

        // Syntax untuk menghitung luas segitiga
        luas = alas* tinggi / 2;
        System.out.println("Luas Segitiga: " + luas);
    }
}
