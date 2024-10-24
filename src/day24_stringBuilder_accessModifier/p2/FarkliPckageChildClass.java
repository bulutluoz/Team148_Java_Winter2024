package day24_stringBuilder_accessModifier.p2;

import day24_stringBuilder_accessModifier.p1.Datalar;

public class FarkliPckageChildClass extends Datalar {

    public static void main(String[] args) {

        // System.out.println(Datalar.sayiPrivate);
        // Datalar.methodPrivate();

        // System.out.println(Datalar.strDefault);
        // Datalar.methodDefault();

        System.out.println(Datalar.chrProtected);
        Datalar.methodProtected();

        System.out.println(Datalar.doublePublic);
        Datalar.methodPublic();
    }
}
