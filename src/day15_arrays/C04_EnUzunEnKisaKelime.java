package day15_arrays;

public class C04_EnUzunEnKisaKelime {

    public static void main(String[] args) {

        // Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdirin

        String[] isimler = {"hamza", "esra", "serat", "ali", "cansu","ibrahim","can","yasemin"};


        String enKisaKelime = isimler[0];
        String enUzunKelime = isimler[0];

        for (int i = 1; i < isimler.length ; i++) {

            if ( isimler[i].length() < enKisaKelime.length() ){
                enKisaKelime = isimler[i];
            }

            if (isimler[i].length() > enUzunKelime.length() ){
                enUzunKelime = isimler[i];
            }

        }

        System.out.println("Array'deki en kisa kelime : " + enKisaKelime);
        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);
        System.out.println("Esit uzunlukta olan kelimeler gozardi edilmistir");




    }

    // Verilen String bir array’deki
    // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.

    public static void enKisaVeEnUzunuYazdir( String[] arr ){

        String enKisaKelime = arr[0];
        String enUzunKelime = arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if ( arr[i].length() < enKisaKelime.length() ){
                enKisaKelime = arr[i];
            }

            if (arr[i].length() > enUzunKelime.length() ){
                enUzunKelime = arr[i];
            }

        }

        System.out.println("Array'deki en kisa kelime : " + enKisaKelime);
        System.out.println("Array'deki en uzun kelime : " + enUzunKelime);
        System.out.println("Esit uzunlukta olan kelimeler gozardi edilmistir");


    }
}
