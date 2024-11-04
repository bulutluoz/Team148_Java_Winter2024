package day29_abstractClasses;

public interface I01_Interface {
    /*
        Interface icin abstract diye tanimlamaya ihtiyac olmaz
        Interface zaten full abstraction saglayan ozel bir abstract yapidir

        Interface'lerde tum method'lar public ve abstract'tir
        publlic ve abstract keyword'lerini yazsak da yazmasak da farketmez

        Interface'lerde tum variable'lar da
        public static ve final'dir
        yazsak da yazmasak da farketmez

     */

    public abstract void method1();
    public void method2();
    void method3();


    public static final int SAYI1 = 10;
    public final int SAYI2 = 20;
    public static int SAYI3 = 30;
    static final int SAYI4= 40;
    int SAYI5 = 50;



}
