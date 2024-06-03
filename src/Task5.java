import java.util.Scanner;

public class Task5 {

    /*
    5. Bir üniversite, öğrencilerin aldığı derslere göre notlarını harf notuna çeviren bir Java programı yazmanızı istemektedir.
    Program, her bir öğrencinin notunu okuyacak ve aşağıdaki kurallara göre harf notunu belirleyecektir:
	90-100: A
	80-89: B
	70-79: C
	60-69: D
	0-59: F

	Örnek Girdi:
	Bir puan giriniz: 85

	Örnek Çıktı:
	Not: B
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya bir puan girmesi için bir mesaj yazdırıyoruz
        System.out.print("Bir puan giriniz: ");
        int puan = scanner.nextInt();

        // Harf notunu belirlemek için bir değişken oluşturuyoruz
        char harfNotu;

        // Girilen puana göre harf notunu belirliyoruz
        if (puan >= 90 && puan <= 100) {
            harfNotu = 'A';
        } else if (puan >= 80 && puan <= 89) {
            harfNotu = 'B';
        } else if (puan >= 70 && puan <= 79) {
            harfNotu = 'C';
        } else if (puan >= 60 && puan <= 69) {
            harfNotu = 'D';
        } else if (puan >= 0 && puan <= 59) {
            harfNotu = 'F';
        } else {
            System.out.println("Geçersiz puan girdiniz.");
            return; // Programı sonlandır
        }

        // Harf notunu ekrana yazdırıyoruz
        System.out.println("Not: " + harfNotu);

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
