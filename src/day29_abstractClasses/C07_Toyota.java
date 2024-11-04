package day29_abstractClasses;

public abstract class C07_Toyota extends C06_Araba{
    // Class 'C07_Toyota' must either be declared abstract
    // or implement abstract method 'motor()' in 'C06_Araba'
    /*
        Bir class olusturdugumuzda
        abstract olup olmamasina
        o class'dan obje olusturulup-olusturulmayacagina gore karar veririz

        Toyota markasina sahip ama modeli olmayan
        bir obje OLMAYACAGI icin
        bu class'in abstract olmasi daha dogru olacaktir

        Abstract bir parent'in abstract olan child'i
        parent class'daki abstract method'lari
        implement etmek ZORUNDA DEGILDIR
        AMMMA isterse klasik inheritance kurallari cercevesinde
        parent class'daki abstract method'lari override edebilir

     */


    // public abstract void motor();
    // parent class'daki abstract method'u tekrar yazmaya gerek yok
    // ya yeni kurallar koyar
    // veya var olan kurallari concrete yapip kendisine uyarlar

    public void motor(){
        System.out.println("Toyota araclar toyota VVTI motoru kullanir");
    }

    public void guvenlik(){
        System.out.println("Toyota araclar NCAP'e uyar");
    }

    public abstract void sesSistemi();

    public abstract void direksiyor();

    public void sunroof(){
        System.out.println("Toyota araclarda ozel toyota sunroof kullanilir");
    }

}
