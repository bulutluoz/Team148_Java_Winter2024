package day28_overridingPolymorphism;

public class C03_AvciKuslar extends C02_Kuslar {
    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        /*
            EGER ozellikler method olarak olusturuldu ise
            yine aramaya Data Turu olan Class'dan baslariz

            AMMMAAA bulduktan sonra,
            Constructor'in oldugu Class'a kadar
            DAHA GUNCEL BILGI var mi diye kontrol ederiz


            data class'indan aramaya basladiginda
            ozelligi bulamazsa CTE verir
            guncele de bakmaz
         */

        // Hayvanlar Class'indan bir obje olusturun
        C01_Hayvanlar hayvan1 = new C01_Hayvanlar();
        hayvan1.omur(); // H yasar ve olurler
        hayvan1.solunum(); // H nefes alir
        hayvan1.cogalma(); // H cogalirlar
        // hayvan1.kanat(); // Hayvanlar'da yok CTE
        hayvan1.hareket(); // H hareket ederler
        hayvan1.beslenme(); // H Beslenirler
        //hayvan1.gaga(); // Hayvanlar'da yok CTE
        // hayvan1.pence();  // Hayvanlar'da yok CTE


        // Kuslar Class'indan bir obje olusturun

        C01_Hayvanlar kusHayvani = new C02_Kuslar();
        kusHayvani.omur(); // H yasar ve olurler
        kusHayvani.solunum(); // K akcigerle nefes alirlar
        kusHayvani.cogalma(); // K yumurtayla cogalirlar
        // kusHayvani.kanat(); // Hayvanlar'da yok CTE
        kusHayvani.hareket(); // H hareket ederler
        kusHayvani.beslenme(); // H Beslenirler
        // kusHayvani.gaga(); // Hayvanlar'da yok CTE
        // kusHayvani.pence();  // Hayvanlar'da yok CTE

        C02_Kuslar kus1 = new C02_Kuslar();
        kus1.omur(); // H yasar ve olurler
        kus1.solunum(); // K akcigerle nefes alirlar
        kus1.cogalma(); // K yumurtayla cogalirlar
        kus1.kanat(); // K kanatlidir
        kus1.hareket(); // H hareket ederler
        kus1.beslenme(); // H Beslenirler
        kus1.gaga(); // K gagalari vardir
        // kus1.pence();  // Kuslar ve Hayvanlar'da yok CTE

        // Avci kuslar class'indan bir obje olusturun
        C01_Hayvanlar hayvanKartal = new C03_AvciKuslar();
        hayvanKartal.omur(); // H yasar ve olurler
        hayvanKartal.solunum(); // K akcigerle nefes alirlar
        hayvanKartal.cogalma(); // K yumurtayla cogalirlar
        //hayvanKartal.kanat(); // Hayvanlar'da yok CTE
        hayvanKartal.hareket(); // A ucarlar
        hayvanKartal.beslenme(); // A Etle yerler
        //hayvanKartal.gaga(); // Hayvanlar'da yok CTE
        //hayvanKartal.pence();  // Hayvanlar'da yok CTE


        C02_Kuslar kusKartal = new C03_AvciKuslar();
        kusKartal.omur(); // H yasar ve olurler
        kusKartal.solunum(); // K akcigerle nefes alirlar
        kusKartal.cogalma(); // K yumurtayla cogalirlar
        kusKartal.kanat(); // K kanatlidir
        kusKartal.hareket(); // A ucarlar
        kusKartal.beslenme(); // A Etle yerler
        kusKartal.gaga(); // A sivri gagalidir
        // kusKartal.pence();  // Kuslar ve Hayvanlar'da yok CTE


        C03_AvciKuslar avciKartal = new C03_AvciKuslar();
        avciKartal.omur(); // H yasar ve olurler
        avciKartal.solunum(); // K akcigerle nefes alirlar
        avciKartal.cogalma(); // K yumurtayla cogalirlar
        avciKartal.kanat(); // K kanatlidir
        avciKartal.hareket(); // A ucarlar
        avciKartal.beslenme(); // A Etle yerler
        avciKartal.gaga(); // A sivri gagalidir
        avciKartal.pence();  // A pencelidir


    }


}
