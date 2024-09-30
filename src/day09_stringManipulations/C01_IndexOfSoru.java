package day09_stringManipulations;

import java.util.Scanner;

public class C01_IndexOfSoru {
    public static void main(String[] args) {

        //Kullanicidan bir String ve aranacak metin alin.
        //Aranan metnin String icerisinde kullanimini kontrol ederek
        //asagidaki cumlelerden uygun olanini yazdirin
        // - String aranan metni icermiyor
        // - Aranan metin String’de sadece 1 kere kullanilmis
        // - Aranan metin String’de 1’den fazla kullanilmis


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen arama yapilacak metni giriniz...");
        String anaMetin = scanner.nextLine();

        System.out.println("Lutfen aranacak kelime veya metni girin...");
        String aranacakMetin = scanner.nextLine();


        // anaMetin = "javayi cok sevdik, hem de cok cok sevdik."
        // aranacakMetin = "Java"

        int ilkKullanimIndexi = anaMetin.indexOf(aranacakMetin);
        int sonKullanimIndexi = anaMetin.lastIndexOf(aranacakMetin);

        if (ilkKullanimIndexi == -1){
            System.out.println("Ana metin aranacak metni icermiyor");
        } else if (ilkKullanimIndexi == sonKullanimIndexi) {
            System.out.println("Ana metinde aranacak metin sadece 1 kere kullanilmis");
        }else {
            System.out.println("Ana metinde aranacak metin  1'den fazla kere kullanilmis");

        }


    }
}
