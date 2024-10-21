package day21_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C06_List_PassByValue {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("Cansu","Dilan","Bahadir","Maya"));

        birIsimEkle(isimler); // Method'da listenin yeni hali : [Cansu, Dilan, Bahadir, Maya, Hamza]

        System.out.println("Main method'da method call'dsan sonra isimler : " + isimler);
        // Main method'da method call'dsan sonra isimler : [Cansu, Dilan, Bahadir, Maya, Hamza]

        yeniListeOlustur(isimler); // 2.Method'da listenin yeni hali : [Ruya]

        System.out.println("Main method'da 2. method call'dsan sonra isimler : " + isimler);
        // Main method'da method call'dsan sonra isimler : [Cansu, Dilan, Bahadir, Maya, Hamza]

    }



    public static void birIsimEkle(List<String> isimler){
        // verilen isimler listesine kullanicidan bir isim isteyip ekleyin
        // ve yeni halini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen listeye eklenecek bir isim giriniz...");

        isimler.add(scanner.nextLine());

        System.out.println("Method'da listenin yeni hali : " + isimler);
    }

    public static void yeniListeOlustur(List<String> isimler){
        // verilen isimler listesine yeni bos bir liste atayan
        // sonra kullanicidan bir isim alip listeye ekleyen
        // ve listenin son halini yazdiran bir method olusturun

        isimler = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen listeye eklenecek bir isim giriniz...");

        isimler.add(scanner.nextLine());

        System.out.println("2.Method'da listenin yeni hali : " + isimler);


    }
}
