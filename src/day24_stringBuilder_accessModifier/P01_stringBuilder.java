package day24_stringBuilder_accessModifier;

public class P01_stringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder();
        //16 karakterleri kapasiteye sahip BOŞ bir String Builder oluşturduk


        System.out.println("sb1 =" + sb1); // hiçlik
        System.out.println("sb1 in uzunluğu =" + sb1.length()); // 0
        System.out.println("sb1 in kapasitesi =" + sb1.capacity()); // 16
        System.out.println("----------------------------------------");

        StringBuilder sb2 = new StringBuilder(7);
        // 7 karakter kapasiteye sahip bir string builder oluşturdu.

        System.out.println("sb2 =" + sb2); // hiçlik
        System.out.println("sb2 in uzunluğu =" + sb2.length()); // 0
        System.out.println("sb2 in kapasitesi =" + sb2.capacity()); // 7
        // burada 7 karakterli bir girişe kadar sorun olmaz.
        // fakat 7'den 1 tane daha fazla gerekirse
        // kapasite direkt (eskiKapsite*2)+2 kadar yapılır

        System.out.println("----------------------------------------");
        sb2.append("ZEYNEP KIRBAŞ");

        System.out.println("sb2 =" + sb2); // ZEYNEP KIRBAŞ
        System.out.println("sb2 in uzunluğu =" + sb2.length()); // 13
        System.out.println("sb2 in kapasitesi =" + sb2.capacity()); // 16

        System.out.println("----------------------------------------");

        StringBuilder sb3 = new StringBuilder(" DOĞRU");
        System.out.println("sb3 =" + sb3); //  DOĞRU
        System.out.println("sb3 ün uzunluğu =" + sb3.length()); // 6
        System.out.println("sb3 ün kapasitesi =" + sb3.capacity()); // 22
        //Java bu şekilde oluşturulan SB'larda 16+length kadarlık bir SB oluşturur


        System.out.println("----------------------------------------");


        StringBuilder sb4=new StringBuilder("Java");
        System.out.println("sb4 =" + sb4); //  Java
        System.out.println("sb4 ün uzunluğu =" + sb4.length()); // 4
        System.out.println("sb4 ün kapasitesi =" + sb4.capacity()); // 20
        System.out.println("..............................................");
        sb4.append(" öğrenen pişman olmaz.");
        System.out.println("sb4 =" + sb4); //  Java
        System.out.println("sb4 ün uzunluğu =" + sb4.length()); // 4
        System.out.println("sb4 ün kapasitesi =" + sb4.capacity()); // 20

        long tcNo=12356448254L;
        System.out.println("tcNo =" + (tcNo+1));

        StringBuilder tcNOsb=new StringBuilder(11);
        tcNOsb.append("25698756984");
        System.out.println("tcNO =" + tcNOsb);


        StringBuilder sb5=new StringBuilder();
        sb5.append("Java");
        String str= "Güzeldir, İyidir";

        sb5.append(str,10,16);
        System.out.println(sb5);




    }
}
