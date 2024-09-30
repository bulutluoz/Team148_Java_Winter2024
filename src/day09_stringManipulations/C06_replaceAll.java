package day09_stringManipulations;

import java.util.Scanner;

public class C06_replaceAll {

    public static void main(String[] args) {

        // kullanicidan bir metin isteyin
        // metindeki bosluk ve harf olmayan herseyi silin
        // ornek : J1a4v*a )G*&^56uzel_!dir.
        //         Java Guzeldir


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz...");
        String metin = scanner.nextLine(); // J1a4v*a )G*&^56uzel_!dir.

        // once sayilardan kurtulalim
        metin = metin.replaceAll("\\d",""); // Jav*a )G*&^uzel_!dir.

        // ozel karakterleri silmeden once
        // " " bosluklari korumaya almamiz gerekiyor
        // yukarda sayilari yok etmistik, space yerine herhangi bir rakam yazalim

        metin = metin.replace(" ","8");


        // ozel karakterlerden kurtulalim
        metin = metin.replaceAll("\\W",""); // W ==> harf,rakam ve _ disindaki hersey


        // _'yi yok edelim
        metin = metin.replaceAll("_","");

        // space yerine yukarda 8 yazmistik, onu yeniden space yapalim

        metin = metin.replaceAll("8"," ");

        // en sona bir nokta ekleyelim
        metin += ".";


        System.out.println(metin);


        // B567e)(*n b(&%u ko6789n9876u87!yu co_./k se,.><vd??im


    }
}
