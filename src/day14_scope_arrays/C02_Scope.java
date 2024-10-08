package day14_scope_arrays;

public class C02_Scope {

    public static void main(String[] args)  {

        /*
            static variable'larin EN BUYUK AVANTAJI erisim kolayligidir
            - Class icerisinden her yerden direkt ulasilabilir
            - Baska class'lardan da ClassIsmi.staticVariableIsmi seklinde kolayca ulasilir

            static variable'larin EN BUYUK DEZAVANTAJI ulasan herkesin DEGISTIREBILMESIDIR
         */
        System.out.println(C01_Hastane.hastaneIsmi); // Yildiz Hastanesi
        System.out.println(C01_Hastane.hastaneAdresi); // Yenimahalle
        System.out.println(C01_Hastane.bashekim); // Doktor Ali


        C01_Hastane.bashekim = "Dr Oguzhan";


        System.out.println(C01_Hastane.bashekim); // Doktor Oguzhan


    }
}
