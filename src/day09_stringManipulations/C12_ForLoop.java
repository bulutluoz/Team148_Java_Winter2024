package day09_stringManipulations;

public class C12_ForLoop {

    public static void main(String[] args) {


        String str = "Java Candir";

        // str'in harflerini her satirda 1 harf olacak sekilde
        // alt alta yazdirin

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(7));
        System.out.println(str.charAt(8));
        System.out.println(str.charAt(9));
        System.out.println(str.charAt(10));


        // kullanicinin verdigi baslangic degerinden baslayip,
        // verdigi bitis degerine kadar olan sayilari toplayin

        int basDegeri = 1978;
        int bitDegeri = 2465;

        int toplam = 0;

        for (int i = basDegeri; i <=bitDegeri ; i++) {
            toplam+=i;
        }

        System.out.println(toplam);
    }

}
