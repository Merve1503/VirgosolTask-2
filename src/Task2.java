import java.util.Scanner;

public class Task2 {

    /*
    2. Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

    Örnek Girdi:
    Bir kelime giriniz: merhaba

    Örnek Çıktı:
    Kelimenin uzunluğu: 7
    */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bir kelime girmesini söyleyen mesajı yazdırıyoruz
        System.out.print("Bir kelime giriniz: ");

        // Kullanıcının girdiği kelimeyi alıyoruz
        String kelime = scanner.nextLine();

        // Kelimenin uzunluğunu hesaplıyoruz
        int uzunluk = kelime.length();

        // Kelimenin uzunluğunu ekrana yazdırıyoruz
        System.out.println("Kelimenin uzunluğu: " + uzunluk);

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
