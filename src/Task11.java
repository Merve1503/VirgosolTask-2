import java.util.Scanner;

public class Task11 {

    /*
    11. Girilen bir cümlenin belirli bir kelime ile başlayıp başlamadığını kontrol eden bir program yazın.

	Örnek Girdi:
	Bir cümle giriniz: Java programlama dili
	Kontrol edilecek kelime: Java

	Örnek Çıktı:
	Cümle 'Java' ile başlıyor.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir cümle girmesini istiyoruz
        System.out.print("Bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        // Kontrol edilecek kelimeyi kullanıcıdan alıyoruz
        System.out.print("Kontrol edilecek kelime: ");
        String kelime = scanner.nextLine();

        // Cümlenin belirli bir kelime ile başlayıp başlamadığını kontrol ediyoruz
        if (cumle.startsWith(kelime)) {
            System.out.println("Cümle '" + kelime + "' ile başlıyor.");
        } else {
            System.out.println("Cümle '" + kelime + "' ile başlamıyor.");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
