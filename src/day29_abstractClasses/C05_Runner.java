package day29_abstractClasses;

import day23_dateTime_varargs.C05_Varargs;
import day28_overridingPolymorphism.C02_Kuslar;

public class C05_Runner {

    public static void main(String[] args) {

        C02_Kuslar kus1 = new C02_Kuslar();
        kus1.cogalma(); // yumurtayla cogalirlar

        C05_Varargs obj = new C05_Varargs();

        C01_KuralciOlmayanParent kop1 = new C01_KuralciOlmayanParent();
        kop1.method1();
        System.out.println(kop1.s);

        /*
            Abstract class'lar class olduklari icin
            Constructor'a sahiptirler

            ANCCCCAAAK abstract class'lar abstract method'lar barindirdigi icin
            Java abstract class'lardan obje olusturulmasina izin vermez

            Cunku bu obje olusturulursa
            obje ile asagidaki gibi abstract method'lar cagrilabilir
            AMMMAAA abstract method'larin body'si olmadigindan calisamazlar
         */
        // C03_KuralciParent kp1 = new C03_KuralciParent();
        // kp1.method1();


        C03_KuralciParent kp1 = new C04_ChildOfKuralciParent();
        kp1.method1(); // C04 method1
        kp1.method2(); // C04 method2
        kp1.method5(); // C04 method2

        kp1.method3(); // Parent method3
        kp1.method4(); // Parent method4

    }
}
