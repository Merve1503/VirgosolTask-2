public class Task16 {

    /*
    16. Ali, yazdığı romanın bazı bölümlerinde "kötü" kelimesini "iyi" ile ve '.' karakterini '!' karakteri ile değiştirmek istemektedir.
    Aşağıda verilen metin üzerinde bu değişiklikleri yapacak bir Java programı yazınız:
    Girdi metni: "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir."

    Örnek Girdi:
    Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.

    Örnek Çıktı:
    Bu iyi bir hikaye! Ancak, Ali'nin çabalarıyla daha iyi olabilir!
     */

    public static void main(String[] args) {

        // Verilen metin
        String metin = "Bu kötü bir hikaye. Ancak, Ali'nin çabalarıyla daha iyi olabilir.";

        // Değişiklikler
        String yeniMetin = metin.replace("kötü", "iyi").replace(".", "!");

        // Değiştirilmiş metni yazdır
        System.out.println(yeniMetin);

    }
}
