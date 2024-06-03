public class Task9 {

    /*
    9.  'abc' metinindeki ASCII değerlerini ekrana yazdıran programı yazınız.

    Örnek Çıktı:
	Karakter: a, ASCII Değeri: 97
	Karakter: b, ASCII Değeri: 98
	Karakter: c, ASCII Değeri: 99
     */

    public static void main(String[] args) {

        // ASCII değerlerini yazdırmak istediğimiz metin
        String metin = "abc";

        // Metindeki her bir karakterin ASCII değerini yazdırıyoruz
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            int asciiDegeri = (int) karakter;
            System.out.println("Karakter: " + karakter + ", ASCII Değeri: " + asciiDegeri);
        }

    }
}
