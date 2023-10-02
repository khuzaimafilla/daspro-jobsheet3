import java.util.Scanner;

public class Bank17 {
    public static void main(String[] args) {

        // Deklarasi Scanner
        Scanner input = new Scanner (System.in);

        // Deklarasi Variabel
        int jml_tabungan_awal, lama_menabung;
        double presentase_bunga = 0.02, bunga, jml_tabungan_akhir;

        // Syntax input
        System.out.println("Masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextInt();
        System.out.println("Masukkan lama menabung anda");
        lama_menabung = input.nextInt();

        // Syntax untuk menghitung bunga
        bunga = lama_menabung * presentase_bunga * jml_tabungan_awal;

        // Syntax untuk menghitung jumlah tabungan akhir
        jml_tabungan_akhir = bunga + jml_tabungan_awal;

        // Menampilkan isi variabel bunga dan jml_tabungan_akhir
        System.out.println("Bunga adalah : " + bunga);
        System.out.println("JUmlah tabungan akhir anda adalah : " + jml_tabungan_akhir);
        

        
    }
}
