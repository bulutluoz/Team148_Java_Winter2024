package practice.day03;

import java.util.Scanner;

public class P05_StringManipulation {
    public static void main(String[] args) {
  /*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
         * output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)

   */

        Scanner scan=new Scanner(System.in);
        System.out.print("İsminizi Giriniz: ");
        String isim= scan.nextLine();
        System.out.print("Soyisminizi Giriniz: ");
        String soyisim= scan.nextLine();
        System.out.print("Kredi Kartı No Giriniz: ");
        String kkNo= scan.nextLine();

        /*
            \\d ---> 0-9 tüm rakamlar
            \\D ---> 0-9 haricindeki her şey

            \\w harfler
            \\W harfler dışındaki her şey

            \\s space
            \\S space dışındaki her şey

         */
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        kkNo=kkNo.substring(0).replaceAll("\\s","");
        if (kkNo.length()<16){
            System.out.println("Geçersiz kredi kartı numarası");
        }else{

            kkNo=kkNo.substring(0,4).replaceAll("\\d","*")+kkNo.substring(4,8).replaceAll("\\d","*")
                    +kkNo.substring(8,12).replaceAll("\\d","*")+kkNo.substring(12,16);
        }

        System.out.println(isim+" "+soyisim+" "+kkNo);




    }
}
