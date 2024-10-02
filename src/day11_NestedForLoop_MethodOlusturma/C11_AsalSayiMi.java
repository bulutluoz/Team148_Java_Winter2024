package day11_NestedForLoop_MethodOlusturma;

public class C11_AsalSayiMi {

    public static void main(String[] args) {

        // verilen sayi asal ise true,
        // asal sayi degilse false yazdiran bir method olusturun

        asalMiYazdir(23); // true
        asalMiYazdir(679); // false
        asalMiYazdir(5677); // false

    }


    public static void asalMiYazdir( int sayi ){

        int flag = 20;


        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                System.out.println("false");
                flag = 42;
                break;
            }
        }


        // flag icin 2 olasi deger var
        // eger flag == 20 ==> ASALDIR

        if (flag == 20) System.out.println("true");
    }

}
