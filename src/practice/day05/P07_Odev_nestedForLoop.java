package practice.day05;

public class P07_Odev_nestedForLoop {
    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

                   *
                  * *
                 * * *
                * * * *
               * * * * *


               şeklini konsola yazdiriniz.
     */
    public static void main(String[] args) {
        // Piramit yüksekliğini belirle
        int n = 5;

        // Piramidi oluştur
        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdır
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Yıldızları yazdır
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            // Satır sonunu belirt
            System.out.println();
        }
    }
}
