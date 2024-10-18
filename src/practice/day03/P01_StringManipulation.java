package practice.day03;

import java.util.Scanner;

public class P01_StringManipulation {
    public static void main(String[] args) {
        // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜtfen isminizi ve soy isminizi arada bir boşluk bırakarak giriniz: ");
        String isimSoyisim= scan.nextLine();
        String isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" "));
        String soyisim=isimSoyisim.substring(isimSoyisim.indexOf(" ")+1);

        System.out.println("Adı:"+isim+"\nSoyisim:"+soyisim);

        //substring: metni bölmeye yarar iki farklı bölme yapılabilir.
        // Birincisi (ilk index, ikinci index) iki index arasındaki ilki dahil olan ikincisi dahil olmayanları alır
        // İkincisi (index): verilen index dahil sona kadar olan tümünü alır


        //indexOf: strindeki herhangi bir karakterin index'ini bulmaya yarar.
        // bu metotta hem char hem string kullanılabilir
        // Bu baştan sayarak ilk gördüğü yerin indexini verir

        //lastindexOf:strindeki herhangi bir karakterin index'ini bulmaya yarar.
        // bu metotta hem char hem string kullanılabilir
        // Bu sondan başa sayarak ilk gördüğü yerin indexini verir.
        // Fakat index numarasını sondan değil baştan sayar
    }
}
