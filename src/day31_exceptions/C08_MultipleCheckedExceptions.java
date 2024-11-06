package day31_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C08_MultipleCheckedExceptions {

    public static void main(String[] args) {

        // notlar dosyasindaki yazilari konsolda yazdirin

        String dosyaYolu = "src/day31_exceptions/notlar.txt";
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream(dosyaYolu);

        } catch (FileNotFoundException e) {
            System.out.println("Verilen dosya yolu hatali...");

            // dosyadaki yazilari konsolda yazdirin

            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                // Unhandled exception: java.io.IOException
                System.out.print((char) k);
            }
        }
    }
}
