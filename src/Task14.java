import java.util.Scanner;

public class Task14 {

    /*
    14. Kullanıcıdan iki kelime girmesini isteyen ve bu kelimelerin eşit olup olmadığını kontrol eden programı yazınız.

	Örnek Girdi:
	Birinci kelimeyi giriniz: Merhaba
	İkinci kelimeyi giriniz: Merhaba

	Örnek Çıktı:
	Kelimeler eşit.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan iki kelime girmesini istiyoruz
        System.out.print("Birinci kelimeyi giriniz: ");
        String kelime1 = scanner.nextLine();

        System.out.print("İkinci kelimeyi giriniz: ");
        String kelime2 = scanner.nextLine();

        // İki kelimenin eşit olup olmadığını kontrol ediyoruz
        if (kelime1.equals(kelime2)) {
            System.out.println("Kelimeler eşit.");
        } else {
            System.out.println("Kelimeler eşit değil.");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
