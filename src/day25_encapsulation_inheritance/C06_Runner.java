package day25_encapsulation_inheritance;

public class C06_Runner {

    public static void main(String[] args) {

        /*
                Bir variable'i public yapmak ile
                private yapip getter ve setter'i birlikte olusturmak
                arasinda islevsel olarak fark kalmaz

                yapilan isleme VURGU yapildiginndan
                bazi developer'lar
                public yapmak yerine bu yontemi tercih ederler
         */

        C05_GetterSetterBirlikteKullanma obj = new C05_GetterSetterBirlikteKullanma();


        System.out.println(obj.sayiPublic); // 10
        obj.sayiPublic = 20;


        System.out.println(obj.getSayiPrivate()); // 100

        obj.setSayiPrivate(200);

        System.out.println(obj.getSayiPrivate()); // 200



    }
}
