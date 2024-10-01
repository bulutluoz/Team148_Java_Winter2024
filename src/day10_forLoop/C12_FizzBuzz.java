package day10_forLoop;

import java.util.Scanner;

public class C12_FizzBuzz {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak o sayiya kadar tum tamsayilari yanyana yazdirin, sira
        //	- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        //	- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        //	- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        // 1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzBuzz ......

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen pozitif bir tamsayi giriniz: ");
        int girilenSayi= scan.nextInt();


        for (int i = 1; i <= girilenSayi ; i++) {

            if (i % 5 == 0 && i % 3 == 0) System.out.println("fizzBuzz");
            else if (i % 5==0) System.out.print("buzz" + " ");
            else if (i % 3==0) System.out.print("fizz" + " ");
            else System.out.print(i + " ");

        }

    }
}
