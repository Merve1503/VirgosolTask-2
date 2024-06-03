import java.util.Scanner;

public class Task17 {

    /*
    17. Bir tam sayının karesini ve küpünü hesaplayan bir Java programı yazınız.
    Program, girdiyi almalı ve çıktı olarak karesini ve küpünü göstermelidir.

    Örnek Girdi:
    Bir tam sayı giriniz: 3

    Örnek Çıktı:
    Karesi: 9
    Küpü: 27
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girmesini istiyoruz
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Sayının karesini ve küpünü hesaplıyoruz
        int kare = sayi * sayi;
        int kup = sayi * sayi * sayi;

        // Sonuçları ekrana yazdırıyoruz
        System.out.println("Karesi: " + kare);
        System.out.println("Küpü: " + kup);

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
