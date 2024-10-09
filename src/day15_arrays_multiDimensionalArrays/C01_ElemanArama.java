package day15_arrays_multiDimensionalArrays;

public class C01_ElemanArama {

    public static void main(String[] args) {

        // Verilen bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin


        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};

        String arananHarf = "d";
        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {

            if ( harfler[i].equals(arananHarf)     ){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Aradiginiz harf, array'de kullanilmamis");
        } else {
            System.out.println("Aradiginiz harf, array'de "+ sayac + " kere kullanilmis");
        }








    }

    // Verilen bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

    public static void arraydekiArananElemaninSayisiniYazdir(String[] harfler , String arananHarf){

        int sayac = 0;

        for (int i = 0; i < harfler.length; i++) {

            if ( harfler[i].equals(arananHarf)     ){
                sayac++;
            }

        }


        if (sayac == 0){
            System.out.println("Aradiginiz harf, array'de kullanilmamis");
        } else {
            System.out.println("Aradiginiz harf, array'de "+ sayac + " kere kullanilmis");
        }
    }








}
