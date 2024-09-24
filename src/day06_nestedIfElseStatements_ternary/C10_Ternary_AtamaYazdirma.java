package day06_nestedIfElseStatements_ternary;

public class C10_Ternary_AtamaYazdirma {

    public static void main(String[] args) {


        // ternary tek basina kullanilmaz
        // ya sout icinde kullanilmali
        // veya bir variable'a atanmalidir

        int sayi = 20;

       //  sayi> 30 ? "guzel" : "tuh" ;
       //  ternary sonuc urettigi icin tek basina kullanilamaz


        // ya sout icinde kullanilmali
        System.out.println( sayi> 30 ? "guzel" : "tuh" );

        // veya bir variable'a atanmalidir
        String sonuc = sayi> 30 ? "guzel" : "tuh" ;



        // verilen bir sayinin degerini kontrol edip
        // sayi cift ise "Cift sayilari sevmem" yazdirin
        // tek sayi ise degerini 10 artirin

        // Bu soruyu da Ternary ile yapamayiz
        // cunku atama ve yazdirma ayri ayri isteniyor

        int verilenSayi = 23;

        if (verilenSayi % 2 == 0){
            System.out.println("Cift sayilari sevmem");
        } else {
           verilenSayi += 10 ;
        }



        // verilen bir sayinin degerini kontrol edip
        // sayi cift ise "Cift sayilari sevmem" yazdirin
        // tek sayi ise degerini 10 artirin ve yeni degeri yazdirin

        verilenSayi = 45;

        System.out.println( verilenSayi % 2 == 0 ? "Cift sayilari sevmem"  : (verilenSayi+=10)    );



        // verilen 3 basamakli bir sayinin degerini kontrol edip
        // 500'den buyukse rakamlar toplamini yazdirin
        // 500'den buyuk degilse 10'lar basamagindaki rakami yazdirin

        // Bu tur uzun islem gerektiren gorevler de Ternary ile YAPILAMAZ


    }
}
