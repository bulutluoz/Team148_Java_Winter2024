package day20_constructorCall_staticKeyword;

public class C04_StaticBlocks {
    /*
        static blocklar class calismaya baslarken
        herseyden (hattta main method'dan bile) once calisirlar

        static block'larin yeri onemli degildir
        en altda da olsa once onlar calisir

        birden fazla static block varsa kendi iclerinde once ustteki calisir
     */

    C04_StaticBlocks(){
        System.out.println("Constructor calisti");

    }


    public static void main(String[] args) {
        System.out.println("main method calisti");
        C04_StaticBlocks obj1 = new C04_StaticBlocks();
        C04_StaticBlocks obj2 = new C04_StaticBlocks();
    }


    public static void method1(){
        System.out.println("method calisti");
    }

    static {
        System.out.println("static block1 calisti");
    }

    static {
        System.out.println("static block2 calisti");
    }

    {
        // obje olusturulmadan once yapilacak ayarlamalar icin kullanilir
        // her constructor calismasindan once static olmayan block calisir
        System.out.println("static olmayan kod blogu calisti");
    }

}
