import java.util.Scanner;

public class Task3 {

    /*
    3. Kullanıcıdan iki tam sayı girmesini isteyen ve bu sayıların çarpımını ekrana yazdıran programı yazınız.

    Örnek Girdi:
    İlk sayıyı giriniz: 4
    İkinci sayıyı giriniz: 5

    Örnek Çıktı:
    Sayıların çarpımı: 20
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya ilk tam sayıyı girmesi için bir mesaj yazdırıyoruz
        System.out.print("İlk sayıyı giriniz: ");
        int ilkSayi = scanner.nextInt();

        // Kullanıcıya ikinci tam sayıyı girmesi için bir mesaj yazdırıyoruz
        System.out.print("İkinci sayıyı giriniz: ");
        int ikinciSayi = scanner.nextInt();

        // İki sayının çarpımını hesaplıyoruz
        int carpim = ilkSayi * ikinciSayi;

        // Çarpımı ekrana yazdırıyoruz
        System.out.println("Sayıların çarpımı: " + carpim);

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
