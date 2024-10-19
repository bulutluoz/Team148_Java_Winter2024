package practice.day02;

public class P05_Increment {

    public static void main(String[] args) {
        int sayi=20;
        System.out.println(sayi); // 20

        // sayi=sayi+3
        sayi+=3;  //sayının değerini 3 arttır ve yeni değer olarak sayi değişkenini değiştir
        System.out.println(sayi); // 23

        int ogrenciNo=2025001;
        System.out.println("1.Öğrenci : "+ogrenciNo++); // 1. öğrenciye 2025001 değerini atar ve ogrenciNo degerini 2025002 yapar
        System.out.println("2.Öğrenci : "+ogrenciNo++); // 2. öğrenciye 2025002 değerini atar ve ogrenciNo degerini 2025003 yapar
        System.out.println("3.Öğrenci : "+ogrenciNo++); // 3. öğrenciye 2025003 değerini atar ve ogrenciNo degerini 2025004 yapar
        System.out.println("4.Öğrenci : "+ogrenciNo++); // 4. ğrenciye 2025004 değerini atar ve ogrenciNo degerini 2025005 yapar

        System.out.println(ogrenciNo); //


        int kitapNo =2025000;
        System.out.println("1.Öğrenci : "+ (kitapNo+=5)); 
        System.out.println("2.Öğrenci : "+ (kitapNo+=5));
        System.out.println("3.Öğrenci : "+ (kitapNo+=5));
        System.out.println("4.Öğrenci : "+ (kitapNo+=5));

        System.out.println(kitapNo); //
        
        
        int a=50;
        a*=3;  // a2nın yeni değeri 50*3=150 oldu
        System.out.println("a = " + a); // 150

        a/=5;   // a'nın yeni değeri 150/5=30 oldu
        System.out.println("a = " + a); // 30


        double c=23.12;
        c-=5;  //double integer degerleri kapsadığı için sorun olmadı (c=c-5.0)
        System.out.println("c = " + c);


        int d=128;
        d+=10.35;
        System.out.println("d = " + d);






    }
}
