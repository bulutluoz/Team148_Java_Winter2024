package practice.day02;

import java.util.Scanner;

public class P04_switchStatements {
    public static void main(String[] args) {
// Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
// 1. 0()dahil ile 50 arasi - D
// 2. 50(dahil) ile 60 arası - C
// 3. 60(dahil) ile 80 arası - B
// 4. 80(dahil) ustu- A
// Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
// switch() kullanarak yapiniz.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yıl Sonu notunuzu giriniz");
        int not=scanner.nextInt();

        switch(not/10){
            case 10:
            case 9:
            case 8:
                System.out.println("A");
                break;
            case 7:
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("D");
                break;
            default:
                System.out.println("Gerçersiz bir not girdiniz");
        }

        // switch()'de long,float,double ve boolean kullanılmaz
        // byte, short,int, char ve String kullanılır



    }
}
