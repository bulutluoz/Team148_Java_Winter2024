package day25_encapsulation_inheritance;

public class C08_Araba {

    /*
        Bazi class'lar obje olusturmak icin degil
        child class'larin hepsinde olan ORTAK OZELLIKLERI toplayip
        bir CATI CLASS olmak icin olusturulur

        Bu class'dan hic obje olusturulmayacagi icin
        ve cok farkli child class'lari olacagi icin
        variable'lara deger atamasak da olur

     */

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public String motor = "Motor secenegi belirtilmedi";
    public String sanzuman = "Sanzuman secilmedi";
    public String kasa = "Kasa secilmedi";
}
