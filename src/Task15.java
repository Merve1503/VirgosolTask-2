import java.util.Scanner;

public class Task15 {

    /*
    15. Girilen bir yılın artık yıl olup olmadığını belirleyen bir Java programı yazınız.
    Programınızın çıktısı, yılın artık yıl olup olmadığını doğru bir şekilde göstermelidir.

    Örnek Girdi:
    Bir yıl giriniz: 2020

    Örnek Çıktı:
    2020 bir artık yıldır.

    Artık yıl, normal yıllardan bir gün daha fazla gün içeren bir yıldır.
    Normal yıllar 365 gün iken, artık yıllar 366 günden oluşur.
    Bu ekstra gün, Şubat ayına 29 Şubat'ın eklenmesiyle sağlanır.
    Artık yılların belirlenmesinde kullanılan temel kriter, Güneş yılı ve Dünya'nın yörüngesinin dönme süresiyle ilgilidir.

    Bir yılın artık yıl olabilmesi için genellikle üç kriter vardır:
    Yıl 4'e tam olarak bölünebiliyorsa (örneğin, 1996, 2004, 2008 gibi),
    Ancak 100'e tam olarak bölünmüyorsa (örneğin, 1900, 1800, 1700 gibi),
    Yine de 400'e tam olarak bölünebiliyorsa (örneğin, 2000, 1600, 1200 gibi).

    Bu koşullar sağlanıyorsa, yıl artık yıldır. Artık yıllar, güneş takvimindeki doğru hizalanmayı korumak için kullanılır ve takvimimizdeki mevsimlerin ve ek etkinliklerin doğru zamanlamasını sağlar.
     */

    public static void main(String[] args) {

        // Scanner sınıfını kullanarak kullanıcıdan giriş almak için bir nesne oluşturuyoruz
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir yıl girmesini istiyoruz
        System.out.print("Bir yıl giriniz: ");
        int yil = scanner.nextInt();

        // Artık yıl kontrolü
        if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        // Kaynakları serbest bırakıyoruz
        scanner.close();

    }
}
