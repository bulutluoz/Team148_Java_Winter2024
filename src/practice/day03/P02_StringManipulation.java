package practice.day03;

import javax.swing.*;

public class P02_StringManipulation {
    //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
    // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

    public static void main(String[] args) {

        String isim= JOptionPane.showInputDialog("Lütfen 3 kelimeli bir isim giriniz\n\n\n\n");
        System.out.println(isim);

        String ilkHarf=isim.substring(0,1);
        String ikinciHarf=isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2);
        String ucuncuHarf=isim.substring(isim.lastIndexOf(" ")+1,isim.lastIndexOf(" ")+2);
        // Tarık Berk BABAYİĞİT

        System.out.println(isim+" -> "+ilkHarf.toUpperCase()+"."+ikinciHarf.toUpperCase()+"."+ucuncuHarf.toUpperCase()+".");


    }


}
