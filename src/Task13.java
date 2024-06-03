import java.util.Scanner;

public class Task13 {

    /*
    13. Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin pozisyonunu bulan bir program yazınız.

	Örnek Girdi:
	Bir metin giriniz: Merhaba Dünya
	Aranacak karakter: a

	Örnek Çıktı:
	Karakter 'a' 4. pozisyonda bulunuyor.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir metin girmesini istiyoruz
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        // Kullanıcıdan aranacak karakteri girmesini istiyoruz
        System.out.print("Aranacak karakter: ");
        char arananKarakter = scanner.next().charAt(0);

        // Metindeki karakterin pozisyonunu buluyoruz
        int pozisyon = metin.indexOf(arananKarakter);

        // Karakterin pozisyonunu kontrol ediyoruz ve uygun mesajı yazdırıyoruz
        if (pozisyon != -1) {
            System.out.println("Karakter '" + arananKarakter + "' " + (pozisyon + 1) + ". pozisyonda bulunuyor.");
        } else {
            System.out.println("Karakter '" + arananKarakter + "' metinde bulunamadı.");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();
    }
}
