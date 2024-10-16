package day19_constructors;

public class C09_ArabaRunner {

    // Eger default constructor disinda
    // bir constructor kullaniliyorsa
    // her obje icin mutlaka constructor'da yapilan
    // islemler kontrol edilmelidir

    public static void main(String[] args) {

        C08_Araba araba = new C08_Araba();

        System.out.println(araba.yil); // 2023
        System.out.println(araba.marka); // Opel


    }





}
