/**
 * ContohVariabelNoAbsen
 */
public class ContohVariabel17 {
    public static void main(String[] args) {

    //Syntax
    String salahSatuHobySayaAdalah = "Bermain petak umpet";
    boolean isPandai = true;
    char jenisKelamin = 'L';
    byte _umurSayaSekarang = 20;
    double $ipk = 3.24, tinggi = 1.78;

    //Output
    System.out.println(salahSatuHobySayaAdalah);
    System.out.println("Apakah Pandai? " + isPandai);
    System.out.println("Jenis Kelamin : " + jenisKelamin);
    System.out.println("Umurku Saat Ini : " + _umurSayaSekarang);
    System.out.println(String.format("Saya ber-IPK %s, dengan tinggi badan %s", $ipk, tinggi));

    }
}