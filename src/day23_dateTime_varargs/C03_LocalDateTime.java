package day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        // eger tarih ve zamani birlikte kullanmak isterseniz

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println(ldt); // 2024-10-23T10:13:32.801101


        // Tarih ve zamani istediginiz formatta yazdirabilirsiniz
        // once istediginiz formati hazirlamalisiniz
        // Java'da istenen formati hazirlamak icin DateTimeFormatter class'indan
        // format olusturulmasi gerekir

 /*
            Eger tarih ve saati istediginiz bir form'da yazdirmak isterseniz
            once o formati olusturmalisiniz
            format olusturduktan sonra ldt'yi istenen formatla yazdirabilirsiniz

            GUN
                 d : basta 0 varsa onu yazmadan gun numarasi
                 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
                 DDD : yilin kacinci gunu oldugunu yazar
                 E, EE, EEE : gun isminin ilk 3 harfi
                 EEEE : gun isminin tamamini

             AY (Ay icin M, dakika icin m kullanilir)
                 M : basta 0 varsa onu yazmadan ay numarasi
                 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
                 MMM : Ay isminin ilk 3 harfi
                 MMMM : Ay isminin tamami
            Yil   y veya Y kullanilabilir
                 YY : yilin son iki rakamini
                 YYYY : Yilin tamamini
            Saat
                 Saat : 24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h

                 HH : saatin tamami, tek rakamli saat olursa 02 gibi
                 H  : tek rakamli saat olursa sadece saati

                 a yazarsak AM veya PM degerini yazar
         */



        // ldt ==> 2024-10-23T10:13:32.801101

        // 23.10.2024 pazartesi
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("d.M.yyyy  EEEE");
        System.out.println(ldt.format(format1)); // 23.10.2024  Wednesday

        // 23/Ekim/2024 297
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy DDD.");
        System.out.println(ldt.format(format2) +"gun"); // 23/October/2024 297.gun


        // 08 / 05 / 24        ay / gun / yil'in son 2 rakami  ay ve gun 2 basamakli olsun
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MM / dd / yy");
        System.out.println(ldt.format(format3)); // 10 / 23 / 24

        LocalDateTime tarih = LocalDateTime.of(2009,3,7,5,4);
        System.out.println(tarih); //  2009-03-07T05:04

        System.out.println(tarih.format(format3)); // 03 / 07 / 09

        // 8/5/24              ay / gun / yil'in son 2 rakami  ay ve gun tek basamakli olabilir

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("M / d / yy");
        System.out.println(ldt.format(format4)); //  10 / 23 / 24

        System.out.println(tarih.format(format4)); // 3 / 7 / 09


        // ldt ==> 2024-10-23T10:13:32.801101

        // 10:19            24 saatlik dilime gore

        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("H:m");
        System.out.println(ldt.format(format5)); // 10:44
        System.out.println(tarih.format(format5)); // 5:4

        DateTimeFormatter format6 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(ldt.format(format5)); // 10:44
        System.out.println(tarih.format(format5)); // 05:04



        // 10:19 am         12 saatlik dilime gore


        // 08:23:24         saat, dakika, saniye hepsi 2 basamakli olsun


        // 8-3-24         saat, dakika, saniye hepsi tek basamakli olabilsin



        // Wed Oct 23 3:20 PM







    }
}
