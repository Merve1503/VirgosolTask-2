import java.util.Scanner;

public class Task8 {

    /*
    8. Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının 3 ve 5 ile bölünebilir olup olmadığını belirten programı yazınız.

    Örnek Girdi:
    Bir tam sayı giriniz: 15

    Örnek Çıktı:
    Sayı hem 3 hem de 5 ile bölünebilir
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bir tam sayı girmesi için bir mesaj yazdırıyoruz
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Sayının 3 ve 5 ile bölünebilir olup olmadığını kontrol ediyoruz
        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Sayı hem 3 hem de 5 ile bölünebilir");
        } else if (sayi % 3 == 0) {
            System.out.println("Sayı sadece 3 ile bölünebilir");
        } else if (sayi % 5 == 0) {
            System.out.println("Sayı sadece 5 ile bölünebilir");
        } else {
            System.out.println("Sayı ne 3 ne de 5 ile bölünebilir");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
