package practice.day03;

import javax.swing.*;

public class P03_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        String kelime= JOptionPane.showInputDialog("6 harfli bir kelime giriniz");
        //Bu şekilde alınan bilgi string için geçerlidir
        // Eğer int vb değer almak istersek. String olarak alıp Casting yapılmalıdır

        if (kelime.length()>6){
            kelime=kelime.substring(0,6);
        } else if (kelime.length()<6) {
            System.out.println(" 6 harfli bir kelime girmelisiniz");
        }
        //0 - 1 - 2 - 3

        String tersKelime=kelime.substring(5)+kelime.substring(4,5)+kelime.substring(3,4)+kelime.substring(2,3)+kelime.substring(1,2)+kelime.substring(0,1);

        System.out.println("Girdiğiniz Kelime: "+kelime.toLowerCase());
        System.out.println("Girdiğiniz Kelimenin Tersi : "+tersKelime.toLowerCase());

        if (kelime.equals(tersKelime)){
            System.out.println("Girdiğiniz kelime palindromiktir");
        }

    }
}
