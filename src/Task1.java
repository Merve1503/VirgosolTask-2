import java.util.Scanner;

public class Task1 {

    /*
    1. Kullanıcıdan bir tam sayı girmesini isteyen ve eğer sayı negatif ise "Sayı negatiftir" mesajını yazdıran programı yazınız.

    Örnek Girdi:
    Bir tam sayı giriniz: -5

    Örnek Çıktı:
    Sayı negatiftir
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bir tam sayı girmesini söyleyen mesajı yazdırıyoruz
        System.out.print("Bir tam sayı giriniz: ");

        // Kullanıcının girdiği tam sayıyı alıyoruz
        int sayi = scanner.nextInt();

        // Sayının negatif olup olmadığını kontrol ediyoruz
        if (sayi < 0) {
            // Sayı negatif ise mesajı yazdırıyoruz
            System.out.println("Sayı negatiftir");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }

}
