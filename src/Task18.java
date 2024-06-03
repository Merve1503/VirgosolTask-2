import java.util.Scanner;

public class Task18 {

    /*
    18. Bir Astronom, gezegenleri sınıflandırmak için bir program geliştirmek istiyor.
    Kullanıcıdan girilen gezegen adıyla gezegenin iç gezegen mi yoksa dış gezegen mi olduğunu belirlemesi gerekiyor. Astronomun bu programı yazmasına yardımcı olun.

	Not1: İÇ GEZEGENLER --> Merkür, Venüs, Dünya ve Mars.
		  DIŞ GEZEGENLER --> Jüpiter, Satürn, Uranüs ve Neptün
	Not2: Switch-case kullanarak yazınız.

    Örnek Girdi:
    Bir gezegen adı giriniz: Dünya

    Örnek Çıktı:
    İç gezegen
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gezegen adını girmesini istiyoruz
        System.out.print("Bir gezegen adı giriniz: ");
        String gezegenAdi = scanner.nextLine();

        // Gezegenin türünü belirliyoruz
        String gezegenTuru;

        // Switch-case yapısı ile gezegenin türünü kontrol ediyoruz
        switch (gezegenAdi) {
            case "Merkür":
            case "Venüs":
            case "Dünya":
            case "Mars":
                gezegenTuru = "İç gezegen";
                break;
            case "Jüpiter":
            case "Satürn":
            case "Uranüs":
            case "Neptün":
                gezegenTuru = "Dış gezegen";
                break;
            default:
                gezegenTuru = "Bilinmeyen gezegen";
        }

        // Gezegen türünü ekrana yazdırıyoruz
        System.out.println(gezegenTuru);

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
