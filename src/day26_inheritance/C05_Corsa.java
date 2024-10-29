package day26_inheritance;

public class C05_Corsa extends C04_Opel{

    C05_Corsa(){

        System.out.println("Corsa parametresiz constructor calisti");
    }

    String model = "Corsa";
    String kasa = "Corsa kasasi";
    String motor = "vvdi";
    String lastik = "15 inch Pirelli";

    String uretimYeri = "Almanya";
    String aku = "volta aku";

    public static void main(String[] args) {

        C05_Corsa corsa1 = new C05_Corsa();

        System.out.println(corsa1.sanzuman); // Car Sanzuman secilmedi

        System.out.println(corsa1.marka); // O Opel
        System.out.println(corsa1.guvenlik); // O DGS1001
        System.out.println(corsa1.fren); // O ABS

        System.out.println(corsa1.model); // C Corsa
        System.out.println(corsa1.motor); //  C vvdi
        System.out.println(corsa1.kasa); // C Corsa kasasi
        System.out.println(corsa1.lastik); // C 15 inch Pirelli
        System.out.println(corsa1.uretimYeri); // C Almanya
        System.out.println(corsa1.aku); // C Volta aku



    }


}
