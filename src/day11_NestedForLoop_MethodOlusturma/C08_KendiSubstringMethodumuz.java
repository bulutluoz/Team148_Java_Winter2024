package day11_NestedForLoop_MethodOlusturma;

public class C08_KendiSubstringMethodumuz {

    public static void main(String[] args) {

        String str = "Java Candir";

        int basIndex = 2;
        int bitIndex = 6;

        /*
            Kullanicidan alinan bir metinden
            kullanicinin girdigi baslangic ve bitis indexleri arasindaki kismi yazdirin

            Kurallar :
            1- eger baslangic veya bitis index'i metnin sinirlari disinda ise hata verin
            2- baslangic index'i bitis index'inden buyukse hata mesaji verin
            3- baslangic indexindeki karakter dahil, bitis indexindeki karakter haric olmalidir

         */


        if (basIndex>str.length() || bitIndex>str.length()){
            System.out.println("Verilen index'ler metnin sinirlari disindadir");
        } else if (basIndex>bitIndex) {
            System.out.println("Baslangic index'i bitis index'inden buyuk olamaz");
        }else {

            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(str.charAt(i));
            }
        }


        System.out.println(str.substring(basIndex, bitIndex));


    }
}
