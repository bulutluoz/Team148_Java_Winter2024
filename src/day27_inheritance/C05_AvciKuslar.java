package day27_inheritance;

import java.util.ArrayList;
import java.util.List;

public class C05_AvciKuslar extends C04_Kuslar{

    public String hareket = "ucarlar";
    public String beslenme = "et yerler";
    public String pence = "pencelidir";
    public String gaga = "sivri gagali";

    public static void main(String[] args) {

        String str = "Java candir";
        ArrayList<String> isimler = new ArrayList<>();

        /*
            String Java'nin olusturdugu bir Class'dir
            ve AYNI ZAMANDA o class'dan olusturulan objeler icin
            DATA TURUDUR

            ayni sey Java'daki tum class'lar icin gecerlidir

            C05_AvciKuslar bizim icin "olusturdugumuz bir class" dir
            ama ayni zamanda avci objesi icin data turudur

            C04_Kuslar bizim icin "olusturdugumuz bir class" dir
            ama ayni zamanda avciKus objesi icin data turudur

            C03_Hayvanlar bizim icin "olusturdugumuz bir class" dir
            ama ayni zamanda avciKusHayvani objesi icin data turudur
         */

        /*
            Bir objenin hangi class'dan olusturuldugunu
            Constructor belirler

            AMMA istersek data turu olarak
            parent class secilebilir

            EGER ozellikler variable olarak olusturulmussa
            DATA TURU belirleyicidir
         */

        // Kuslar class'indan bir obje olusturun

        C04_Kuslar kus = new C04_Kuslar();
        System.out.println(kus.omur); // H yasar ve olur
        System.out.println(kus.solunum); //  K akcigerle nefes alirlar
        System.out.println(kus.cogalma); // K yumurtayla cogalirlar
        System.out.println(kus.kanat); // K kanatlidirlar
        System.out.println(kus.hareket); // H hareket ederler
        System.out.println(kus.beslenme); // H beslenirler
        System.out.println(kus.gaga); // K gagalari vardir
        System.out.println(kus.pence); // Kuslar ve Hayvanlar class'inda yokCTE






        C03_Hayvanlar kusHayvani = new C04_Kuslar();
















        C03_Hayvanlar hayvanKartal = new C05_AvciKuslar();
        System.out.println(hayvanKartal.omur); // H yasar ve olur
        System.out.println(hayvanKartal.solunum); //  H nefes alirlar
        System.out.println(hayvanKartal.cogalma); // H cogalirlar
        //System.out.println(hayvanKartal.kanat); // Hayvanlar class'inda yok CTE
        System.out.println(hayvanKartal.hareket); // H hareket ederler
        System.out.println(hayvanKartal.beslenme); // H beslenirler
        //System.out.println(hayvanKartal.gaga); // Hayvanlar class'inda yok CTE
        // System.out.println(hayvanKartal.pence); // Hayvanlar class'inda yok CTE



        C04_Kuslar kusKartal = new C05_AvciKuslar();

        System.out.println(kusKartal.omur); // H yasar ve olur
        System.out.println(kusKartal.solunum); //  K akcigerle nefes alirlar
        System.out.println(kusKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(kusKartal.kanat); // K kanatlidirlar
        System.out.println(kusKartal.hareket); // H hareket ederler
        System.out.println(kusKartal.beslenme); // H beslenirler
        System.out.println(kusKartal.gaga); // K gagalari vardir
        //System.out.println(kusKartal.pence); // Kuslar ve Hayvanlar class'inda yokCTE


        C05_AvciKuslar avciKartal = new C05_AvciKuslar();

        System.out.println(avciKartal.omur); // H yasar ve olur
        System.out.println(avciKartal.solunum); //  K akcigerle nefes alirlar
        System.out.println(avciKartal.cogalma); // K yumurtayla cogalirlar
        System.out.println(avciKartal.kanat); // K kanatlidirlar
        System.out.println(avciKartal.hareket); // A ucarlar
        System.out.println(avciKartal.beslenme); // A et yerler
        System.out.println(avciKartal.gaga); // A sivri gagali
        System.out.println(avciKartal.pence); // A pencelidir













    }
}
