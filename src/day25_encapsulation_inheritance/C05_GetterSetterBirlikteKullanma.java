package day25_encapsulation_inheritance;

public class C05_GetterSetterBirlikteKullanma {

    public int sayiPublic = 10;
    // baska class'lardan deger atama write yetkisi -- OK
    // baska class'lardan goruntuleme read yetkisi  -- OK


    private int sayiPrivate = 100;
    // baska class'lardan deger atama write yetkisi -- direkt degil ama setter ile OK
    // baska class'lardan goruntuleme read yetkisi  -- direkt degil ama getter ile OK

    public int getSayiPrivate() {
        return sayiPrivate;
    }

    public void setSayiPrivate(int sayiPrivate) {
        this.sayiPrivate = sayiPrivate;
    }
}
