package day31_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C08_MultipleCheckedExceptions {

    public static void main(String[] args) {

        /*
            FileInputStream fileInputStream olusturdugumuzda
            Java Ya dosyayi bulamazsam dedi,
            biz de try catch ile sarmalayip
            FileNotFoundException'i kontrol altina aldik

            Ancak fileInputStream.read() yazdigimizda
            bu defa da IOException riski barindirdigi icin altini kirmizi cizdi

            IOException, FileNotFoundException'in parent'i oldugundan
            islem yaparken bu iliskiyi dikkate almaliyiz
            1- eger ikisini de ayri catch cumleleri ile yazacaksak
               uste child exception yazilmalidir

            2- eger ikisini ayri ayri yazmak istemezsek
               sadece parent olan IO exception'i yazmamiz yeterli olacaktir
               cunku IOException ikisini de kapsar

         */


        // notlar dosyasindaki yazilari konsolda yazdirin

        String dosyaYolu = "src/day31_exceptions/notlar.txt";
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream(dosyaYolu);
            // dosyadaki yazilari konsolda yazdirin

            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Verilen dosya yolu hatali...");

        } catch (IOException e) { // IO ==> Input Output
            System.out.println("Dosyadaki degerler okunamiyor");
        }
    }
}
