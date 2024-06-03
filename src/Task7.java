import java.util.Scanner;

public class Task7 {

    /*
    7. Kullanıcıdan bir tam sayı girmesini isteyen ve bu sayının pozitif, negatif veya sıfır olduğunu belirten programı yazınız.

    Örnek Girdi:
    Bir tam sayı giriniz: 0

    Örnek Çıktı:
    Sayı sıfırdır
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bir tam sayı girmesi için bir mesaj yazdırıyoruz
        System.out.print("Bir tam sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Sayının pozitif, negatif veya sıfır olduğunu kontrol ediyoruz
        if (sayi > 0) {
            System.out.println("Sayı pozitiftir");
        } else if (sayi < 0) {
            System.out.println("Sayı negatiftir");
        } else {
            System.out.println("Sayı sıfırdır");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
