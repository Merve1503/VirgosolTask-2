import java.util.Scanner;

public class Task12 {

    /*
    12. Kullanıcıdan bir ay numarası girmesini isteyen ve bu ayın yaz mevsiminde olup olmadığını belirleyen programı yazınız.
    Not: Switch-case kullanarak yazınız.

	Örnek Girdi:
	Bir ay numarası giriniz (1-12): 7

	Örnek Çıktı:
	Yaz mevsimindesiniz.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan ay numarasını girmesini istiyoruz
        System.out.print("Bir ay numarası giriniz (1-12): ");
        int ay = scanner.nextInt();

        // Girilen ay numarasına göre yaz mevsiminde olup olmadığını kontrol ediyoruz
        switch (ay) {
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz mevsimindesiniz.");
                break;
            default:
                System.out.println("Yaz mevsiminde değilsiniz.");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
