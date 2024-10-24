package day24_stringBuilder_accessModifier.p1;

public class Datalar {

    static private int sayiPrivate=9720016; // private
    static String strDefault="Merhaba";
    static protected char chrProtected=65;
    static public double doublePublic=128.32;


    private static void methodPrivate(){
        System.out.println("Private Olan Method Çalıştı");
    }

    static void methodDefault(){
        System.out.println("Default Olan Method Çalıştı");
    }

    protected static void methodProtected(){
        System.out.println("Protected Olan Method Çalıştı");
    }

    public static void methodPublic(){
        System.out.println("Public olan Method Çalıştı");
    }

    public static void main(String[] args) {

        System.out.println(sayiPrivate);
        methodPrivate();

        System.out.println(strDefault);
        methodDefault();

        System.out.println(chrProtected);
        methodProtected();

        System.out.println(doublePublic);
        methodPublic();
    }

  }
