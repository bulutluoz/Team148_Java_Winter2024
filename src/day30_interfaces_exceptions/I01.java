package day30_interfaces_exceptions;

public interface I01 {

    String str = "I01 str";
    int sayi = 45;
    boolean izindeMi = true;

    // void method1(){};
    // Interface abstract methods cannot have body

    void method1();

    void method3();

    //void method4();

    // void method7();
    // Bir interface'e sonradan bir abstract method eklediginizde
    // o interface'i implement etmis olan TUM CHILD CLASS"lar bundan etkilenir
    // tum child class'larin bu yeni method'u kendisine uyarlamasi gerekir
    // bu da bitmis bir proje de negatif etkiler olusturabilir
}





















