package day08_StringManipulation;

import java.util.Scanner;

public class P04_contains {
    public static void main(String[] args) {


        /*
            Kullanıcıdan bir metin isteyin
            metin ev içeriyorsa "Ev gibisi yok"
            metin iş içeriyorsa "Çalışmak ne güzel"
            metin hem ev hem iş içeriyorsa "Evden çalışmak ne güzel"
            her ikisi de yoksa "Çalışmak lazım" yazdıran kodu yazınız

         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Gününüzü nasıl geçiriyorsunuz?: ");
        String metin=scan.nextLine();

        if (metin.toLowerCase().contains("ev")&& metin.toLowerCase().contains("iş")) {
            System.out.println("Evden çalışmak ne güzel");
        }else if(metin.toLowerCase().contains("ev")){
            System.out.println("Ev gibisi yok");
        } else if (metin.toLowerCase().contains("iş")) {
            System.out.println("Çalışmak ne güzel");
        }else{
            System.out.println("Çalışmak lazım");
        }
    }
}
