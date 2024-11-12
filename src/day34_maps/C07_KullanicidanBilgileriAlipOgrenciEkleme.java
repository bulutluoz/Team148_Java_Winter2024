package day34_maps;

public class C07_KullanicidanBilgileriAlipOgrenciEkleme extends MapDepo{

    public static void main(String[] args) {

        // Kullanicidan numara, isim, soyisim, sinif, sube ve bolum bilgilerini alip
        // ogrenciyi map'e kaydeden bir method olusturun

        kullaniciyaYeniOgrenciOlusturtma();


        System.out.println(ogrenciMap);

        /*
            Java Run Time Program'dir
            Her Run tusuna bastigimizda hersey sifirdan baslar
            kodun calismasi DURUNCAYA KADAR
            yapilan degisiklikler KALICIDIR

            AMMMAAA kod durdugu anda HERSEY SIFIRLANIR
         */

        soyisimdenListeYazdir("Cem");
        bolumListesiYazdir("Mf");

    }
}
