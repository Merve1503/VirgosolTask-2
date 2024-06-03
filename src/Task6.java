import java.util.Scanner;

public class Task6 {

    /*
    6. Kullanıcıdan bir cümle girmesini isteyen ve eğer cümlenin uzunluğu 50'den küçükse "Kısa bir cümle" mesajını yazdıran programı yazınız.

    Örnek Girdi:
    Bir cümle giriniz: Merhaba, nasılsınız?

    Örnek Çıktı:
    Kısa bir cümle
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bir cümle girmesi için bir mesaj yazdırıyoruz
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        // Cümlenin uzunluğunu kontrol ediyoruz
        if (cumle.length() < 50) {
            System.out.println("Kısa bir cümle");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
