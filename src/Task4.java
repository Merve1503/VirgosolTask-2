import java.util.Scanner;

public class Task4 {

    /*
    4. Kullanıcıdan bir üçgenin kenar uzunluklarını girmesini isteyen ve bu üçgenin eşkenar olup olmadığını belirleyen programı yazınız.

    Örnek Girdi:
    Birinci kenar uzunluğunu giriniz: 5
    İkinci kenar uzunluğunu giriniz: 5
    Üçüncü kenar uzunluğunu giriniz: 5

    Örnek Çıktı:
    Bu üçgen eşkenar üçgendir
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya birinci kenar uzunluğunu girmesi için bir mesaj yazdırıyoruz
        System.out.print("Birinci kenar uzunluğunu giriniz: ");
        int kenar1 = scanner.nextInt();

        // Kullanıcıya ikinci kenar uzunluğunu girmesi için bir mesaj yazdırıyoruz
        System.out.print("İkinci kenar uzunluğunu giriniz: ");
        int kenar2 = scanner.nextInt();

        // Kullanıcıya üçüncü kenar uzunluğunu girmesi için bir mesaj yazdırıyoruz
        System.out.print("Üçüncü kenar uzunluğunu giriniz: ");
        int kenar3 = scanner.nextInt();

        // Üç kenarın uzunluğunu karşılaştırarak eşkenar olup olmadığını kontrol ediyoruz
        if (kenar1 == kenar2 && kenar2 == kenar3) {
            System.out.println("Bu üçgen eşkenar üçgendir");
        } else {
            System.out.println("Bu üçgen eşkenar üçgen değildir");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
