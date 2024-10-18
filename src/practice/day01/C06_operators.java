package practice.day01;

import java.util.Scanner;

public class C06_operators {
    public static void main(String[] args) {


        //Atama operatörü =
        int a=3;

        Scanner scan=new Scanner(System.in);
       // int b=scan.nextInt();
        // b neye eşittir? b için atama yapılması isteniyor

        int c=a; // bu işlemde a c'ye eşittir denilemez. c'ye a'nın değeri atama yapılmıştır

        //Eşitlik Operatörü  ==

        int d=12;
        int e=24;
        int f=9+3;
        String m="12";
       // System.out.println(m==d);  data türü aynı değilse eşit denilemez

        System.out.println(d==e); //burada d ile e değerinin eşit olup olmadığı kontrol edilir
        // false yazdırır

        System.out.println(d==f); //true


        // Değildir operatörü !
        System.out.println(d!=e); //burada ise d e'ye eşit değildir sorgulaması ayptık
        //true yazdırır

        System.out.println(d!=f); //false

        String s1="Ali";
        String s2="Ali";
        System.out.println(s1==s2); //true
        String s3="A"+"l"+"i";
        System.out.println(s1==s3); //true
        String s4="A";
        String s5="li";
        String s6=(s4+s5);
        System.out.println("s6 = " + s6);
        System.out.println("s1 = " + s1);
        System.out.println(s1==s6);//false  Ali ile s4+s5aynı şey değil

        //Şimdilik string iki değeri karşılaştırmak için == operatörü kullanılmaz
        // iki metinsel ifadeyi karşılaştırmak için equals() metodu kullancağız
        System.out.println("-------- equals() sonrası --------------------");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s6)); //true

        System.out.println("---------- Karşılaştırma Operatörleri ------------------");

        //Karşılaştırma Operatörleri

        int x=15;
        int y=20;
        int z=y-x+10; //15
        int r=y-5;

        System.out.println(x<y); // true
        System.out.println(x>y);  // false
        System.out.println(x<=z);  // true
        System.out.println(z<y);  //true
        System.out.println(y>=x);  //true
        System.out.println(!(x<y));  //false


        System.out.println("---------- Mantıksal Operatörleri ------------------");

        // (AND) ve operatörü &&

        System.out.println(x<y && z<y && r<y); //true
        // burada ve kullanıdığı için sorulanan şartların tamamı doğru ise true olur
        // sorgulanan şartlardan en az biri yanlş ise false verir


        System.out.println(x<y && z<y && r==y); //false

        // (OR) veya operatörü ||

        System.out.println(x<y || z<y || r==y); //true
        //veya operatöründe srgulanan şartlardan en az birinin doğru olması true verdirir
        // false verebilmesi için tüm koşulların yanlış olması gerekir


        System.out.println(x==y || z>y || r>y); //false

    }
}
