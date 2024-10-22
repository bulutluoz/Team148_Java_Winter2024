package day22_immutableClasses_dateTime;

public class C02_StringAtamaYapilirsa {

    public static void main(String[] args) {


        String str = "Java";


        str = str.replace("J","T");


        System.out.println(str); // Tava

        str = "Hava";


        // String immutable oldugundan degeri DEGISTIRILEMEZ
        // kod yazan kisi yeni bir atama yaptiginda
        // java atamanin calismasi icin yeni bir obje olusturur ve yeni objeyi pointer'a tanitir.

        // Boylece kullanici olarak biz String variable'lara yeni degerler atayabiliriz

        // AMMMAAA her yeni deger atamasinda kullanilmayan bir String objesi aciga cikar

        // Java'daki Garbage Collector (cop toplayici) mekanizmasi
        // belirli araliklarla calisip, kullanilmayan bu objeleri toplayip yok eder



        String s = "";

        for (int i = 1; i <=100 ; i++) {
            s += i;
        }

        System.out.println(s);

    }
}
