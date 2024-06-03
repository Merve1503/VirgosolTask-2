import java.util.Scanner;

public class Task10 {

    /*
    10. Girilen iki cümleden uzun olanı bulan bir program yazın.

	Örnek Girdi:
	Birinci cümleyi giriniz: Merhaba Dünya
	İkinci cümleyi giriniz: Java programlama dili

	Örnek Çıktı:
	Uzun olan cümle: Java programlama dili
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // İlk cümleyi kullanıcıdan alıyoruz
        System.out.print("Birinci cümleyi giriniz: ");
        String cumle1 = scanner.nextLine();

        // İkinci cümleyi kullanıcıdan alıyoruz
        System.out.print("İkinci cümleyi giriniz: ");
        String cumle2 = scanner.nextLine();

        // İki cümlenin uzunluklarını karşılaştırıyoruz
        if (cumle1.length() > cumle2.length()) {
            System.out.println("Uzun olan cümle: " + cumle1);
        } else if (cumle2.length() > cumle1.length()) {
            System.out.println("Uzun olan cümle: " + cumle2);
        } else {
            System.out.println("Cümleler aynı uzunlukta");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
