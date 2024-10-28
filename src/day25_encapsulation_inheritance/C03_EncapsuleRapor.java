package day25_encapsulation_inheritance;

public class C03_EncapsuleRapor {

    private int satisTutari = 0 ;

    public void setSatisTutari(int satisTutari) {

        this.satisTutari = satisTutari;

        toplamSatisTutari += satisTutari;
    }
    // baska class'lardan deger atamasi yapilabilsin  - write yetkisi  OK
    // ama atanmis degerleri kimse goremesin          - read yetkisi   yasak



    private int toplamSatisTutari=0;

    public int getToplamSatisTutari() {

        return toplamSatisTutari;
    }

    // baska class'lardan deger atamasi YAPILAMASIN   - write yetkisi   yasak
    // ama atanmis degeri GOREBILSIN                  - read yetkisi    OK








}
