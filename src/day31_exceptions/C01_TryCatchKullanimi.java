package day31_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_TryCatchKullanimi {

    public static void main(String[] args) {

        // Kullanicidan iki tamsayi isteyip
        // sayilari birbirine bolun ve sonucu yazdirin

        /*
            Ongordugumuz problem if else ile cozulebiliyorsa cozeriz

            Eger if-else ile cozulemezse
            try-catch blogu kullaniriz

            try blogu hata olusma riski olan kodlari calistirir
            try blogunun tek basina yazilmasi anlamsiz olur,
            mutlaka catch ve/veya finally bloklari ile calismalidir

            catch keywor'unun onundeki parantezde bulunan exception
            karsilasmayi bekledigimiz exception olmalidir

            (InputMismatchException e)
            bu kod su anlama gelir
            Eger try blogunda kodlari calistirirken
            InputMismatchException olusursa
            hata raporunu e objesine kaydet
            ve catch blogunu calistir
            catch() {  }

            try blogunda exception olusmazsa
            catch blogunun calismasina gerek olmaz
            (yangin yoksa, yangin sondurme tupunu kullanmaya gerek yok)


         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki tamsayi giriniz...");

        int sayi1 = 0;
        int sayi2 = 0;

        try {

            sayi1 = scanner.nextInt();
            sayi2 = scanner.nextInt();

            if (sayi2 == 0){
                System.out.println("bolecek sayi 0 olamaz");
            } else {
                System.out.println(sayi1 / sayi2);
            }

        } catch (InputMismatchException e) {

            System.out.println("Girilen deger tamsayi olmalidir");

        }



    }
}
