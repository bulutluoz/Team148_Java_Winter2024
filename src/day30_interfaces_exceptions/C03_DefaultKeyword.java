package day30_interfaces_exceptions;

public class C03_DefaultKeyword {

    // bu class'da gorunmeyen "default constructor" var

    int sayi;
    // sayi'ya bir deger atamasi yapmadik
    // Java sayi'ya "default deger" olarak 0 atamasi yapar

    public int a = 24;
    int b = 45;
    // a'nin access modifier'i public
    // b'nin access modifier'i yazilmamis yani "default access modfier"'a sahiptir
    // default int c = 56;
    // access modifier olan "default" yazilmaz

    // public protected int d = 67;
    // Illegal combination of modifiers: 'public' and 'protected'
    // bir class uyesine iki access modifier yazamayiz

    public static void main(String[] args) {


    }
}
