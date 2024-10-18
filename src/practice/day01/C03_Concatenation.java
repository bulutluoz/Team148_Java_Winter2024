package practice.day01;

public class C03_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Candır";
        String str3=" ";
        String str4="";

        int a=2;
        int b=3;

        System.out.println(str1+str3+str2+str3+str4+a+b); // Java Candır 23

        System.out.println(str1+str3+str2+str3+str4+(a+b)); // Java Candır 5

        //Bir kaç variable System.out.println ile yazdırılmak istenilince concatenaton yapılır
        // Bu işlem yapılırken matematiksel işlem önceliğine dikkat etmek şartıyla
        // String bir değer var ise string diğer değerleri string'e çevirerek concat eder.

        System.out.println(a+b+str3+str1+str3+str2+str3); // 5 Java Candır

        System.out.println(a*b+str2+str4); // 6Candır



    }
}
